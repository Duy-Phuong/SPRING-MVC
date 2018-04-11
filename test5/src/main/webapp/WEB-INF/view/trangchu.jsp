<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="entity.NhanVien"%>
    
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/Styles/style.css">
</head>
<body>
	<h1 id="map">Chao cac ban</h1>
	${name}
	
	<hr>
	<a href="chitiet">Chi tiết</a>
	<hr>
	<form action="chitiet" method="post" >
	  First name:<br>
	  <input type="text" name="tenNhanVien" ><br>
	   Tuoi:<br>
	  <input type="text" name="tuoi" ><br>
	   Dia chi:<br>
	  <input type="text" name="diaChi" ><br>
	  <br>
	  <br><br>
	  <input type="submit" value="Submit">
	</form>
	
	<hr>
	<h3>video 30</h3>
	
	<c:out value="${tendangnhap}"/>
	<br>
	<c:out value="${'demo'}"/>
	<br>
	
	<jsp:useBean id="giamdoc" class="entity.GiamDoc"/>
	<c:set value="Boss" target="${giamdoc}" property="chucVu"/>
	<c:out value="${giamdoc.chucVu}"/>
	
	<!-- cach 2 -->
	<p>cach 2: </p>
	<c:set  var="hoten" value="${tendangnhap} the new value"/>
	<c:out value="${hoten}"/>
	<c:remove var="hoten"/>
		<c:out value="${hoten}"/>
		
	<!-- if -->
	<p>cau lenh if</p>
	 <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <c:if test = "${salary > 2000}">
         <p>My salary is:  <c:out value = "${salary}"/><p>
      </c:if>
      <c:if test = "${tendangnhap == 'phuong'}">
         <p>ten dang nhap is true with c:if:  <c:out value = "${tendangnhap}"/><p>
      </c:if>
      
      <p>catch</p>
       <c:catch var ="catchException">
         <% int x = 5/0;%>
      </c:catch>

      <c:if test = "${catchException != null}">
         <p>The exception is : ${catchException} <br />
         There is an exception: ${catchException.message}</p>
      </c:if>
      
      <p>choose nhu switch</p>
        <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      <c:choose>
         
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
      
      <hr>
      <p>list nhan vien use foreach</p>
      <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>
      
       <c:forEach items="${listnhanvien }" var="nv">
         ten:  <c:out value = "${nv.getTenNhanVien()}"/><p>
      </c:forEach>
      
</body>
</html>