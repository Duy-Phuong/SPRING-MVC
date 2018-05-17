<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application </title>
</head>
 
<body>
<h2>Struts index.jsp</h2>
<s:actionerror />
<s:form action="cacl" method="post">
  <s:textfield label="num1" key="num1" size="20" />
  <s:textfield label="num2" key="num2" size="20" />
  <s:select label="Operator" key="operator" list="#{'1':'+','2':'-'}"></s:select>
  
  <s:submit method="execute" value="save" align="center" />
</s:form>
 
<br>
Username: admin, password: admin123
 <s:a action="hello">hello action</s:a>
<br/>

<s:a action="ht">hienthi</s:a>

<br/>

<s:a href="dangki.jsp">dangki</s:a>
<br/>

</body>
</html>