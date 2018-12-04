<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width:100%; text-align:center">
		<tr>
			<th>#</th>
			<th>이름</th>
			<th>닉네임</th>
			<th>Date</th>
		</tr>

		<c:forEach var="item" items="${list}" varStatus="status">
		<!-- var에 값을 담지 않으면 자동으로 출력한다. -->
			<fmt:formatDate var="regDate" value="${item.regDate}" 
							pattern="yyyy-MM-dd"/>
			<tr>
				<td>
					${status.index+1}
				</td>
				<td>
					${item.name}
				</td>
				<td>
					<c:if test="${today==regDate}">[New]</c:if>
					${item.userid}
				</td>
				<td>
					${regDate}
				</td>
			</tr>
		</c:forEach>		
	</table>
</body>
</html>