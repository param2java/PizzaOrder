<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Registration</title>

</head>
<body style="color: red; font-size: 18px;">

	<h2 align="center">Enter Pizza Detail</h2>

	<form action="insert-pizza.htm" method="post">
		<table align="center">
			<tr>
				<td>Id :</td>
				<td><input type="text" name="pizzaId" id="pizzaId"></td>
				<td><span id="venIdMsg" style="color: blue;"></span></td>
			</tr>


			<tr>
				<td>Type Of Pizza :</td>
				<td><input type="text" name="pizzaType"></td>
				<td></td>
			</tr>

			<tr>
				<td>Small :</td>
				<td><input type="text" name="smallPrice"></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Medium :</td>
				<td><input type="text" name="mediumPrice"></td>
				<td></td>
			</tr><tr>
				<td>large :</td>
				<td><input type="text" name="largePrice"></td>
				<td></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right"><input type="Submit" value="Add"></td>
				<td></td>

			</tr>

		</table>
	</form>
	<h4 align="center">${msg}</h4>
	<br />
	<h4 align="center">
		<a href="${pageContext.request.contextPath}/view-all-pizza.htm?msg=0">View All Categroys</a>
	</h4>
</body>
</html>