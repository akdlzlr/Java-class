<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class="col-md-6 offset-md-3">
		<h1 class="my-3">정보수정</h1>
		<form:form commandName="member">
			<form:hidden path="userId"/>
			<form:hidden path="name"/>
			
			<label for="userLevel">권한</label>
			<form:select path="userLevel" items="${userLevels}" />

			<div class="md-form">
				<form:input path="email" class="form-control" />
				<label for="email">email</label>
				<form:errors path="email" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<form:input path="phoneNumber" class="form-control" />
				<label for="phoneNumber">전화번호</label>
				<form:errors path="phoneNumber" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<form:input path="nickName" class="form-control" />
				<label for="nickName">닉네임</label>
			</div>

			<div class="md-form">
				<form:input path="address" class="form-control" />
				<label for="address">주소</label>
			</div>
			
			<div class="md-form">
				<form:password path="password" class="form-control" />
				<label for="password">관리자 비밀번호</label>
				<form:errors cssClass="error"/>
			</div>
			
			
			<div class="row mt-3">
				<button class="btn btn-info" type="submit">수정하기</button>
				<a href="../view/${member.userId}?page=${param.page}" class="btn btn-info">돌아가기</a>
			</div>

		</form:form>
	</div>
</div>