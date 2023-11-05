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
	<table style="width:80%; margin:auto" class="table-striped mb-4">
		<thead class="table-dark">
			<tr style="text-align:center; font-weight:bold">
				<td>ID</td>
				<td>Name</td>
				<td>Icon</td>
				<td>Action</td>
			</tr>
		</thead>	
		<tbody>
			<c:forEach var="i" items="${list}">
				<tr style="text-align:center">
					<td>${i.categoryId}</td>
					<td> <a href="<c:url value="/product/find?cateId=${i.categoryId }"/>">${i.categoryName}</a></td>
					<td>${i.icon }</td>
					<td>
						<a href="<c:url value="update?id=${i.categoryId }" />">Update</a> ||
						<a href="<c:url value="delete?id=${i.categoryId }" />">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>