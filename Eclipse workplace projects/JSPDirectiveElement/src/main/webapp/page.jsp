<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directive</title>
</head>
<body>
      
      <%@ page import="java.util.*" %>
      <%= new Date() %>
      
      <%@ page errorPage="error.jsp" %>
      <% int a=10; int b = 2; int c=a/b ;
         out.print(c);
      %>
      
</body>
</html>