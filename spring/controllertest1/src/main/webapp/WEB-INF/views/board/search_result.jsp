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

	탐색 결과
	<p>검색어 : ${param.query}</p>
	<p>페이지 : ${param.page}</p>
</body>
</html>