<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
</head>
<body>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index">
						<li><a href="products.html"><span
								class="icon-chevron-right"></span>${danhmuc.ten_dm }</a></li>
					</c:forEach>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg"/>"
					alt="payment method paypal"></a>
			</div>

		</div>
		<div class="span9">

			<div class="row">
				<div class="span4" style="width: 100%;">
					<div class="well" style="width: 90%; height: 350px">
						<h3 style="text-align: center">Đăng ký tài khoản</h3>
						<form:form action="dang-ky" method="POST" modelAttribute="user" enctype="multipart/form-data">
							<table style="margin-left: 25%">
								<tr>
									<td>Email:</td>
									<td><form:input type="email" path="email_kh" class="span3"
											placeholder="Mời nhập email" /></td>
								</tr>
								<tr>
									<td>Họ và tên:</td>
									<td><form:input type="text" path="ten_kh" class="span3"
											placeholder="Mời nhập họ và tên" /></td>
								</tr>
								<tr>
									<td>SĐT:</td>
									<td><form:input type="text" path="sdt" class="span3"
											placeholder="Mời nhập SDT" /></td>
								</tr>
								<tr>
									<td>Địa chỉ:</td>
									<td><form:input type="text" path="diachi" class="span3"
											placeholder="Mời nhập địa chỉ" /></td>
								</tr>
								<tr>
									<td>Mật khẩu:</td>
									<td><form:input type="password" path="pass" class="span3"
											placeholder="Mời nhập mật khẩu" /></td>
								</tr>
								<tr>
									<td></td>
									<td><button type="submit" class="btn block">Đăng
											ký thành viên</button></td>
								</tr>
							</table>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
			</div>

		</div>
	</div>
</body>
</html>