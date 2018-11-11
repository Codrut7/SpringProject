<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CinemaZone</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style/style.css" />
</head>

<style>

.button {
    background-color: #000000; /* black */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    vertical-align: middle;
}
h0,h1,h2, h3, h4, h5, h6, h7 {
	color: black;
	font-size: 1.6em;
	line-height:25px;
}

</style>

<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="admin.jsp?<%=request.getQueryString()%>">Cinema<span
							class="logo_colour">Zone</span></a>
					</h1>
					<h2>A quick and easy way to find your favorite movies</h2>
				</div>
			</div>
			
		</div>
		<div id="content_header"></div>
		<div id="site_content">
			<div id="sidebar_container">
				<div class="sidebar">
					<div class="sidebar_top"></div>
					<div class="sidebar_item">
						<!-- insert your sidebar items here -->
						<h3>Latest News</h3>
						<h5>October 28th, 2018</h5>
						<p>So ... Other relevant news coming soon .</p>
					</div>
					<div class="sidebar_base"></div>
				</div>
				<div class="sidebar">
					<div class="sidebar_top"></div>
					<div class="sidebar_item">
						<h3>Honorable mentions</h3>
						<ul>
							<li><a href="www.stackoverflow.com">Stack Overflow </a></li>
						</ul>
					</div>
					<div class="sidebar_base"></div>
				</div>
				<div class="sidebar">
					<div class="sidebar_top"></div>
					<div class="sidebar_item"></div>
					<div class="sidebar_base"></div>
				</div>
			</div>
			<div id="content">
				<!-- insert the page content here -->
				<% 
				 for (int i=0; i<Integer.parseInt(request.getParameter("moviesNumber")); i++) {
              %> 
              <h<%=i%>> <img src=<%=request.getParameter("image"+i)%> alt = "oops.Something went wrong" width="350" height="450"> </h<%=i%>>
              <p></p>
			  <h<%=i%> style="font-size:40;" ><%=request.getParameter("name"+i)%> </h<%=i %>>
			  <p></p>
			  <h<%=i%>><%=request.getParameter("description"+i)%> </h<%=i %>>	
			  <p></p>	
			  <p></p>
             <%
        }
    %>			  
   			 <form action="query/admin/<%=request.getParameter("id")%>/clearMovies">
			  <input type="submit" class= "button" value="Clear Movies" >
			  </form>
			</div>
		</div>
</body>
</html>