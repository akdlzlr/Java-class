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

	<jsp:include page="keywords.jsp" />

	게시글 작성 완료

	<p>제목 : ${board.title}</p>
	<p>작성자 : ${board.writer}</p>
	<p>내용 : ${board.content}</p>
</body>
</html>