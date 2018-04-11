<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="entity.NhanVien"%>
 <!-- khia bao de import vao -->
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="resources/Styles/style.css"> cach cũ  -->
<jsp:include page="header.jsp"></jsp:include>

</head>
<body>
	<h1 id="map">Chao cac ban</h1>
	${name}
	
	<hr>
	<a href="chitiet">Chi tiết</a>
	<hr>
	
	<div class="container">
		<div class="alert alert-success" role="alert">
		  <h4 class="alert-heading">Well done!</h4>
		  <p>Aww yeah, you successfully read this important alert message. This example text is going to run a bit longer so that you can see how spacing within an alert works with this kind of content.</p>
		  <p class="mb-0">Whenever you need to, be sure to use margin utilities to keep things nice and tidy.</p>
		</div>
		<p >red</p>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>