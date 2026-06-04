<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="mypack.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Create Employee objects -->
	<jsp:useBean id="e1" class="mypack.Employee" scope="page" />
	<jsp:useBean id="e2" class="mypack.Employee" scope="page" />

	<%
	// Set values using setters
	e1.setName("Jishan");
	e1.setSalary(30000);

	e2.setName("Aman");
	e2.setSalary(40000);

	// Create ArrayList
	List<Employee> empList = new ArrayList<>();
	empList.add(e1);
	empList.add(e2);
	
	request.setAttribute("employees", empList);
	%>

	<h2>Employee Details</h2>

	<c:forEach var="emp" items="${employees}">
			${emp.name}
    		${emp.salary}
    </c:forEach>
		

</body>
</html>