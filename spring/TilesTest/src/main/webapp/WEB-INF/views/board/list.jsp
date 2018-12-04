<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1 class="my-5">
	<i class="far fa-list-alt"></i> 게시글 목록
</h1>

<div class="my-3 text-right">
	<c:if test="${not empty USER}">
		<a href="write"><i class="far fa-sticky-note"></i> 새 글 작성 </a>
	</c:if>
	( 총 : ${totalCount} 건)
</div>

<table class="table table-striped">
	<thead>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
	</thead>

	<tbody>
		<tr>
			<c:forEach var="board" items="${list}" varStatus="status">
				<tr>
					<td>${status.index+(page-1)*10+1}</td>
					<td>
						<a href="view?id=${status.index+(page-1)*10+1}">
						${board.title}</a>
					</td>
					<td>${board.writer}</td>
					<td><fmt:formatDate value="${board.regDate}"
							pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>
		</tr>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/common/pagination.jsp"/>