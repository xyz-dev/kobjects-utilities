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
 
package org.kobjects.lcdui;

import javax.microedition.lcdui.*;


/** A class supporting word wrap for MIDP. */

public class WordWrap {

    Font font;
    int width;
    String txt;
    int pos;


    /**
     * Initializes the WordWrap object with the given Font, the text string
     * to be wrapped, and the target width.
     * 
     * @param font: The Font to be used to calculate the character widths.
     * @param txt: The text string to be wrapped.
     * @param width: The line width.
     */

    public WordWrap (Font font, String txt, int width) {

	this.font = font;
	this.txt = txt;
	this.width = width;
    }


    /**
     * returns the next line break position. If no text is left, -1 is returned.
     */

    public int next () {

	int i = pos;
	int len = txt.length ();

	if (pos >= len) return -1;

	int start = pos;

	while (true) {
	    while (i < len && txt.charAt (i) > ' ')
		i++;

	    int w = font.stringWidth (txt.substring (start, i));
	    if (pos == start) {
                if (w > width) {
                    while (font.stringWidth (txt.substring (start, --i)) > width)
                    { }
                    pos = i;
                    break;
                }
            }

            if (w <= width) pos = i;

	    if (w > width || i >= len || txt.charAt(i) == '\n') break;
	    i++;
	}

	return pos >= len ? pos : ++pos;
    }

}
