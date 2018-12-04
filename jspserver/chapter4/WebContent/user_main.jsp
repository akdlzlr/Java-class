<%@page import="edu.iot.chapter4.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member=(Member)session.getAttribute("USER");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>일반 사용자 페이지 입니다...</h1>
	<p> ID : <%=member.getUserId()%></p>
	<p> 이름 : <%=member.getName()%></p>
	<p> 역할 : <%=member.getLoginCheck()%></p>
	
	
	
	
	ID : ${USER.userId}<br>
	이름 : ${USER.name}<br>
	역할 : ${USER.loginCheck}<br>
	<a href="/logout">로그아웃</a>

</body>
</html>