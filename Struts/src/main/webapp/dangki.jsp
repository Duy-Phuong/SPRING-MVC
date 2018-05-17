<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="dangki" method="post">
		<s:textfield label="Username" name="username"></s:textfield>
		<br/>
		<s:password label="Pass" name="password"></s:password>
		<s:submit value="Save"></s:submit>
	</s:form>
	<h3>${message}</h3>
	user: phuong - pass = 123
</body>
</html>