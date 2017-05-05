<%@page import="java.util.Date" session="true"%>
<%@ taglib prefix="test" uri="tags.javaiw.org" %> <!-- this is third type of directive -->
<!-- we included taglib library  -->
<!-- prefix=test. In HelloTag.tld we have short-name as test that becomes the prefix -->
<!-- uri= sthsth means that is the uri and my jsp will get connected to tld with that uri -->
<html>
<body>

The current date is <b><%=(new Date()) %></b>
<test:hello name="Sanket" course="Java Advanced"/><br>
<test:bye name="Sanket"/>

</body>
</html>
