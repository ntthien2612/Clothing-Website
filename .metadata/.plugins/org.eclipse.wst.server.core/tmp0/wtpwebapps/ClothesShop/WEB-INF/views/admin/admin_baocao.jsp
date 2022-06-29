<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.*,java.text.*"%>
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
				<a class="nav-link" href="quanlynhanvien"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Nhân Viên
				</a>
			</p>
			<p>
				<a class="nav-link" href="baocao"> <i
					class="bi bi-bar-chart-line"></i> Báo Cáo
				</a>
			</p>
		</div>
		<div class="col-sm-10 text-left">
			<div style="width: 49%; float: left; text-align: center;">
				<h3>
					<b>Thống kê đơn hàng</b>
				</h3>
				<form action="thongke" method="get">
				<p>Tháng: 
					<select name="thang_dh" onchange="this.form.submit()" style="margin-bottom: 10px; width: 100px;">
						<c:if test="${empty thang_dh }">
							<option>
								<%
									Date d = new Date();
									SimpleDateFormat f = new SimpleDateFormat("M");
									out.print("<h2 align=\"center\">" + f.format(d) + "</h2>");
								%>
							</option>
						</c:if>
						<option>${thang_dh }</option>
						<%
							for (int i = 1; i <= 12; i++) {
						%>
						<option><%=i%></option>
						<%
							}
						%>
					</select>
</p>
			<div style="height: 300px;overflow-y: scroll;scroll-behavior: smooth;">
					<table border="1"style="width: 90%; text-align: left; margin-left: 5%">
						<tr>
							<th style="width: 10%;">ID</th>
							<th style="width: 30%">Khách hàng</th>
							<th style="width: 35%">Ngày mua</th>
							<th style="width: 15%">Tổng tiền</th>
						</tr>

						<c:forEach var="dh_thang" items="${dh_thang}" varStatus="index">
							<tr>
								<td>${dh_thang.id_dh }</td>
								<td>${dh_thang.ten_kh }</td>
								<td>${dh_thang.thoigian_mua }</td>
								<td>${dh_thang.tongtien }</td>
							</tr>
						</c:forEach>

						<c:forEach var="thongkedh" items="${thongkedh}" varStatus="index">
							<tr>
								<td>${thongkedh.id_dh }</td>
								<td>${thongkedh.ten_kh }</td>
								<td>${thongkedh.thoigian_mua }</td>
								<td>${thongkedh.tongtien }</td>
							</tr>
						</c:forEach>
						<tr>
							<th colspan="4">Tổng đơn: ${count_dh }</th>
						</tr>
						<tr>
							<th colspan="4">Tổng tiền: ${tongtien }</th>
						</tr>
					</table>
					</div>
			</div>


			<div style="width: 49%; float: right; border-left: 1px solid black; text-align: center;">
				<h3>
					<b>Thống kê sản phẩm</b>
				</h3>
				<p>Tháng: 
				<select name="thang_sp" onchange="this.form.submit()" style="margin-bottom: 10px; width: 100px;">
					<c:if test="${empty thang_sp }">
						<option>
							<%
								Date d = new Date();
									SimpleDateFormat f = new SimpleDateFormat("M");
									out.print("<h2 align=\"center\">" + f.format(d) + "</h2>");
							%>
						</option>
					</c:if>
					<option>${thang_sp }</option>
					<%
						for (int i = 1; i <= 12; i++) {
					%>
					<option><%=i%></option>
					<%
						}
					%>
				</select>
				</p>
				</form>
				<div style="height: 300px;overflow-y: scroll;scroll-behavior: smooth;">
				<table border="1"
					style="width: 90%; text-align: left; margin-left: 5%">
					<tr>
						<th>Tên sản phẩm</th>
						<th style="text-align: center">Số lượng bán</th>
					</tr>

					<c:forEach var="sp_thang" items="${sp_thang}" varStatus="index">
						<tr>
							<td>${sp_thang[2] }</td>
							<td style="text-align: center">${sp_thang[1] }</td>
						</tr>
					</c:forEach>

					<c:forEach var="thongkesp" items="${thongkesp}" varStatus="index">
						<tr>
							<td>${thongkesp[2] }</td>
							<td style="text-align: center">${thongkesp[1] }</td>
						</tr>
					</c:forEach>

					<tr>
						<th>Tổng:</th>
						<td style="text-align: center">${count_sp }</td>
					</tr>
				</table>
				</div>
			</div>

		</div>
	</div>
</div>