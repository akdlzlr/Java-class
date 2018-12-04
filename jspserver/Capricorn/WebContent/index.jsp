<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Capricorn</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
	integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">

<c:set var="context" value="${pageContext.request.contextPath}"
	scope="request" />

<script src="${context}/bower_components/jquery/dist/jquery.min.js"></script>
<script
	src="${context}/bower_components/popper.js/dist/umd/popper.min.js"></script>
<script
	src="${context}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${context}/js/common.js"></script>

<script>
	// jquery 준비
	$(function() {

	});
</script>
</head>
<body>
	<div>
		<jsp:include page="/common/header.jsp" /><!-- 여기선 루트경로를 알고 있다. -->
		<jsp:include page="/common/menu.jsp" />

		<h1><i class="fas fa-globe-americas"></i> 여행 추천지</h1>
		<hr>

		<div id="demo" class="carousel slide mx-auto w-100"
			data-ride="carousel" style="width:100%;height:500px">

			<!-- Indicators -->

			<ul class="carousel-indicators">
				<c:forEach items="${list}" varStatus="status">
					<li data-target="#demo" data-slide-to="${status.index}"
						<c:if test="${status.first}">class="active"</c:if>></li>
				</c:forEach>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<c:forEach var="item" items="${list}" varStatus="status">
					<div
						class="carousel-item <c:if test="${status.first}">active</c:if>">
						<img class="img-fluid"
							src="${context}/images/${item.imageList[1]}"
							style="width: 100%; height: 500px">
						<div class="carousel-caption">
							<h3>${item.title}</h3>
							<p>${item.summary}</p>
						</div>
					</div>
				</c:forEach>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
		
		<div class="row p-1">
			<c:forEach var="item" items="${list2}" varStatus="status">
				<div class="col-md-4 mb-3">
					<div class="card shadow bg-white">
						<img class="card-img-top"
							src="${context}/images/${item.imageList[1]}">
						<div class="card-body">
							<h4 class="card-title">
								${item.title} <small>${item.region}</small>
							</h4>
							<p class="card-text">${item.summary}</p>
							<a class="card-link" href="${item.homePage}" target="_blank">
								<i class="fas fa-home"></i>홈페이지
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<jsp:include page="/common/footer.jsp" />
	</div>
</body>
</html>