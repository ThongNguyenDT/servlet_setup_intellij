<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<form action="insert" method="post" enctype="multipart/form-data">
		<label for="productName">productName:</label>
		<input type="text" name="productName">
		<br>
		<label for="description">description:</label>
		<textarea class="form-control" name="description" cols="5"></textarea>
		<br>
		<label for="price">price:</label>
		<input type="text" name="price">
		<br>
		<label for="imageLink">imageLink:</label>
		<input type="file" name="imageLink">
		<br>
		<label for="category">Category:</label>
		<select name="categoryId">
			<c:forEach var="item" items="${listcate}">
				<option value="${item.categoryId }">${item.categoryName }</option>
			</c:forEach>
		</select>
		<br>
		<label for="stoke">stoke:</label>
		<input type="text" name="stoke">
		<br>
		<input class="btn btn-primary" type="submit">
	</form>
	</div>
</body>
</html>