<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL CoreTags</title>
</head>
<body>   
       <h2>Core Tags => </h2>
       
       <%-- <h3> cout: 
        
           <c:out value="Hello Jishan"></c:out>
          
       </h3> --%>  
       <hr>
       
       <%-- <h3>cimport :
       
              <c:import var="data" url="Navbar.html"/> 
              <c:out value="${data}"/> 
       
       </h3> --%> 
       
       <hr>
       
       <%-- <h3>cset :
       
	          <c:set var="income" scope="session" value="${4000 * 4 }"></c:set>
	          <c:out value="${income}"></c:out>
          
       </h3> --%> 
       
       <hr>
       
       <%-- <h3>cremove : <br>
       
	          <c:set var="income" scope="session" value="${4000 * 4 }"></c:set>
	          Before Removing = <c:out value="${income}"></c:out>
	          
	          <c:remove var="income"/><br>
	          After Removing = <c:out value="${income}"></c:out>
          
       </h3>  --%> 
      
      <hr>
       <%-- <h3>c:catch :
           <c:catch var="catchException">
                 <%
                     int x = 18/0 ;                
                 %>
           </c:catch>
       
           <c:if test="${catchException != null}">
           
                 <p>
                    ${catchException}<br>
                    ${catchException.message }
                 </p>
               
           </c:if>      
       </h3>  --%>
       
       <hr>
       
       <%-- <h3>cif :
       
            <c:set var="income" scope="session" value="${4000 * 4}"></c:set>
            
            <c:if test="${income > 8000}">
            
                  <p>
                      <c:out value="${income}"></c:out>
                  </p>
            
            </c:if>
            
            
       </h3>  --%>
      
      <hr>
      <%-- <h3>cchoose, cwhen, cotherwise :
       
       
            <c:set var="income" scope="session" value="${4000 * 4}"></c:set>
            
            <c:choose>
            
                  <c:when test="${income <= 1000}">
                         <p>income is not Good</p>
                  </c:when>
            
                  <c:when test="${income > 1000}">
                         <p>income is  Good</p>
                  </c:when>
            
                  <c:otherwise>
                          <p>income is  undetermined</p>
                  </c:otherwise>
            
            
            </c:choose>
      
       </h3>  --%>
      
      <hr>
      <%-- <h3>credirect :
      
           <c:set var="age" value="${18}"></c:set>
      
           <c:if test="${age >= 18}">
           
                <c:redirect url="Navbar.html"></c:redirect>
           
           </c:if>
      
           <c:if test="${age < 18}">
           
                <c:redirect url="Navbar.html"></c:redirect>
           
           </c:if>
      
      </h3> --%>
      
      <hr>
      <%-- <h3>cForTokens :
      
           <c:forTokens items="Jishan-Niyaz Ahmed-shaikh" delims="-" var="name">
           
                <c:out value="${name}"></c:out>
           
           </c:forTokens>
      
      </h3>  --%>
      
      <hr>
      <%-- <h3>cForEach : <br>
      
            <c:forEach var="num" begin="1" end="10">
            
                 <c:out value="${num}"></c:out> <br>
            
            </c:forEach>
     
      </h3>  --%>
      <hr>
      
      <%-- <h3>curl , cparam :
      
            <c:url value="/index1.jsp" var="completeURL">  
					 <c:param name="trackingId" value="786"/>  
					 <c:param name="user" value="Nakul"/>  
			</c:url>  
			
			 ${completeURL}  
		
      </h3>  --%>
      
    
</body>
</html>