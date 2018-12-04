<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name =(String)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=name%>님 안녕하세요!
	<br>
	저희 홈페이지에 방문해주셔서 감사합니다.<br>
	즐거운 시간 되세요....<br>
	<a href="main2.jsp">더보기</a>
	<a href="logout">로그아웃</a>
</body>
</html>