<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입장하려면 나이를 입력하세요.
	<br>
	<form method="post">
		<input type="text" name="age"> <input type="submit" value="입장">
		<div><%=error %></div>
	</form>
	<img src="image?id=5" width="200">
	<img src="image?id=6" width="200">
	<img src="image?id=7" width="200">
	<img src="image?id=8" width="200">
</body>
</html>