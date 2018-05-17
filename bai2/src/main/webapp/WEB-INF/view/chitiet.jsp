<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Đây là trang chi tiết</h2>
	<h2>${id}</h2> 
	<h2>${name}</h2> 
	<hr>
	<h2>${nv.getTenNhanVien() }</h2>
	<h2>${nv.getTuoi() }</h2>
	<h2>${nv.getDiaChi() }</h2>
</body>
</html>