<%@page import="java.util.Date" session="true"%>
<%@ taglib prefix="test" uri="tags.javaiw.org" %>
<html>
<body>

<%--/* trying comments in jsp */ --%>
<%--/* yes comments work here */ --%>

<%@ include file="file2.html" %> <%--/* include: it includes other webpages */ --%>

<%-- /* include directive without jsp: output is fetched and directed to demo.jsp even before converting this jsp into servlet  */ --%>
<%-- /* thats why this include directive is called static  */ --%>
<%-- /* so use static include only if your page does not change. Static include saves time */ --%>

The current date is <b><%=(new Date()) %></b><br>

<%-- /* both include and include action are doing similar activities.  */ --%>
<%-- /* jsp:include is a dynamic include. Whenever client requests demo.jsp, with every request data.jsp sends a fresh output to demo.jsp. So we can say it is dynamic include */ --%>
<%-- /* Dynamic include is little slow but good because if page changes then we get latest page  */ --%>

<jsp:include page="Data.jsp"></jsp:include><br>


</body>
</html>

