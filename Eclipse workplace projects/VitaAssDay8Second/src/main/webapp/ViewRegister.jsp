<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:forEach var="x" items="${sessionScope.Registerlist}">
    Name: ${x.name} <br>
    Email: ${x.email} <br>
    Address: ${x.address} <br>
    Login: ${x.login} <br>
    Password: ${x.passwd} <br>
</c:forEach>
