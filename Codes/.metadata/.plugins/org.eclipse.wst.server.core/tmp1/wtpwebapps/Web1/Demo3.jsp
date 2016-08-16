<%@page import="java.util.Date" session="true"%>
<%@ taglib prefix="test" uri="tags.javaiw.org" %>
<html>
<body>

<%@ include file="file2.html" %> <%--/* include: it includes other webpages */ --%>

<jsp:forward page="login.html"></jsp:forward>
<%-- /* This code is 95% same as Demo2.jsp. But by using forward command we get output of login.html */ --%>

</body>
</html>
