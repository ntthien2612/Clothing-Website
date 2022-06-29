<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản Phẩm</title>
</head>
<body>
<div style="margin-bottom: 300px">
	<div class="well well-small">
				<ul class="nav nav-list">
				<c:forEach var="danhmuc" items="${danhmuc }" varStatus="index" >
					<li><a href="./sanpham?id=${danhmuc.id_dm }">
					<span class="icon-chevron-right" ></span>${danhmuc.ten_dm }</a></li>
				</c:forEach>
				</ul>
			</div>
			</div>
	<c:forEach var="sanpham" items="${sanpham }" varStatus="index">
		<div>
			<ul style="list-style: none;">
				<li style="width: 150px; height: 300px; float: left; margin: 10px; border: 1px solid blue;  border-radius: 10px">
				<img style="width: 100%; height: 65%; border-radius: 10px"
					src="<c:url value= "${sanpham.hinhanh }"/>">
					<p style="color: red;text-align: center;"><b>${sanpham.ten_sp }</b></p>
					<p style="color: red;text-align: center;"><b>Giá: ${sanpham.gia } VND</b></p>
					<p style="text-align: center;"><a href="./chitietsanpham?id=${sanpham.id_sp }"><button style="border: none;   border-radius: 10px; background: blue; color: white">Chi tiết</button></a></p>
				</li>
			</ul>
		</div>
	</c:forEach>
	<p style="clear: both"></p>

</body>
</html>