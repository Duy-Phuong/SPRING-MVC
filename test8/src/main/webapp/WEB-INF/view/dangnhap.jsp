<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- phai ra 1 cap neu k no co them chu dang nhap se k an -->
<jsp:include page="header.jsp"></jsp:include>

</head>
<body id="body-login">
		<!--  <h2 id="map">Trang dang nhap</h2> -->
		<!-- goi lai chinh no ne k can truyen vao -->
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">
					<div id="top">
						<span>WELCOME</span>
						<span>Chào mừng bạn đến với website của chúng tôi</span>
					</div>
					<div id="bot">
						<p><img alt="ss" src='<c:url value="/resources/img/icon_oval.png"/>'/><span>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur </span></p>
						<p><img alt="ss" src='<c:url value="/resources/img/icon_oval.png"/>'/><span> modi perspiciatis delectus, sequi quae eaque dolore provident adipisci quam vel</span></p>
						<p><img alt="ss" src='<c:url value="/resources/img/icon_oval.png"/>'/><span>quidem vero nobis earum iste labore enim suscipit, sapiente nesciunt.</span></p>
					</div>
			</div>	
			<div id="container-login-right">
			<div id="top1"><span id="header-top-left" class="active">Đăng nhập</span>/ <span id="header-top-right">Đăng kí</span></div>
			<div class="dangnhaptk">
				<form action="" > <!-- method="post" -->
				  Name:<br>
				  <input type="text" name="name" class="email" id="name"><br>
				   Pass:<br>
				  <input type="password" name="pass" class="pass" id="pass"><br>
				  
				  <br>
				  <!--  <input type="submit" value="Submit" class="button"> -->
				   <span id="dangnhap"  class="button btn btn-success"> ĐĂNG NHẬP</span>
			 
				</form>
			</div>
					<br>
			<div class="dangkitk">
				<form action="" method="post"> <!-- method="post" -->
				  Name:<br>
				  <input type="text" name="name1" class="email" id="name1"><br>
				   Pass:<br>
				  <input type="password" name="pass1" class="pass" id="pass1"><br>
				   Nhập lại Pass:<br>
				  <input type="password" name="pass2" class="pass" id="pass2" placeholder="Nhập lại mật khẩu"><br>
				  <br>
				   <input type="submit" value="ĐĂNG KÍ" class="button btn btn-success">
				  <!--  <span id="dangnhap"  class="button btn btn-success"> ĐĂNG KÍ</span> -->
			 
				</form>
			</div>
			  <!-- <span id="dangnhap"> DANG NHAP</span>  -->
			   <span id="ketqua"> </span> 
			   <span>bai 65 ten dang nhap: ${name } </span>
			   <span>bai 65 ten dang nhap session: ${email } </span>
			<p style="text-align: center; color: red;">${msg}</p>
			
			<div id="hinh">
				<img alt="ss" src='<c:url value="/resources/img/icon_facebook.png"/>'/>
				<img alt="ss" src='<c:url value="/resources/img/icon_google.png"/>'/>
			</div>
			</div>
			
			
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>