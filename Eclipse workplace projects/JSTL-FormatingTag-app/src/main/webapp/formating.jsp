<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>     

         <h3>Formating Tags =></h3>
         
         <h3>fmtparseNumber : 
         
             <c:set var="Amount" value="786.19"></c:set>
         
             <fmt:parseNumber var="num" type="number" value="${Amount}" />  <br>
             <i>Amount is:</i>  <c:out value="${num}"></c:out>
             
             <fmt:parseNumber var="num" integerOnly="true" type="number" value="${Amount}" />  <br>
    		 <i>Amount is:</i>  <c:out value="${num}" />  
             
            <hr>
         
         </h3>































</body>
</html>