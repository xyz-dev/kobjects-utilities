/* Copyright (c) 2002,2003, Stefan Haustein, Oberhausen, Rhld., Germany
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The  above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE. */

package org.kobjects.rms;

import javax.microedition.rms.*;
import java.io.*;

/** 
 * An Rms based BTree index. Currently, the functionality is similar 
 * to a persistent hashtable. 
 * */

public class RmsIndex {

    static byte[] DUMMY = new byte[0];

    RecordStore store;
    Node root;
    int n = 32;

    String cachedKey;
    Node cachedNode;
    int cachedIndex;

    /** Node helper class */

    class Node {
        int index;
        int size;

        String[] keys = new String[n + n + 1];
        String[] values = new String[n + n + 1];
        int[] children = new int[n + n + 2];

        /** Create a new Node */

        Node() throws RecordStoreException {
            index = store.addRecord(DUMMY, 0, 0);
        }

        Node(Node split) throws RecordStoreException {
            this();
            System.arraycopy(split.keys, n + 1, keys, 0, n);
            System.arraycopy(split.values, n + 1, values, 0, n);
            System.arraycopy(split.children, n + 1, children, 0, n + 1);
            size = n;
            split.size = n;
            split.store();
            store();
        }

        /** Load the node at the given index position */

        Node(int index) throws RecordStoreException {
            this.index = index;
            byte[] data = store.getRecord(index);

            if (data == null || data.length == 0)
                return;

            try {
                DataInputStream dis =
                    new DataInputStream(new ByteArrayInputStream(data));

                size = dis.readInt();

                for (int i = 0; i < size; i++) {
                    children[i] = dis.readInt();
                    keys[i] = dis.readUTF();
                    values[i] = dis.readUTF();
                }

                children[size] = dis.readInt();
            }
            catch (IOException e) {
                throw new RuntimeException(e.toString());
            }
        }

        public void put(String key, String value) throws RecordStoreException {

            int i;
            for (i = 0; i < size; i++) {
                int cmp = key.compareTo(keys[i]);
                if (cmp == 0) {
                    values[i] = value;
                    store();
                    return;
                }
                else if (cmp < 0)
                    break;
            }

            int newIndex = 0;

            if (children[i] != 0) {
                Node child = new Node(children[i]);
                child.put(key, value);

                if (child.size < n + n + 1)
                    return;

                Node split = new Node(child);
                newIndex = split.index;

                key = child.keys[n];
                value = child.values[n];
            }

            System.arraycopy(keys, i, keys, i + 1, size - i);
            System.arraycopy(values, i, values, i + 1, size - i);
            System.arraycopy(children, i + 1, children, i + 2, size - i);

            keys[i] = key;
            values[i] = value;
            children[i + 1] = newIndex;
            size++;

            if (size < n + n + 1)
                // otherwise, store will be performed by uplink
                store();
        }

        public void store() throws RecordStoreException {

            try {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(bos);
                dos.writeInt(size);
                for (int i = 0; i < size; i++) {
                    dos.writeInt(children[i]);
                    dos.writeUTF(keys[i]);
                    dos.writeUTF(values[i]);
                }
                dos.writeInt(children[size]);
                byte[] data = bos.toByteArray();
                store.setRecord(index, data, 0, data.length);
            }
            catch (IOException e) {
                throw new RuntimeException(e.toString());
            }
        }
    }

    /** 
     * Creates a new index with the given Name 
     */

    public RmsIndex(String name) throws RecordStoreException {

        store = RecordStore.openRecordStore(name, true);
        root = store.getNumRecords() == 0 ? new Node() : new Node(1);
    }

    /**
     * Returns the value for the given key
     * 
     * @param key: The key 
     * @return String: The value associated with the key, or null if none.
     * @throws RecordStoreException
     */

    public String get(String key) throws RecordStoreException {

        Node current = root;

        while (true) {
            int i;
            for (i = 0; i < current.size; i++) {
                int cmp = key.compareTo(current.keys[i]);
                if (cmp == 0)
                    return current.values[i];
                else if (cmp < 0)
                    break;
            }
            if (current.children[i] == 0)
                return null;
            current = new Node(current.children[i]);
        }
    }

    /**
     * Assigns the given value to the given key persistently
     * 
     * @param key: The key
     * @param value: The value
     * @throws RecordStoreException
     */

    public void put(String key, String value) throws RecordStoreException {

        root.put(key, value);
        if (root.size < n + n + 1)
            return;

        // split root....

        Node left = root;
        root = new Node();

        left.index = root.index;
        root.index = 1;

        Node right = new Node(left);

        root.keys[0] = left.keys[n];
        root.values[0] = left.values[n];
        root.children[0] = left.index;
        root.children[1] = right.index;
        root.size = 1;
        root.store();
    }

    /*
     * Returns the key/value pair following the given key. 
     * The given key is not required to be contained in the index 
    
    public String[] next (String key) {
        
        throw new RuntimeException ("NYI");
        
    	//if (!key.equals (cachedKey)) { 
        //    Node cachedNode = root;
    	//}		
    }
    */

    public void close() throws RecordStoreException {
        store.closeRecordStore();
    }
}