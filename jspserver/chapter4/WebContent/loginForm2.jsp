<%@page import="edu.iot.chapter4.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "";
	}
	String userId = "";
	String loginCheck = "";
	Member member = (Member) request.getAttribute("member");
	if (member != null) {
		userId = member.getUserId();
		loginCheck = member.getLoginCheck();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form method="post">
		아이디 : <input type="text" name="userId" 
							value="${member.userId}"><br>
		암 &nbsp; 호 : <input type="password" name="userPwd"><br>
		 <input	type="radio" name="loginCheck" value="user"
			<c:if test="${empty member||member.loginCheck=='user'}">
			checked="checked"
			</c:if>
			 >사용자
			<input type="radio"	name="loginCheck" value="manager"
			<c:if test="${member.loginCheck=='manager'}">
			checked="checked"
			</c:if>
			>관리자<br>
		<div class="error">${error}</div>
		<input type="submit" value="로그인">
	</form>
</body>
</html>