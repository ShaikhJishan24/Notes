<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

	<%
	
		List<Integer> li = new ArrayList<>();
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		request.setAttribute("mli", li);
	
	%>
	
	${mli}

</body>
</html>