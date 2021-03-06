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
<link rel="stylesheet" href="/build/jquery.periodpicker.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/momentjs/2.14.1/moment.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script>
	$(function() {
		$('#datetimepicker1').datetimepicker();
	});
</script>
<script>
	$(function() {
		$('#datetimepicker2').datetimepicker();
	});
</script>
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

h0, h1, h2, h3, h4, h5, h6, h7 {
	color: black;
	font-size: 1.4em;
}
</style>

<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="admin.jsp">Cinema<span class="logo_colour">Zone</span></a>
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
				<h2>Enter User Name :</h2>
				<form action="/cinema-project/query/admin/findClient" method="post">
					<input type="text" id="name" name="name"><br>
					<p></p>
					<input type="submit" class="button" value="Find User Movies">
				</form>


				<h2>Enter User Name :</h2>
				<form action="/cinema-project/query/admin/deleteUser" method="post">
					<input type="text" id="name" name="name"><br>
					<p></p>
					<input type="submit" class="button" value="Delete User">
				</form>

				<form action="/cinema-project/query/admin/addMovie" method="post">
					<p></p>
					<h5>
						Enter Movie Name : <input type="text" id="name" name="name"><br>
						<p></p>
						Enter Movie Description : <input type="text" id="description"
							name="description"><br>
						<p></p>
						Enter Movie Genre : <input type="text" id="genre" name="genre"><br>
						<p></p>
						Enter Image URL for the movie : <input type="text" id="image_url"
							name="image_url"><br>
						<p></p>
						Enter room for the movie : <input type="text" id="location"
							name="location"><br>
						<p></p>
						Enter starting hour for the movie : <input type="text"
							id="datetimepicker1" name="starting_hour"><br>
						<p></p>
						Enter ending hour for the movie : <input type="text"
							id="datetimepicker2" name="ending_hour"><br>
						<p></p>

						<input type="submit" class="button" value="Add Movie">

					</h5>
				</form>

				<form action="/cinema-project/query/admin/removeMovie" method="post">
					<h3>
						Enter Movie Name :
						<p></p>
						<input type="text" id="movieName" name="movieName"><br>
						<p></p>
						<input type="submit" class="button" value="Remove Movie">
					</h3>
				</form>
			</div>
		</div>
</body>
</html>