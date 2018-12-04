<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="context" value="${pageContext.request.contextPath}"
	scope="request" />
<link rel="stylesheet" href="${context}/resources/css/main.css" />
</head>
<body>

	<form:form commandName="member">
		<p>
			사용자 ID
			<form:input path="userId" />
		</p>
		<form:errors path="userId" element="div" cssClass="error" />

		<p>
			비밀번호
			<form:input path="password" />
		</p>
		<form:errors path="password" element="div" cssClass="error" />

		<p>
			email
			<form:input path="email" />
		</p>
		<form:errors path="email" element="div" cssClass="error" />

		<p>
			생일 <form:input type="date" path="date"/>
		</p>

		<p>
			<input type="submit">
		</p>
	</form:form>

</body>
</html>