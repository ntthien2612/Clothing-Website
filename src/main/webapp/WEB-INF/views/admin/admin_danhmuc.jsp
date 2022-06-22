<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<div class="container-fluid text-center" style="border: 1px solid black">
	<div class="row content">
		<div class="col-sm-2 sidenav" style="text-align: left">
			<p>
				<a class="nav-link active" href="./"> <i
					class="bi bi-house-fill"></i> Trang Chủ
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydanhmucSP"> <i
					class="bi bi-folder"></i> Danh Mục Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlysanpham"> <i
					class="bi bi-file-earmark-text"></i> Sản Phẩm
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-minecart"></i> Quản Lý Đơn Hàng
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlynguoidung"> <i
					class="bi bi-people-fill"></i> Quản Lý Người Dùng
				</a>
			</p>
			<p>
				<a class="nav-link" href="#"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Phản Hồi
				</a>
			</p>
			<p>
				<a class="nav-link" href="quanlydonhang"> <i
					class="bi bi-bar-chart-line"></i> Báo Cáo Doanh Thu
				</a>
			</p>
		</div>
		<div class="col-sm-10 text-left">
				<h1 style="text-align: center">
		<b>Thêm danh mục</b>
	</h1>
	<hr>
	<form:form action="quanlydanhmucSP" method="POST" modelAttribute="danhmuc" >
		<table style="margin-left: 30%; height: 70px">
			<tr>
				<td><b>Tên danh mục: </b></td>
				<td><form:input type="text" path="ten_dm" placeholder="Nhập tên danh mục sản phẩm" style="width: 300px"/></td>
			</tr>
			<tr>
			<td></td><td><button type="submit" class="btn block">Lưu</button>
							<button type="reset" class="btn block">Reset</button></td>
			</tr>
		</table>
	</form:form>	
	<hr>
<h1 style="text-align: center"><b>Danh sách danh mục</b></h1><hr>
<table border="1" style="width: 50%; margin-left: 25%; text-align: center">
<tr><th style="text-align: center">Tên danh mục</th>
<th colspan="2" style="text-align: center">Tùy chọn</th>
</tr>
<c:forEach var="danhsach" items="${danhsach}" varStatus="index">
<tr><td>${danhsach.ten_dm }</td><td style="width: 20%"><a href="<c:url value='quanlydanhmucSP?chinhsua=${danhsach.id_dm }' />">Chỉnh sửa</a></td>
<td style="width: 20%"><a href="<c:url value='quanlydanhmucSP/xoa?id=${danhsach.id_dm }' />">Xóa</a></td></tr>
				</c:forEach>
</table>
		</div>
	</div>
</div>