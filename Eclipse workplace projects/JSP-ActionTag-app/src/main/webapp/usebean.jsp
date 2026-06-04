<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>      

       <jsp:useBean id="obj" class="myBeanPackage.userBean"></jsp:useBean>
       
       <%-- <%
            int num = obj.cube(4);
            out.print(num); 
       %> --%>
       
       <%-- <h3>Another way : </h3>
       <c:set var = "num" value="${obj.cube(8)}"></c:set>
       <c:out value="${num}"></c:out> --%>
       
       
       <h3>setAttribute and getAttribute : </h3>
       <jsp:setProperty property="*" name="obj"/>
       
       <jsp:getProperty property="username" name="obj"/>
       <jsp:getProperty property="passwd" name="obj"/>
       
       
       
  

</body>
</html>