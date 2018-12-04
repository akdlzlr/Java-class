<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<div class="row">
		<div class="col-md-8 offset-md-2">
			<h1 class="my-5">
				<i class="far fa-images"></i> 갤러리
			</h1>
			<div>
				<div class="float-left">
					<form action="list">
						정렬기준 : <select name="orderBy">
							<option value="gallery_id"
								<c:if test="${orderBy=='gallery_id'}">selected</c:if>>등록일</option>
							<option value="read_cnt"
								<c:if test="${orderBy=='read_cnt'}">selected</c:if>>조회수</option>
						</select>
						<button type="submit">
							<i class="fas fa-check"></i>
						</button>
					</form>
				</div>
				<div class="float-right">
					<a href="create"><i class="fas fa-plus"></i> 추가</a> ( 총 :
					${pagination.total} 건)
				</div>
			</div>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>제목</th>
						<th>소유자</th>
						<th>첨부사진</th>
						<th><a href="?orderBy=read_cnt">조회수</a></th>
						<th><a href="?orderBy=reg_date">등록일</a></th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<c:forEach var="item" items="${list}" varStatus="status">
							<fmt:formatDate var="regDate" value="${item.regDate}"
								pattern="yyyy-MM-dd" />
							<tr>
								<td>${item.galleryId}</td>
								<td><a
									href="view/${item.galleryId}?page=${pagination.page}">
										${item.title}</a> <c:if test="${regDate==today}">
										<span class="badge badge-pill badge-danger"> <i
											class="fas fa-tag"></i>New
										</span>
									</c:if></td>
								<td>${item.owner}</td>
								<td><c:if test="${not empty item.list[0]}">
										<img src="thumb/${item.list[0].imageId}" width="50">
									</c:if> ${item.list[0].imageId}/ ${item.list.size()}</td>
								<td>${item.readCnt}</td>
								<td>${regDate}</td>
							</tr>
						</c:forEach>
					</tr>
				</tbody>
			</table>
			<jsp:include page="/WEB-INF/views/common/pagination.jsp" />

		</div>
	</div>
</div>