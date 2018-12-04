<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script>
	$(function() {
		tinymce.init({
			selector : 'textarea',
			language : 'ko_KR',
		});
	})
</script>

<h1 class="my-5"><i
			class="fas fa-pencil-alt"></i> 게시글 수정</h1>

<form:form commandName="board">
	<div class="md-form">
		<label for="title">제목</label>
		<form:input path="title" class="form-control"/>
	</div>
	
	<div>
		<label for="content">내용</label>
		<form:textarea path="content"/>
	</div>
	<div class="text-center">
		<a href="javascript:history.back()" class="btn btn-primary">
		 <i class="fas fa-undo-alt"></i> 돌아가기</a>
		<button type="submit" class="btn btn-primary">
			<i class="fas fa-edit"></i> 확인</button>
	</div>
</form:form>	
