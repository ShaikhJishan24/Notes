<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="pack.conn.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="pack.Dao.*, java.util.*, pack.User.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="all_css.jsp" %>
</head>
<body class="bg-light">
         <%@ include file="navbar.html" %>
         
         <%-- <%
         
         Connection con = Mycon.dbcon();
         out.print(con);
         
         %> --%>
         
          
         <div class="container">
            <div class="row">
               <div class="colmd-12">
                   <h1 class="text-center mt-4 text-danger" >User List</h1>
                      <div class="card border rounded-3 mt-5"> 
                      
                            <c:if test="${not empty succmsg }">
                                <p class="text-center text-danger">${succmsg}</p>
                                <c:remove var="succmsg"/>
                            </c:if>
                            
                            <c:if test="${not empty errormsg }">
                                <p class="text-center text-danger">${errormsg}</p>
                                <c:remove var="errormsg"/>
                            </c:if>
                
                  <table class="table">
						  <thead>
						    <tr>
						      <th scope="col">Name</th>
						      <th scope="col">DOB</th>
						      <th scope="col">Address</th>
						      <th scope="col">Qualification</th>
						      <th scope="col">Email</th>
						      <th scope="col">Actions</th>
						    </tr>
						  </thead>
						  
						  <%
					        List<User> list = UserDao.getAllrecords();
						   	    
					      %>
					      
						  <%						  
						     for(User u : list){
						   %>
						     <tbody>
						        <tr>					          
							      <td><%= u.getName() %></td>
							      <td><%= u.getDob() %></td>
							      <td><%= u.getAddress() %></td>
							      <td><%= u.getQalification()%></td>
							      <td><%= u.getEmail() %></td>
							      <td>
							          <%-- <%= (Object)u.getId()).getClass().getSimpleName() %> --%>
							          <a href="edit_student.jsp?id=<%= u.getId() %>" class="btn btn-danger">Edit</a>
							          <a href="delete.jsp?id=<%= u.getId() %>" class="btn btn-secondary">Delete</a>
							      </td>
						        </tr>
						     </tbody>
						     
						     <%
						        } 
						     
						     %>
					</table>	    						  
					
                  </div>
                 </div>
              </div>
       
         </div>
         
</body>
</html>