<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="pack.Dao.*, java.util.*, pack.User.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="all_css.jsp" %>
</head>
<body class="bg-light">     

        <%@ include file="navbar.html" %>
        
        <%
        
	      int id= Integer.parseInt(request.getParameter("id"));
          User u = UserDao.getRecordByid(id);
 
        %> 
           
           <div class="container  " > 
                 <div class="row justify-content-center " style="padding-top:60px">                
                      <div class="col-md-5 bg-white">
                           
                            <h2 class="text-center ">Edit User</h2>  
                            
							<form action="updateuser" method="post"> 
							      <div class="mb-3 pt-3">
								    <label for="exampleInputEmail1" class="form-label">Name</label>
								    <input type="text" class="form-control"  name="uname"  value="<%= u.getName() %>">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">DOB</label>
								    <input type="date" class="form-control" name="dob"  value="<%= u.getDob() %>">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">Address</label>
								    <input type="text" class="form-control" name="address" value="<%= u.getAddress() %>">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">Qaulification</label>
								    <input type="text" class="form-control"  name="qualification" value="<%= u.getQalification() %>">
								    
								  </div>
								  
								  <div class="mb-3">
								    <label for="exampleInputEmail1" class="form-label">Email address</label>
								    <input type="email" class="form-control"  name="email" value="<%= u.getEmail() %>">
								    
								  </div>
								  
								  <input type="hidden" name="id" value="<%= u.getId() %>">
								 
								  <button type="submit" class="btn btn-danger mb-3" style="margin-left: 200px">Update student</button>
							</form>
                      
                      
                      
                      </div>      
                 </div>
           </div>

</body>
</html>