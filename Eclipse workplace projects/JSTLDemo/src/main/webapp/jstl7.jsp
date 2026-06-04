<%-- unlike the other two includes the <c:import>   url can be from outside the web container.(outside the server)e ex as google
it adds the content from the value of the URL attribute to the current page, at the request time. it works a lot like <jsp:include>, but it's more powerful and flexible.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


this is the rediffmail
<br>
<c:import url="https://www.rediff.com/"/>


<!-- it is go beyound the webContainer(Server) unlike the include directive and standard Action -->