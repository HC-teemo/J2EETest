<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>

		<form:form action="${pageContext.request.contextPath}/movie"
			method="POST" modelAttribute="movie">
			<br />
			<h1>增加一部电影</h1>

		名称：
		<form:input path="title" />
			<br>
			<br />
		类型:
		<form:input path="type" />
			<br />
			<br />
		上映时间:
		<form:input path="releaseYear" />

			<br />
			<br />
		国家:
		<form:input path="country" />
			<br />
			<br />
		语言：
		<form:input path="language" />
			<br />
			<br />
		片长：
		<form:input path="time" />
			<br />
			<br />
		导演：
		<form:input path="director" />
			<br />
			<br />
		主演：
		<form:input path="actor" />
			<br />
			<br />
		评分：
		<form:input path="score" />
			<br />
			<br />
			<br />
			<input type="submit" value="确认" />
		</form:form>

	</center>
</body>
</html>