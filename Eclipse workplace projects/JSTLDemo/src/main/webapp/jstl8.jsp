<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
this is main page
<br>
<c:import url="jstlheader.jsp">
 
 	<!-- jstl param tag -->
	<c:param name="role" value="WatchDog"/>
</c:import>
<br>
back to main page


<!-- 

import the response of the included page 
pass parameters to the included page uisng the param
works as standard Action include



-->