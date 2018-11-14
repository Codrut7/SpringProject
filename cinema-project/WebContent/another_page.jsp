<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>


<html xmlns="http://www.w3.org/1999/xhtml"
>
<head>
    <title>CinemaZone</title>
    <meta name="description" content="website description"/>
    <meta name="keywords" content="website keywords, website keywords"/>
    <meta http-equiv="content-type" content="text/html; charset=windows-1252"/>
    <link rel="stylesheet" type="text/css" href="style/style.css"/>
</head>

<body>
<div id="main">
    <div id="header">
        <div id="logo">
            <div id="logo_text">
                <!-- class="logo_colour", allows you to change the colour of the text -->
                <h1><a href="home.jsp?<%=request.getQueryString()%>">Cinema<span class="logo_colour">Zone</span></a>
                </h1>
                <h2>A quick and easy way to find your favorite movies</h2>
            </div>
        </div>
        <div id="menubar">
            <ul id="menu">
                <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
                <li><a href="home.jsp?<%=request.getQueryString()%>">Home</a></li>
                <li><a href="movies.jsp?<%=request.getQueryString()%>">Movies</a></li>
                <li><a href="allMovies.jsp?<%=request.getQueryString()%>">Contact</a></li>
            </ul>
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
                <div class="sidebar_item">
                </div>
                <div class="sidebar_base"></div>
            </div>
        </div>
        <div id="content">
            <!-- insert the page content here -->
            <h1>Welcome to the cinemaZone</h1>

        </div>
    </div>
</body>
</html>