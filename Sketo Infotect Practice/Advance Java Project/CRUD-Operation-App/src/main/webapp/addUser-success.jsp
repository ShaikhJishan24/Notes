<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="all_css.jsp" %>
</head>
<body class="bg-light">
           <%@ include file="navbar.html" %>
           
           <div class="container  " > 
                 <div class="row justify-content-center " style="padding-top:60px">                
                      <div class="col-md-5 bg-white">
                           
                            <h2 class="text-center ">Add New User</h2>  
                            <p>Student Added Successfully</p>
                            
							<form action="Useradd" method="post"> 
							      <div class="mb-3 pt-3">
								    <label for="exampleInputEmail1" class="form-label">Name</label>
								    <input type="text" class="form-control"  name="uname">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">DOB</label>
								    <input type="date" class="form-control" name="dob">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">Address</label>
								    <input type="text" class="form-control" name="address">
								    
								  </div>
								  
								  <div class="mb-3 ">
								    <label for="exampleInputEmail1" class="form-label">Qaulification</label>
								    <input type="text" class="form-control"  name="qualification">
								    
								  </div>
								  
								  <div class="mb-3">
								    <label for="exampleInputEmail1" class="form-label">Email address</label>
								    <input type="email" class="form-control"  name="email">
								    
								  </div>
								 
								  <button type="submit" class="btn btn-danger mb-2" style="margin-left: 200px">Add User</button>
							</form>
                      
                      
                      
                      </div>      
                 </div>
           </div>
</body>
</html>