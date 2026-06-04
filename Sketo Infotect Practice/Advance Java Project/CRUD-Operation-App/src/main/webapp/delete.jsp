<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="pack.Dao.*, java.util.*, pack.User.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>    
          <%
        
		      int id= Integer.parseInt(request.getParameter("id"));
	          UserDao.DeleteUser(id);
	          
	          response.sendRedirect("index.jsp");  
 
        %> 

</body>
</html>