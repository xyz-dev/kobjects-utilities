



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- ViewVC :: http://www.viewvc.org/ -->
<head>
<title>SourceForge.net Repository - [kobjects] Log of /kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java</title>
<meta name="generator" content="ViewVC 1.1.6" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="The world's largest development and download repository of Open Source code and applications" />
<meta name="keywords" content="Open Source, Development, Developers, Projects, Downloads, OSTG, VA Software, SF.net, SourceForge" />
<title>SourceForge.net Repository - kobjects Index of /</title>
<link rel="shortcut icon" href="http://a.fsdn.com/con/img/favicon.ico" />
<link rel="stylesheet" href="http://a.fsdn.com/con/css/sf.min.css?1256826599" type="text/css" />
<link rel="stylesheet" href="/viewvc-static/styles.css" type="text/css" />
<style type="text/css"> .short-head #hd { background-position:0 -247px; } #hd .yui-b { height:47px; margin:0 auto; position:relative; text-align:left; width:74.923em; } pre.vc_log { margin:1em; }</style>

<!-- BEGIN: AdSolution-Tag 4.2: Global-Code [PLACE IN HTML-HEAD-AREA!] -->
<!-- DoubleClick Random Number -->
<script language="JavaScript" type="text/javascript">
dfp_ord=Math.random()*10000000000000000;
dfp_tile = 1;
</script>
<!-- End DoubleClick Random Number -->
<script type="text/javascript">
var google_page_url = 'http://sourceforge.net/projects/kobjects/';
var sourceforge_project_name = 'kobjects';
var sourceforge_project_description = '';
</script>
<!-- END: AdSolution-Tag 4.2: Global-Code -->
<!-- after META tags -->
<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
</head>
<body class="short-head">
<!--[if IE 7]><div id="ie7only"><![endif]-->
<!--[if IE 6]><div id="ie6only"><![endif]-->
<!--[if IE]><div id="ieonly"><![endif]-->
<div id="doc3">
<div id="hd">
<div class="yui-b">
<div class="yui-gc">
<div class="yui-u first">
<a href="http://sourceforge.net/" class="logo">Find and develop open source software</a>
</div>
<div class="yui-u">
<div class="search">
<form action="http://sourceforge.net/search/" method="get" name="searchform" id="searchform">
<input type="hidden" name="type_of_search" value="soft" />
<input type="text" class="text clear hint" name="words" id="words" value="enter keyword" />
<span class="yui-button yui-push-button default"><span class="first-child"><button type="submit" value="Search">Search</button></span></span>
</form>
</div>
</div>
</div>
</div>
</div>
<div id="bd" class="inner-bd">
<div id="doc4" class="yui-t6">
<div id="breadcrumbs">

<a href="http://sourceforge.net/">SourceForge.net</a>
&gt; <a href="http://sourceforge.net/softwaremap/">Find Software</a>
&gt; <a href="http://sourceforge.net/projects/kobjects/">kobjects</a>
&gt; SCM Repositories


<a href="/viewvc/kobjects/">


&gt; kobjects


</a>



<a href="/viewvc/kobjects/kobjects/">


&gt; kobjects


</a>



<a href="/viewvc/kobjects/kobjects/src/">


&gt; src


</a>



<a href="/viewvc/kobjects/kobjects/src/org/">


&gt; org


</a>



<a href="/viewvc/kobjects/kobjects/src/org/kobjects/">


&gt; kobjects


</a>



<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/">


&gt; xmlrpc


</a>




&gt; XmlRpcParser.java




</div>










<div id="project_nav_container">
<small><div>

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/"><img src="/viewvc-static/images/back_small.png" width="16" height="16" alt="Parent Directory" /> Parent Directory</a>

| <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log"><img src="/viewvc-static/images/log.png" width="16" height="16" alt="Revision Log" /> Revision Log</a>




</div>
</small>
<h1>SCM Repositories - <a href="http://sourceforge.net/projects/kobjects">kobjects</a></h1>
</div>
<hr class="clear">
<div class="yui-b">
<div id="fad83">
<!-- DoubleClick Ad Tag -->
<script type="text/javascript">
//<![CDATA[
document.write('<script src="http://ad.doubleclick.net/adj/ostg.sourceforge/pg_viewvc_p88_shortrec;pg=viewvc;tile='+dfp_tile+';tpc=kobjects;ord='+dfp_ord+'?" type="text/javascript"><\/script>');
dfp_tile++;
//]]>
</script>
<!-- End DoubleClick Ad Tag -->
</div>
</div>
<div id="yui-main">
<div class="yui-b sfBox">
<table class="auto">



<tr>
<td>Links to HEAD:</td>
<td>

(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=markup">view</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=annotate">annotate</a>)
mime-type: text/x-java
</td>
</tr>



<tr>
<td>Sticky Tag:</td>
<td><form method="get" action="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java" style="display: inline">
<div style="display: inline">
<input type="hidden" name="view" value="log"/>


<select name="pathrev" onchange="submit()">
<option value=""></option>

<optgroup label="Branches">


<option>MAIN</option>


</optgroup>

<optgroup label="Non-branch tags">


<option>HEAD</option>


</optgroup>

</select>

<input type="submit" value="Set" />
</div>
</form>

</td>
</tr>
</table>
 


</div>
</div>
<hr class="clear">
<div>






<div>
<hr />

<a name="rev1.7"></a>
<a name="HEAD"></a>


Revision <strong>1.7</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.7&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.7">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.7&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.7">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.7&amp;view=log">[select for diffs]</a>




<br />

<em>Wed Dec  8 22:14:15 2004 UTC</em>
(6 years, 1 month ago)
by <em>haustein</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>



<br />CVS Tags:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=HEAD"><strong>HEAD</strong></a>






<br />Changes since <strong>1.6: +1 -1 lines</strong>








<br />Diff to <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.6&amp;r2=1.7">previous 1.6</a>










<pre class="vc_log">fix for xmlrpc empty value null pointer issue reported by Tupshin Harper
</pre>
</div>



<div>
<hr />

<a name="rev1.6"></a>


Revision <strong>1.6</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.6&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.6">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.6&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.6">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.6&amp;view=log">[select for diffs]</a>




<br />

<em>Mon Dec  8 20:51:14 2003 UTC</em>
(7 years, 1 month ago)
by <em>haustein</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>







<br />Changes since <strong>1.5: +0 -0 lines</strong>








<br />Diff to <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.5&amp;r2=1.6">previous 1.5</a>










<pre class="vc_log">re-entry of files deleted by mistake
</pre>
</div>



<div>
<hr />

Revision <strong>1.5</strong>


<br />

<em>Sun Nov 30 22:51:56 2003 UTC</em>
(7 years, 1 month ago)
by <em>haustein</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>







<br />Changes since <strong>1.4: +0 -0 lines</strong>






<br /><strong><em>FILE REMOVED</em></strong>

<pre class="vc_log">*** empty log message ***
</pre>
</div>



<div>
<hr />

<a name="rev1.4"></a>


Revision <strong>1.4</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.4&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.4">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.4&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.4">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.4&amp;view=log">[select for diffs]</a>




<br />

<em>Tue Oct 28 16:04:19 2003 UTC</em>
(7 years, 2 months ago)
by <em>haustein</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>







<br />Changes since <strong>1.3: +6 -6 lines</strong>








<br />Diff to <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.3&amp;r2=1.4">previous 1.3</a>










<pre class="vc_log">XmlReader eclipse warnings removed, CSV decoding issue fixed
</pre>
</div>



<div>
<hr />

<a name="rev1.3"></a>


Revision <strong>1.3</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.3&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.3">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.3&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.3">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.3&amp;view=log">[select for diffs]</a>




<br />

<em>Fri Jul 11 14:48:42 2003 UTC</em>
(7 years, 6 months ago)
by <em>taweili</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>







<br />Changes since <strong>1.2: +5 -3 lines</strong>








<br />Diff to <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.2&amp;r2=1.3">previous 1.2</a>










<pre class="vc_log">Fix the copyright thing
</pre>
</div>



<div>
<hr />

<a name="rev1.2"></a>


Revision <strong>1.2</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.2&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.2">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.2&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.2">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.2&amp;view=log">[select for diffs]</a>




<br />

<em>Fri Jul 11 14:47:46 2003 UTC</em>
(7 years, 6 months ago)
by <em>taweili</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>







<br />Changes since <strong>1.1: +107 -62 lines</strong>








<br />Diff to <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.1&amp;r2=1.2">previous 1.1</a>










<pre class="vc_log">Move nextTag and nextText to here
</pre>
</div>



<div>
<hr />

<a name="rev1.1"></a>


Revision <strong>1.1</strong> -


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.1&amp;view=markup">view</a>)


(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.1">download</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?revision=1.1&amp;content-type=text%2Fplain">as text</a>)
(<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?annotate=1.1">annotate</a>)



- <a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?r1=1.1&amp;view=log">[select for diffs]</a>




<br />

<em>Fri Jul 11 13:01:47 2003 UTC</em>
(7 years, 6 months ago)
by <em>taweili</em>


<br />Branch:

<a href="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java?view=log&amp;pathrev=MAIN"><strong>MAIN</strong></a>

















<pre class="vc_log">XML-RPC parser
</pre>
</div>

 



 <div class="sfBox">
<hr class="clear"/>
<a name="diff"></a>
This form allows you to request diffs between any two revisions of this file.
For each of the two "sides" of the diff,

select a symbolic revision name using the selection box, or choose
'Use Text Field' and enter a numeric revision.

<form method="get" action="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java" id="diff_select">
<table cellpadding="2" cellspacing="0" class="auto">
<tr>
<td>&nbsp;</td>
<td>

<input type="hidden" name="view" value="diff"/>

Diffs between

<select name="r1">
<option value="text" selected="selected">Use Text Field</option>

<option value="1.7:MAIN">MAIN</option>

<option value="1.7:HEAD">HEAD</option>

</select>
<input type="text" size="12" name="tr1"
value="1.7"
onchange="document.getElementById('diff_select').r1.selectedIndex=0" />

and

<select name="r2">
<option value="text" selected="selected">Use Text Field</option>

<option value="1.7:MAIN">MAIN</option>

<option value="1.7:HEAD">HEAD</option>

</select>
<input type="text" size="12" name="tr2"
value="1.1"
onchange="document.getElementById('diff_select').r2.selectedIndex=0" />

</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
Type of Diff should be a
<select name="diff_format" onchange="submit()">
<option value="h" selected="selected">Colored Diff</option>
<option value="l" >Long Colored Diff</option>
<option value="f" >Full Colored Diff</option>
<option value="u" >Unidiff</option>
<option value="c" >Context Diff</option>
<option value="s" >Side by Side</option>
</select>
<input type="submit" value=" Get Diffs " />
</td>
</tr>
</table>
</form>
</div>


<form method="get" action="/viewvc/kobjects/kobjects/src/org/kobjects/xmlrpc/XmlRpcParser.java">
<div>
<hr />
<a name="logsort"></a>
<input type="hidden" name="view" value="log"/>
Sort log by:
<select name="logsort" onchange="submit()">
<option value="cvs" >Not sorted</option>
<option value="date" selected="selected">Commit date</option>
<option value="rev" >Revision</option>
</select>
<input type="submit" value=" Sort " />
</div>
</form>


<br />
</div>
</div>
</div>
<div id="ft">
<div class="yui-b">
<div class="yui-gb">
<div class="yui-u first" style="text-align: center;"> <a href="http://p.sf.net/sourceforge/support">SourceForge Help<a/> </div>
<div class="yui-u" style="text-align: center;"> <strong><a href="/viewvc-static/help_log.html">ViewVC Help</a></strong> </div>
<div class="yui-u" style="text-align: center;"> <a href="http://viewvc.tigris.org/">Powered by ViewVC 1.1.6</a> </div>
</div>
<p class="copyright">Copyright &copy; 2010 <a title="Network which provides and promotes Open Source software downloads, development, discussion and news." href="http://geek.net">Geeknet, Inc.</a> All rights reserved. <a href="http://p.sf.net/sourceforge/terms">Terms of Use</a></p>
</div>
</div>
</div>
<!--[if IE]></div><![endif]-->
<!--[if IE 6]></div><![endif]-->
<!--[if IE 7]></div><![endif]-->
<script type="text/javascript">
var pageTracker = _gat._getTracker("UA-32013-37");
pageTracker._setDomainName(".sourceforge.net");
pageTracker._trackPageview();
</script>
</body>
</html>


