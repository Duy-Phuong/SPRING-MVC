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
	<%
		int a =3;
		int b = 6;
		int c=  a+b;
		out.print("Tong la: " + c);
	%>
	<br>
	<%= c %> 
	<br>
	<%= c %>
	
	<hr>
	<h2>Tên đăng nhập: ${tendangnhap}</h2>
	<h2>mật khẩu: ${matkhau}</h2>
	
	<%
		String ten = request.getAttribute("tendangnhap").toString(); //phai ep kieu
		ten += "00";
		
	%>
	<br>
	<%= ten %>
	
	<hr>
	<h2>Tên nhân viên(18): ${nhanvien.getTenNhanVien()}</h2>
	<%
		NhanVien vien = (NhanVien)request.getAttribute("nhanvien"); //phai ep kieu
		String name = vien.getTenNhanVien();
		
	%>
	<br>
	<h2><%= name %></h2>
	
	<hr>
	<h2>${listnhanvien}</h2>
	<br>
	
	<%
		List<NhanVien> list = (List<NhanVien>)request.getAttribute("listnhanvien"); //phai ep kieu
		for(NhanVien nv : list){
		
	%>
	<%= nv.getTenNhanVien() %> <br>
	<%
		}
		
	%>
</body>
</html>