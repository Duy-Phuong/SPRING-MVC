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
			<form method="post" action="" >
			  Name:<br>
			  <input type="text" name="name" class="email"><br>
			   Pass:<br>
			  <input type="password" name="pass" class="pass"><br>
			  
			  <br>
			  <input type="submit" value="Submit" id="button">
			   <span id="dangnhap"> DANG NHAP</span> 
			</form>
			
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