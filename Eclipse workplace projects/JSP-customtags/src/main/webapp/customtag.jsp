<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tag JSP</title>
</head>
<body>    
      <%@ taglib uri="WEB-INF/mylib.tld" prefix="m" %>
      
      <%@ taglib uri="WEB-INF/attribute.tld" prefix="c" %>
      
      <h3>My Custom Tag : </h3>
      <m:firstcustomtag></m:firstcustomtag>
      
      <h3>My Custom Tag with Attribute : </h3>
      <c:attributecustomtag number="4"></c:attributecustomtag>
 
      
</body>
</html>