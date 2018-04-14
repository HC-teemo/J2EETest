<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Like Movie!</title>
</head>
<body style="display: flex;align-items: center;justify-content:center;height: 100vh">
	<div>
		<form action="/searchMovie" method="get">
			<input class="" type="text" placeholder="What you like" name="title">
			<input class="" type="submit" value="Search!"></input>
			<a href="allMovies" >lookall</a>
		</form>
	</div>
<script src="js/jquery-3.1.1.min.js"></script>
</body>
</html>
