<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body >   
        
       <h1>Register Page</h1>
       
       <c:choose>
		    <c:when test="${not empty successmsg}">
		        <div style="color: green;"><c:out value="${successmsg}" /></div>
		    </c:when>
		    <c:when test="${not empty errormsg}">
		        <div style="color: red;"><c:out value="${errormsg}" /></div>
		    </c:when> 
        </c:choose> 
       
        <form action="registerUser" method="post">
         
             <label > UserName </label><br>
	         <input type="text"  name="uname"><br><br>
	
	         <label > Email </label><br>
	         <input type="email"  name="email"><br><br> 
	
	         <label > Password </label><br>
	         <input type="text"  name="passwd"> <br> <br>
	                
	         <button >Register</button><br> <br>
	         <a href="Home" >Back to Home</a>
 
        </form>
        
</body>
</html>