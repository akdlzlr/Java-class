<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<ul class="pagination pagination-circle pg-blue justify-content-center">
	<c:if test="${page!=1}">
		<li class="page-item">
			<a class="page-link" href="?page=${page-1}">
				<i class="fas fa-angle-left"></i></a></a>
	</c:if>
	
	<c:forEach var="cnt" begin="1" end="${totalPage}">
		<li class="page-item <c:if test="${page==cnt}">active</c:if>">
			<a class="page-link" href="?page=${cnt}">${cnt}</a></li>
	</c:forEach>
	
	<c:if test="${page!=totalPage}">
		<li class="page-item">
			<a class="page-link" href="?page=${page+1}">
				<i class="fas fa-angle-right"></i></a></a>
	</c:if>
</ul>
