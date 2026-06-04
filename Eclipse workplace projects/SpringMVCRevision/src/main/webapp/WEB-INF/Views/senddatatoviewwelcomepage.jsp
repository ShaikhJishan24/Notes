<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h3>This is the Home page of Spring MVC Revision project</h3>
        <%
           String uname = (String) request.getAttribute("name");
        %>
        <h3>Welcome <%= uname %></h3>
</body>
</html>