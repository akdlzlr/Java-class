<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>예제 1]</h4>
	${"안녕!!!"}<br>
	<%="안녕!!!"%><br>
	<% out.println("안녕!!!"); %><br><br>
	
	<h4>예제2]</h4>
	정수형 : ${10} <br>
	실수형 : ${5.6}<br>
	문자열형 : ${"성윤정"	}<br>
	논리형 : ${true}<br>
	null : ${null}<br><br>
	
	<h4>예제3]</h4>
	<% 
		String name1 = new String("홍길동");
		String name2 = new String("이순신");
		String name3 = new String("홍길동");
		
		request.setAttribute("name1", name1);
		request.setAttribute("name2", name2);
		request.setAttribute("name3", name3);
	%>
	${name1}/${name2}/${name3}<br>
	${name1==name2}/${name1==name3}
</body>
</html>