<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <h1 style="text-align : center ;">Login Form</h1>
         
         <div style="justify-content : center; display : flex;">
         
	         <form action="loginservlet" method="post">
	         
	              <label style="font-size : 20px">Enter Email : </label>
	              <input type="email" name ="email" style="height : 20px"><br><br>
	              
	              <label style="font-size : 20px">Enter password : </label>
	              <input type="text" name="passwd" style="height : 20px"><br><br>
	              
	              <button type="submit" style="height : 25px; ">Login</button>
	         </form>
         </div>
</body>
</html>