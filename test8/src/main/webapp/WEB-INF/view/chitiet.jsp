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
<!--  <h1 id="map">Chao cac ban</h1>
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
	-->
	<!-- bat dau header -->
	<div  class="container-fluid">
				
		<nav class="navbar navbar-expand-lg navbar-light">
		  <a class="navbar-brand" href="#"><img src='<c:url value="/resources/img/brand.png"/>'></a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent1">
		  <div class="center">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item ">
		        <a class="nav-link active" href="#">Trang chủ</a>
		      </li>
		       <li class="nav-item">
		        <a class="nav-link" href="#">Sản phẩm</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Dịch vụ</a>
		      </li>
		      
		      <li class="nav-item">
		        <a class="nav-link" href="#">Liên hệ</a>
		      </li>
		     
			     
			      <c:choose>
			         
			         <c:when test = "${chucaidau != null}">
			           		 <li class="nav-item">
						        <a class="nav-link" href="dangnhap/">${chucaidau}</a>
						      </li>
			         </c:when>
			         
			         
			         <c:otherwise>
			             <li class="nav-item">
					        <a class="nav-link" href="dangnhap/">Đăng nhập</a>
					      </li>
			         </c:otherwise>
			      </c:choose>
		      
		      
		      <li class="nav-item">
		        <a class="nav-link" href="#">Đăng ký</a>
		      </li>
		     
		      <img src='<c:url value="/resources/img/cart.png"/>' id="cart">
		    </ul>
		    </div>
		   
		  </div>
		</nav>
		
		<!--  text -->
		<div class="container">
			<div class="col-sm-3 col-md-3 wow bounceInUp">
					<h3>Danh mục</h3>'
				<ul class="mymenu">
					<c:forEach var="value" items="${danhmuc }"> 
						<li><a href="#">${value.getTendanhmuc() }</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="col-sm-3 col-md-3 wow bounceInUp">
				<!--  <img src='<c:url value="/resources/img/sample.jpg"/>' class="icon" alt="c" style="width:100%;"> -->
				<img src='<c:url value="/resources/img/sanpham/${sanpham.getHinhsanpham() }"/>' alt="c" style="width:100%;"/>
			</div>
			
			
			<div class="col-sm-3 col-md-3 wow bounceInUp">
				<h3 id="tensp" data-masp="${sanpham.getMasanpham() }">${sanpham.getTensanpham() }</h3>
						<h4 id="giatien" data-value="${sanpham.getGiatien() }" style="color:red">${sanpham.getGiatien() } VND</h4>
						<table class="table">
							
							<thead>
								<tr>
									<td><h5>Màu sản phẩm</h5> </td>
									<td><h5>Size</h5></td>
									<td><h5>Số lượng</h5> </td>
								</tr>
							</thead>
							
							<tbody>
								<c:forEach var="chitietsanpham" items="${sanpham.getChitietsanpham() }">
									<tr>
										<td class="mau" data-mamau="${chitietsanpham.getMausanpham().getMamau() }">${chitietsanpham.getMausanpham().getTenmau() }</td>
										<td class="size"  data-masize="${chitietsanpham.getSizesanpham().getMasize() }">${chitietsanpham.getSizesanpham().getSize() }</td>
										<td class="soluong">${chitietsanpham.getSoluong() }</td>
										<td><button data-machitiet="${chitietsanpham.getMachitietsanpham()}" class="btn btn-success btn-giohang">giỏ hàng </button></td>
									</tr>
								</c:forEach>
								
							</tbody>
						</table>
			</div>
			<div class="col-sm-3 col-md-3 wow bounceInUp">
				<span>
					${sanpham.getMota() }
				</span>
				
				
			</div>
		</div>
</div>
	<!-- ket thuc header -->
	
	
	<!-- bat dau phia duoi -->

	
	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-md-4 wow bounceInUp">
				<p><span class="title-footer">THÔNG TIN SHOP</span></p>
				<span>Yame là một thương hiệu thời trang đầy uy tín, luôn đảm bảo chất lượng sản phẩm tốt nhất cho khách hàng.</span>
			</div>
			
			<div class="col-sm-4 col-md-4 wow bounceInUp">
				<p><span class="title-footer">LIÊN HỆ</span></p>
				<span>43 Nguyễn trãi , phường 12, quận 5  TP. Hồ Chí Minh</span>
				<span>asdfghjkh@gmail.com</span>
				<span>0934567834</span>
			</div>
			
			<div class="col-sm-4 col-md-4 wow bounceInUp">
				<p><span class="title-footer">GÓP Ý</span></p>
				<form action="" method="post">
					<input name="name" class="material-textinput" style="margin-bottom: 8px; padding-left:10px;" type="text" placeholder="  Email"/>
					<textarea name="tuoi" class="area" style="margin-bottom:8px; padding-left:10px;" rows="4" cols="40" placeholder="  Nội dung"></textarea>
					<button class="btn btn-success button1">ĐỒNG Ý</button>
				</form>
				
			</div>
		</div>
		
	</div>
	<!-- end footer -->
	<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>