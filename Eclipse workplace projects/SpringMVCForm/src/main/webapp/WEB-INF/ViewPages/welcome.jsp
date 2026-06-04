<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.SpringMVCLogin.Student" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <% Student std = (Student) request.getAttribute("student_detail"); %>
      <h2>Student Details:</h2>
      <p>ID: <%= std.getName() %></p>
      <p>Name: <%= std.getEmail() %></p>
      <p>Roll No: <%= std.getRoll() %></p>

</body>
</html>