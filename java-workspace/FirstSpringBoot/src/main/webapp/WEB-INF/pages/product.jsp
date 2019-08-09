<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- <body>
<form:form modelAttribute="product">
<h2>Product Form</h2>
Product Id: <form:input path="productId" name = "productId"/>
Product Name : <form:input path = "productName" name = "productName"/>
product Quantity : <form:input path="quantity" name = "quantity"/>
Product price : <form:input path = "price" name = "price"/>
<input type = "submit" value = "save">

</form:form>
</body> --%>
<body>
	<h1>Add a Product</h1>

	<c:url var="addAction" value="/product/add"></c:url>

	<form:form action="${addAction}" modelAttribute="product">
		<table>
			<tr>
				<td><form:input path="productId" size="8" /></td>
			</tr>
			<%-- </c:if> --%>
			<tr>
				<td><form:input path="productName" /></td>
			</tr>
			<tr>

				<td><form:input path="quantity" /></td>
			</tr>

			<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty product.productName}">
						<input type="submit" formaction="add/update"
							value="<spring:message text="Edit Product" />" />
					</c:if> <c:if test="${empty product.productName}">
						<input type="submit" value="<spring:message text="Add Product"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Product List</h3>
	<c:if test="${!empty listProducts}">
		<table class="tg">
			<tr>
				<th width="80">productId</th>
				<th width="120">productName</th>
				<th width="120">quantity</th>
				<th width="120">price</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listProducts}" var="product">
				<tr>
					<td>${product.productId}</td>
					<td>${product.productName}</td>
					<td>${product.quantity}</td>
					<td>${product.price}</td>
					<td><a href="<c:url value='/edit/${product.productId}' />">Edit</a></td>
					<td><a
						href="<c:url value='/deleteProduct/${product.productId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</html>