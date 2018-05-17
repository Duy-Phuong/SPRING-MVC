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
<!-- navbar bs3 ok 
<nav class="navbar navbar-default">
  <div class="container-fluid">

    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

     Collect the nav links, forms, and other content for toggling 
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>

-->	
	<!-- bat dau header -->
	<div id="header" class="container-fluid">
				
		<nav class="navbar navbar-expand-lg navbar-light">
		  <a class="navbar-brand" href="#"><img src='<c:url value="/resources/img/brand.png"/>'></a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
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
			<div class="row">
			<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
				
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 wow bounceIn">
				<div class="jumbotron text">
			  	<h1 class="wow bounceInDown " data-wow-duration="1s">Vina Shop</h1> 
			  	<p class="wow bounceInDown " data-wow-duration="1s">Chào mừng bạn đến website của chúng tôi</p> 
			  <button class="btn btn-success wow bounceInDown " data-wow-duration="1.5s">See more</button>
			  
			</div>
			</div>
			<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
				
			</div>
		</div>
		</div>
</div>
	<!-- ket thuc header -->
	
	
	<!-- bat dau phia duoi -->
	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 wow fadeInLeft icon"  data-wow-duration="0.5s">
				<img class="icon" src='<c:url value="/resources/img/icon_chatluong.png" />'/><br/>
				<span style="font-size: 32px; font-weight: 500;">CHẤT LƯỢNG</span><br/>
				<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng sản phẩm tốt nhất</span>
			</div>
			
			<div class="col-12 col-sm-4 col-md-4 wow fadeInDown icon" data-wow-duration="0.5s" data-wow-delay="1s">
				<img class="icon" src='<c:url value="/resources/img/icon_conheo.png"/>'/><br/>
				<span style="font-size: 32px; font-weight: 500;">TIẾT KIỆM CHI PHÍ</span><br/>
				<span>Cam kết giá rẻ nhất Việt Nam giúp các bạn tiết kiệm hơn 20%cho từng sản phẩm</span>
			</div>
			
			<div class="col-12 col-sm-4 col-md-4 wow fadeInRight icon" data-wow-duration="0.5s" data-wow-delay="2s">
				<img class="icon" src='<c:url value="/resources/img/icon_giaohang.png"/>'/><br/>
				<span style="font-size: 32px; font-weight: 500;">GIAO HÀNG</span><br/>
				<span>Cam kết giao hàng tận nơi trong ngày. Để mang sản phẩm đến cho khách hàng nhanh nhất</span>
			</div>
		</div>
		
	</div>
	<!-- end -->
	<div class="title"> SẢN PHẨM HOT</div>
	
	<!-- begin sp -->
	
	
		<div class="container">
			<div class="row">
			<c:forEach var="sanpham" items="${listSanPham}">
				<div class="col-sm-6 col-md-4 wow bounceInUp" data-wow-delay="0.1s">
				<a href="chitiet/${sanpham.getMasanpham()}"> <!-- ?masanpham=${sanpham.getMasanpham()} -->
					
					<div class="tinto">
						<img alt="hinh" src='<c:url value="/resources/img/sanpham/${sanpham.getHinhsanpham() }"/>'  class="layer1"  />
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">${sanpham.getTensanpham()}</div>
						<div class="chunho">${sanpham.getGiatien() } VND</div>
					</div>
				</a>
				</div>
			</c:forEach>
		</div>
	</div>
<!--				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="0.1s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</div>
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="0.3s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample2.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing elit</div>
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="0.5s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing elit</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="0.7s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample2.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing eli</div>
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="0.9s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</div>
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow bounceInUp" data-wow-delay="1.1s">
					
					<div class="tinto">
						<img src='<c:url value="/resources/img/sample2.jpg"/>' class="layer1" alt="c">
						<div class="xam"></div>
						<div class="gradient"></div>
						<div class="hinhvuong"></div>
						<div class="chuto">the picture</div>
						<div class="chunho">Lorem ipsum dolor sit amet, consectetur adipisicing elit</div>
					</div>
				</div>
			</div>
		</div>
		-->
	<!-- end sp -->
	
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