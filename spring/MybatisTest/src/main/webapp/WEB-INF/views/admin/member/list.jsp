<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class="col-md-8 offset-md-2">
		<h1 class="my-5">
			<i class="far fa-list-alt"></i> 회원 리스트
		</h1>

		<div class="my-3 text-right">
			<form action="search">
				검색 : <select name="category">
					<option value="">검색항목</option>
					<option value="user_id">사용자ID</option>
					<option value="name">이름</option>
					<option value="email">이메일</option>
				</select> <input type="text" name="keyword" required> 
				<button type="submit"><i class="fas fa-search"></i></button>
			</form>
		</div>

		<div class="my-3 text-right">( 총 : ${pagination.total} 건)</div>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>No</th>
					<th>ID</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>email</th>
					<th>등록일</th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<c:forEach var="item" items="${list}" varStatus="status">
						<fmt:formatDate var="regDate" value="${item.regDate}"
							pattern="yyyy-MM-dd" />
						<tr>
							<td>${pagination.total-(pagination.start+status.index)+1}</td>
							<td><a href="view/${item.userId}?page=${pagination.page}">
									${item.userId}</a> <c:if test="${regDate==today}">
									<span class="badge badge-pill badge-danger"> <i
										class="fas fa-tag"></i>New
									</span>
								</c:if></td>
							<td>${item.name}</td>
							<td>${item.phoneNumber}</td>
							<td>${item.email}</td>
							<td>${regDate}</td>
						</tr>
					</c:forEach>
				</tr>
			</tbody>
		</table>

		<jsp:include page="/WEB-INF/views/common/pagination.jsp" />

	</div>
</div>