<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Handling In JSP</title>
</head>
<body>
       <h1>Error Handling in JSP</h1>
       <%@ page errorPage="error.jsp" %>
       <%
         int x = 10;
         int y = 0;
         int ans = x / y;
         
         out.print("Answer is : " + ans );
       
       %>
</body>
</html>