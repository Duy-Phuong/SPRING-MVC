<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application </title>
</head>
 
<body>
<h2>Struts 2 - Upload file demo</h2>
<s:form action="fileUpLoad" method="post" enctype="multipart/form-data">
        <s:file name="photo" label="Choose file to upload" />
        <s:submit value="upload" align="center" />
</s:form>
 
<br>
Username: admin, password: admin123
<br/>
<s:a href="index.jsp">index.jsp ex</s:a>
<br/>
<!-- o trang index.jsp click ngoai action ms ok -->

</body>
</html>