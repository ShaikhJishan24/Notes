<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>  

    <h1>Hello world </h1>
    
    <h2>Scriplet Tag =></h2>
    <% 
       out.println("This is Scriplet tag" + "<br>");
       
       int no = 5;
       out.println("Number : " + no);
    
    %>
    
    <h2>Expression Tag =></h2>
    <%= no %>
    
    
    <h2>Declaration Tag =></h2>
    <h4>Declaring variable : </h4>
    <%! String name = "Tech Gun" ;%>
    <%= "Name = " + name %>
    <h4>Declaring method : </h4>
    <%! int num(){
    	   return 10;
        }
    %>
    <%= num() + "<br>"%>
    
   
    <%! String demo(String name){
    	   return name;
        }
    %>
    <%= demo("Jishan")%>
    
    
    
</body>
</html>