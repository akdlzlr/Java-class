<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script>
	$(function() {
		$(".delete-btn").click(function(e) {
			e.preventDefault();
			var result = confirm('${member.userId} 회원을 삭제할가요?');
			if (result) {
				location = $(this).attr('href');
			}
		})
	});
</script>


<div class="container">
	<h1 class="ml-5 my-5">
		<i class="far fa-id-card"></i> 회원 정보
	</h1>



	<div class="row">
		<div class="col-md-2">ID</div>
		<div class="col-md-10">${member.userId}</div>
	</div>

	<div class="row">
		<div class="col-md-2">이름</div>
		<div class="col-md-10">${member.name}</div>
	</div>

	<div class="row">
		<div class="col-md-2">회원등급</div>
		<div class="col-md-10">${member.userLevel}</div>
	</div>
	<div class="row">
		<div class="col-md-2">email</div>
		<div class="col-md-10">${member.email}</div>
	</div>
	<div class="row">
		<div class="col-md-2">닉네임</div>
		<div class="col-md-10">${member.nickName}</div>
	</div>
	<div class="row">
		<div class="col-md-2">전화번호</div>
		<div class="col-md-10">${member.phoneNumber}</div>
	</div>

	<div class="row">

		<div class="col-md-2">주소</div>
		<div class="col-md-10">${member.address}</div>
	</div>

	<div class="row">
		<fmt:formatDate var="updateDate" value="${member.updateDate}"
			pattern="yyyy-MM-dd" />
		<div class="col-md-2">수정일</div>
		<div class="col-md-10">${updateDate}</div>
	</div>

	<div class="row">
		<fmt:formatDate var="regDate" value="${member.regDate}"
			pattern="yyyy-MM-dd" />
		<div class="col-md-2">등록일</div>
		<div class="col-md-10">${regDate}</div>
	</div>


	<div class="row mt-3">
		<div class="col-md-2"></div>
		<div class="col-md-10">
			<a href="../edit/${member.userId}?page=${param.page}"
					class="btn btn-primary btn-sm">수정</a>
			<a href="../delete/${member.userId}?page=${param.page}"
					class="delete-btn btn btn-primary btn-sm">삭제</a> 
			<a href="../list?page=${param.page}" 
					class="btn btn-primary btn-sm">돌아가기</a>
		</div>
	</div>
</div>