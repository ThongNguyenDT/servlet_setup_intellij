<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<form method="post" action="update">
		<label for="categoryId">Category ID:</label>
		<input type="text" name="categoryId" readonly value="${model.categoryId }">
		<br>
		<label for="categoryName">Category name:</label>
		<input type="text" name="categoryName" value="${model.categoryName }">
		<br>
		<label for="icon">Icon:</label>
		<input type="text" name="icon" value="${model.icon }">
		<br>
		<input type="submit">
	</form>
	</div>
</body>
</html>