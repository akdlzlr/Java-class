<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%-- JSP 페이지에서 에러가 발생하였을 때 보여줄 에러 페이지로 설정 --%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=2/0 %>	
</body>
</html>