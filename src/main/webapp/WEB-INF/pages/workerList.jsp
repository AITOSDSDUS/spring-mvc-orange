<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
<link href="webjars/bootstrap/3.3.7-1/css/bootstrap.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" src="webjars/bootstrap/3.3.7-1/js/bootstrap.js"></script>
<script type="text/javascript" src="webjars/jquery/3.2.0/jquery.js"></script>		
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<h1>Workers</h1>
			<h2>List of Workers </h2>
		</div>
	</div>
	<div class="container">
		<h2>Lista parcowników </h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Imię</th>
					<th>Nazwisko</th>
					<th>Płaca</th>
					<th>Deaprtament ID</th>
					<th>Rola ID</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${workers}">
					<tr>
						<td>${item.workerId}</td>
						<td>${item.firstName}</td>
						<td>${item.lastName}</td>
						<td>${item.salary}</td>
						<td>${item.departmentId}</td>
						<td>${item.role}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>