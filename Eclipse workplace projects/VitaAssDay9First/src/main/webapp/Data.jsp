<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="DataServ">
		<label>Search by Location : </label><input type="text" name="loc"> <br>
		<br>
		<button>Submit</button>
	</form>


	<c:forEach var="str" items="${requestScope.mylist}">
	   <br>
	    Name: ${str.name} <br>
	    Location : ${str.loc} <br>
	   <br>
	</c:forEach>
</body>
</html>