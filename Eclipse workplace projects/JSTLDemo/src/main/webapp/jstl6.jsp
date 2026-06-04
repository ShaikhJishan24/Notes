<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="status" scope="request" value="brilliant"/>
	${status}

<!-- same as removeAttributes -->
<c:remove var="status" scope="request"/>

	<br>
	<!-- it is null friendly -->
	${status}