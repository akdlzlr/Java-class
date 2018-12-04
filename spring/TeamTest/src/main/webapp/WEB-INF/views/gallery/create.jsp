<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="row">
	<div class="col-md-8 offset-md-2">
		<h1 class="my-5">
			<i class="far fa-edit"></i> 갤러리 작성
		</h1>

		<form:form commandName="gallery">
			<input type="hidden" name="owner" value="${USER.userId}">
			<div class="md-form">
				<label for="title"> 제 목 </label>
				<form:input path="title" class="form-control"/>
				<form:errors path="title" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<label for="description"> 설 명 </label>
				<form:textarea path="description" class="form-control" row="4" />
			</div>
			<div class="row mt-3">
				<button class="btn btn-info" type="submit">
					<i class="fas fa-check"></i> 확인
				</button>
				<button class="btn btn-info" type="reset">
					<i class="fas fa-undo"></i> 취소
				</button>
			</div>
		</form:form>


	</div>
</div>