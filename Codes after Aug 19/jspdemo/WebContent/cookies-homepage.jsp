<html>
<body>
	<h3>Training Portal</h3>

	<!-- read the favorite programming language cookie -->

	<%
		//the default .. if there are no cookies
		String favLang = "Java";

		//get cookies from browser request
		Cookie[] theCookies = request.getCookies();

		//find out favorite language cookie
		if (theCookies != null) {
			for (Cookie tempCookie : theCookies) {
				if ("myApp.favoriteLanguage".equals(tempCookie.getName())) {
					favLang = tempCookie.getValue();
					break;
				}
			}
		}
	%>

	<!-- now show a personalized page .. use the "favLang" variable -->
	<h4>New Books for <%=favLang%></h4>
	<ul>
		<li>abc</li>
		<li>xyz</li>
	</ul>

	<h4>Latest News for <%=favLang%></h4>
	<ul>
		<li>abc</li>
		<li>xyz</li>
	</ul>

	<h4>Hot jobs for <%=favLang%></h4>
	<ul>
		<li>abc</li>
		<li>xyz</li>
	</ul>

<hr>
<a href = "cookies-personalize-form.html">Personalize this page</a>
</body>

</html>