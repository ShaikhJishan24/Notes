<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>    
          <%-- <%String name = (String) request.getAttribute("name"); %>

          <h1>Welcome to Home Page</h1>
          <h3> Name : <%= name %></h3> --%> 
                   
                   <!-- Or -->
          <h4>Using the JSP : ${name}</h4> <!-- another way for above -->
               
          <form action="Home" method="Post">     
	            name : <input type="text" name="name"><br><br>
	            Email : <input type="text" name="email"><br><br>
	            Roll_no : <input type="text" name="roll"><br><br>
	            <button type="submit">Submit</button>
          </form>
          
          
          <h3> Name : ${st.getName()} </h3>
</body>
</html>