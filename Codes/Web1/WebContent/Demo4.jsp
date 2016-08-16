<%@page import="java.util.Date" session="true"%>
<%@ taglib prefix="test" uri="tags.javaiw.org" %>
<html>
<body>

The current date is <b><%=(new Date()) %></b><br>
<%out.println(session.getId()); %>




</body>
</html>
