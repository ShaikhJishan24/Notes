<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
         <%  
             String Uname = (String) request.getAttribute("username"); 
             String passwd = (String) request.getAttribute("password");
         %>
         
         <h1>You are succesfully Login </h1>
         <h3>
              Username : <%= Uname %><br>
              Password : <%= passwd %>
         
         </h3>
</body>
</html>