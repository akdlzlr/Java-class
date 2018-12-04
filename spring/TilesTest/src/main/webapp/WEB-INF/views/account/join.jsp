<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class="col-md-6 offset-md-3">
		<h1 class="my-5">회원가입</h1>
		<form:form commandName="member">
			<div class="md-form">
				<form:input path="userId" class="form-control" />
				<label for="userId">사용자 ID</label>
			</div>
			<form:errors path="userId" element="div" cssClass="error" />
			<div class="md-form">
				<form:input path="password" class="form-control" />
				<label for="password">비밀번호</label>
			</div>
			<form:errors path="password" element="div" cssClass="error" />
			<div class="md-form">
				<form:input path="name" class="form-control" />
				<label for="name">이름</label>
			</div>
			<form:errors path="name" element="div" cssClass="error" />
			
			<button class="btn btn-info btn-block my-4" type="submit">가입하기</button>
		
		</form:form>
	</div>
</div>