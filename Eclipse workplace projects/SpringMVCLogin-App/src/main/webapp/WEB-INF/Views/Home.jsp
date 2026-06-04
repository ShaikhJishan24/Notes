<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<%-- <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>"> --%>

<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>

</head>
<body> 
           <h1>Welcome To Home Page</h1>
           <a href="register" style="text-decoration : none; font-size : 20px; color : blue ; margin-right : 20px">Register</a> 
           <a href="login" style="text-decoration : none; font-size : 20px">Login</a><br><br>
           
           <%-- <div>
           <img alt="" src="<c:url value="/resources/img/sc-7.png"/>" width="500px" height="250px">
           </div> --%>
</body>
</html>