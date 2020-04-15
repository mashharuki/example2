<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "ex.Fruit" %>
<% Fruit fruit = (Fruit)  request.getAttribute("fruit"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>フルーツ画面</title>
	</head>
	<body>
		<p>
			${applicationScope.fruit.name}の値段は ${applicationScope.fruit.price}円です。
		</p>
	</body>
</html>