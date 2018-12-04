<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark winter-neva-gradient font-weight-bold">
	<!-- Navbar brand -->

	<a class="navbar-brand"
		href="https://www.jejuair.net/jejuair/kr/main.do"><i
		class="fas fa-plane-departure"></i> Jeju</a>


	<!-- Collapse button -->
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#basicExampleNav" aria-controls="basicExampleNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<!-- Collapsible content -->
	<div class="collapse navbar-collapse" id="basicExampleNav">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="${context}/">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${context}/restaurant/list">음식점</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${context}/resort/list">숙박</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${context}/tour/list">관광지</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${context}/board/list">자유게시판</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${context}/gallery/list">갤러리</a></li>
			<c:if test="${USER.userLevel=='ADMIN'}">
				<li class="nav-item"><a class="nav-link"
					href="${context}/admin/member/list">회원관리</a></li>
			</c:if>
		</ul>

		<ul class="navbar-nav">
			<c:if test="${not empty USER}">
				<li class="nav-item"><a class="nav-link"
					href="${context}/plan/list/${USER.userId}"> 나의 여행</a></li>

				<li class="nav-item"><a class="nav-link"
					href="${context}/member/view"> <img
						src="${context}/member/avata/${USER.userId}"
						class="rounded-circle avata-sm"> ${USER.userId}
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${context}/account/logout"><i class="fas fa-sign-out-alt"></i>
						로그아웃</a></li>
			</c:if>
			<c:if test="${empty USER}">
				<li class="nav-item"><a class="nav-link"
					href="${context}/account/login"><i class="fas fa-sign-in-alt"></i>
						로그인</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${context}/account/join"><i class="fas fa-user-plus"></i>
						회원가입</a></li>
			</c:if>
		</ul>
	</div>
</nav>