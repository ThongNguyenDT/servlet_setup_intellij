<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<c:if test="${not empty message }">${message }</c:if>
	<c:if test="${not empty error }">${error }</c:if>
	<a href="<c:url value="/admin/product/insert"/>">Insert product</a>
	<table style="width:80%; margin:auto" class="table-striped mb-4">
		<thead class="table-dark">
			<tr style="text-align:center; font-weight:bold">
				<td>ID</td>
				<td>Name</td>
				<td>description</td>
				<td>price</td>
				<td>image</td>
				<td>categoryId</td>
				<td>sellerId</td>
				<td>amount</td>
				<td>stoke</td>
				<td>Action</td>
			</tr>
		</thead>	
		<tbody>
			<c:forEach var="i" items="${list}">
				<tr style="text-align:center">
					<td>${i.productId}</td>
					<td>${i.productName}</td>
					<td>${i.description }</td>
					<td>${i.price }</td>
					<td>${i.imageLink }</td>
					<td>${i.categoryId }</td>
					<td>${i.sellerId }</td>
					<td>${i.amount }</td>
					<td>${i.stoke }</td>
<!-- 					<td> -->
<%-- 						<a href="<c:url value="update?id=${i.custNumber }" />">Update</a> || --%>
<%-- 						<a href="<c:url value="delete?id=${i.custNumber }" />">Delete</a> --%>
<!-- 					</td> -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>