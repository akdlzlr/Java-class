<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.fruit==1}">
			<span style="color: red;"><h1>사과</h1></span>
		</c:when>
		<c:when test="${param.fruit==2}">
			<span style="color: green;"><h1>메론</h1></span>
		</c:when>
		<c:when test="${param.fruit==3}">
			<span style="color: yellow;"><h1>바나나</h1></span>
		</c:when>
	</c:choose>
</body>
</html>