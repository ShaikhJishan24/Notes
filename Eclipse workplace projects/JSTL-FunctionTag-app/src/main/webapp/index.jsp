<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
           <h3>Function Tag =></h3> 
           
           <%-- <h3> fncontains() :
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set>
               
               Is String present : <c:set var="str1" value="${fn:contains(str, 'Youtube')}"></c:set>
               
               Is String present : <c:set var="str2" value="${fn:contains(str, 'Jishan')}"></c:set> 
               
               <c:out value="${str1}"></c:out>
               <c:out value="${str2}"></c:out>
               <hr>
           </h3>  --%>
           
           
           <%-- <h3>fncontainsIgnoredCase() :
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set>
               
               <c:set var="str1" value="${fn:containsIgnoreCase(str, 'YOUTUBE')}"></c:set>
            
               <c:out value="${str1}"></c:out>
             
               <hr>
             
           </h3> --%>
           
           
           <%-- <h3> fnendsWith() :
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set>
               
               Is String endsWith channel : <c:set var="str1" value="${fn:endsWith(str, 'Channel')}"></c:set>
            
               <c:out value="${str1}"></c:out>
             
               <hr>
           
           </h3> --%>
           
           
           <!-- <h3>fnescapeXml() : <hr></h3> -->
           
           <%-- <h3> fnindexOf() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set>
               
               index of given String : <c:set var="str1" value="${fn:indexOf(str, 'my')}"></c:set>
            
               <c:out value="${str1}"></c:out>
             
               <hr>
             
           </h3> --%>
           
         
           <%-- <h3> fntrim() :  
           
               <c:set var="str" value="Welcome to my      Youtube      Channel"></c:set><br>
               
               Before trim : <c:out value="${str}"></c:out><br>
               <c:set var="str1" value="${fn:trim(str)}"></c:set>
            
               After trim : <c:out value="${str1}"></c:out> 
             
               <hr>
             
           </h3> --%>
           
           
            <%-- <h3> fnstartWith() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               String start with welcome : ${fn:startsWith(str, 'Welcome')} <br>
	               String start with my : ${fn:startsWith(str, 'my')} 
               
               <hr>
             
           </h3>  --%>
           
           
           <%-- <h3> fntoLowerCase() :  
           
               <c:set var="str" value="WELCOME TO MY YOUTUBE CHANNEL"></c:set><br>
               
	               ${fn:toLowerCase(str)} 
               
               <hr>
             
           </h3>  --%>
           
           
           <%-- <h3> fntoUpperCase() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               LowerCase to UpperCase : ${fn:toUpperCase(str)} 
               
               <hr>
             
           </h3>  --%>
           
           
           <%-- <h3> fnsubstring() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               Substring : ${fn:substring(str, 8, 21)} 
               
               <hr>
             
           </h3>  --%>
           
           
           <%-- <h3> fnsubstringAfter() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               SubstringAfter : ${fn:substringAfter(str, 'my')} 
               
               <hr>
             
           </h3>  --%>
           
           
          <%-- <h3> fnsubstringBefore() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               SubstringBefore : ${fn:substringBefore(str, 'my')} 
               
               <hr>
             
           </h3> --%> 
           
           
           <%-- <h3> fnlength() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               Total length  : ${fn:length(str)} 
               
               <hr>
             
           </h3> --%>
           
           
           <%-- <h3> fnreplace() :  
           
               <c:set var="str" value="Welcome to my Youtube Channel"></c:set><br>
               
	               string After Replacement : ${fn:replace(str, 'my Youtube Channel', 'Techgun')}   
               
               <hr>
             
           </h3> --%>
           
           
           
           
           
           
           
</body>
</html>