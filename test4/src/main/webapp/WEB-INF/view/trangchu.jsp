<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="entity.NhanVien"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Chao cac ban</h1>
	<!-- <a href="chitiet?id=123&name=asd">Chi tiết</a> <!-- truyen dung kieu int ; neu k truyen cx báo err-->
	<!-- <a href="chitiet/123/asd">Chi tiết</a>-->
	<a href="chitiet/123">Chi tiết</a>
	<hr>
	<form action="chitiet" method="post">
	  First name:<br>
	  <input type="text" name="name" ><br>
	  <br>
	  <br><br>
	  <input type="submit" value="Submit">
	</form>
</body>
</html>