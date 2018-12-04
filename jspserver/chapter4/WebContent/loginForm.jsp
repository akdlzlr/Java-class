<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String error = (String)request.getAttribute("error");
	if(error==null){
		error="";
	}
	
	String userid=request.getParameter("userid");
	if(userid==null){
		userid="";
	}
	
	String message = (String)session.getAttribute("message");
	if(message==null){
		message="";
	}else{
		// 한번 읽은 경우 세션에서 제거
		session.removeAttribute("message");
	}
	
	String destination=(String)session.getAttribute("destination");
	if(destination==null){
		destination="";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{
		color:red;
		font-weight:bolder;
	}
	.message{
		color:red;
		font-weight:bolder;
	}
</style>
</head>
<body>
	<p class="message"><%=message%></p>
	<form method="post">
		<input type="hidden" name="destination" value="<%=destination%>">
		<label for="userid">아이디 : </label>
			<input type="text" name="userid" id="userid" value="<%=userid%>">
		<br>
		<label for="userpwd">암 &nbsp; 호	:</label> 
			<input type="password" name="pwd" id="userpwd" >
		<br>
		<div class="error"><%=error %></div>
		<input type="submit" value="로그인">
	</form>
	<img src="image?id=1" width="200">
	<img src="image?id=2" width="200">
	<img src="image?id=3" width="200">
	<img src="image?id=4" width="200">
	<!-- img src="/chapter4/images/1.jpg"> 절대경로 -->
</body>
</html>