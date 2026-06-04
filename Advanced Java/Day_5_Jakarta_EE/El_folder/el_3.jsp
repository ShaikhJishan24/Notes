this is with cookie
<%
Cookie c=new Cookie("player","rahul");
response.addCookie(c);
%>

<br>
the value of cookie implicit object ie. map is

${cookie.player}   // player is the object of Cookie

<br>
the value  of cookie is
${cookie.player.value}

<br>
the name of cookie is
${cookie.player.name}





