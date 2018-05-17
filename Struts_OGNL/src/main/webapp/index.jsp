<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application </title>
</head>
 
<body>
<h2>Struts 2 - Login Application</h2>
<b>Array Usage Examples</b>
<br><hr>
<b>sampleArray :</b> <s:property value="sampleArray"/> <br>
<b>sampleArray.length :</b> <s:property value="sampleArray.length"/> <br>
<b>sampleArray[0] :</b> <s:property value="sampleArray[0]"/> <br>
<b>[0].sampleArray :</b> <s:property value="[0].sampleArray"/> <br>
<b>top.sampleArray :</b> <s:property value="top.sampleArray"/> <br>
 
 
 <b>List Usage Examples</b>
<br><hr>
<b>sampleList :</b> <s:property value="sampleList"/> <br>
<b>sampleList.size :</b> <s:property value="sampleList.size"/> <br>
<b>sampleList[0] :</b> <s:property value="sampleList[0]"/> <br>


<b>Map Usage Examples</b>
<br><hr>
<b>sampleMap[1] :</b> <s:property value="sampleMap[1]"/> <br>
<b>sampleMap.size :</b> <s:property value="sampleMap.size"/> <br>

<s:select list="#{'make1':'Ford', 'make2':'Honda', 'make3':'Toyota'}" name="carMake" label="Select "></s:select>


<b>user.name :</b> <s:property value="user.name"/> <br>

<b>quote() :</b> <s:property value="quote()"/> <br>

</body>
</html>