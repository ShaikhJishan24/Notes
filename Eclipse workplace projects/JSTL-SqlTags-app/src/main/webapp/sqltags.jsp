<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		    <h3>SQL Tags =></h3>
		    
		    <%-- <h3>sqlsetDataSource : </h3>
		    
				    <sql:setDataSource dataSource="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/newdb" user="root" password="Jishan@9136"/>
				    
				    <sql:query var="rs" dataSource="${db}">
				    
				        SELECT * from emp;
				        
				    </sql:query>
				    
				    <c:forEach var="table" items="${rs.rows}">
				    
				        Employee Id : <c:out value="${table.empID}"></c:out>
				        
				        Employee name : <c:out value="${table.emp_name}"></c:out>
				        
				        Employee salary : <c:out value="${table.salary}"></c:out>
				    
				    </c:forEach>  
		    <hr> --%>
		    
		    
		    
		    <%-- <h3>sqlupdate : </h3>
		    
				    <sql:setDataSource dataSource="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/newdb" user="root" password="Jishan@9136"/>
				    
				    <sql:update dataSource="${db}" var="count">  
				    
						INSERT INTO emp VALUES (6, 'Monika' , 4679.30);  
						
					</sql:update>  
					
				    <sql:query var="rs" dataSource="${db}">
				    
				        SELECT * from emp;
				        
				    </sql:query>
				    
				    <c:forEach var="table" items="${rs.rows}">
				    
				        Employee Id : <c:out value="${table.empID}"></c:out>
				        
				        Employee name : <c:out value="${table.emp_name}"></c:out>
				        
				        Employee salary : <c:out value="${table.salary}"></c:out>
				    
				    </c:forEach>  
		    <hr> --%>
		    
		    
		    <%-- <h3>sqlparam : </h3>
		    
		    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
					 url="jdbc:mysql://localhost/test"  
					 user="root"  password="1234"/>  
					 
					<c:set var="StudentId" value="152"/>  
					
					<sql:update dataSource="${db}" var="count">  
					
					     DELETE FROM emp WHERE Id = ?  
					     
					     <sql:param value="${StudentId}" />  
					     
					</sql:update>  
			  
					<sql:query dataSource="${db}" var="rs">  
					
					    SELECT * from emp;  
					    
					</sql:query>  
					 
				
					<c:forEach var="table" items="${rs.rows}">  
					<tr>  
					<td><c:out value="${table.id}"/></td>  
					<td><c:out value="${table.First_Name}"/></td>  
					<td><c:out value="${table.Last_Name}"/></td>  
					<td><c:out value="${table.Age}"/></td>  
					</tr>  
			       </c:forEach>  
		    
		    <hr>
		    
		    
		    <h3>sqldateParam : </h3>
		    
		    <h3>sqltransaction : </h3> --%>
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
</body>
</html>
