<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp" %>   
<head>
<title>Giỏ hàng</title>
</head>
<body>
<div class="row">
	<div class="span12">
	<div class="well well-small">
		<!-- <h1>Giỏ hàng <small class="pull-right">${TotalQuantyCart} Sản phẩm trong giỏ hàng </small></h1> -->
	<hr class="soften"/>	

	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                	<th></th>
                  <th>Hình ảnh</th>
                  <th>Tên Sản Phẩm</th>
                  <th>Giá bán</th>
                  <th>Số lượng </th>
                  <th>Xóa </th>
                  <th>Tổng tiền</th>
				</tr>
              </thead>
              <tbody>
				<c:forEach var="giohang" items="${ giohang }">
					<tr>
					<td><input type="checkbox" id="vehicle1" name="id" value="${giohang.id }"></td>
					<td></td>
	                  <td>${giohang.id_sp }</td>
	             
	                  <td></td>
	                  <td>
						<a href="tru?idsp=${giohang.id }&idkh=${giohang.id_kh }"><i class="fa fa-minus" style="font-size:14px"></i> </a>${giohang.soluong_them } <a href="cong?idsp=${giohang.id }&idkh=${giohang.id_kh}"><i class="fa fa-plus" style="font-size:14px"></i></a>
					  </td>
	                  <td>
	                  	<a href="xoagiohang?id=${giohang.id }&idkh=${giohang.id_kh}"><i class="fa fa-trash-o"></i></a>
	                  </td>
	                  <td><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice}"/> ₫</td>
	                </tr>
				</c:forEach>
                
				</tbody>
            </table><br/>
			<%-- <p><fmt:formatNumber type="number" groupingUsed="true" value="${TotalPriceCart}"/> ₫</p> --%>
	<a href="sanpham" class="shopBtn btn-large"><span class="icon-arrow-left"></span> Tiếp tục mua sắm </a>
	<a href="thanhtoan" class="shopBtn btn-large pull-right">Thanh toán <span class="icon-arrow-right"></span></a>

</div>
</div>
</div>

	<script>
		$(".edit-cart").on("click",function(){
			var id= $(this).data("id");
			var quanty = $("#quanty-cart-"+id).val();
			window.location = "EditCart/"+id+"/"+quanty;
		});
	</script>


</body>