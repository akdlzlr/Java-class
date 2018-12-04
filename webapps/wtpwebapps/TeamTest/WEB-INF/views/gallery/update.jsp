<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="row">
	<div class="col-md-8 offset-md-2">
		<h1 class="my-5">
			<i class="far fa-edit"></i> 갤러리 추가
		</h1>

		<form:form commandName="gallery">
			<form:hidden path="owner" />
			<form:hidden path="galleryId" />
			<div class="md-form">
				<label for="title"> 제 목 </label>
				<form:input path="title" class="form-control" />
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
		<!-- 파일 업로드 FORM 구성 -->
		<br>
		<h4>이미지 파일 목록</h4>
		<ul>
			<c:forEach var="image" items="${gallery.list}">
				<li>${image.fileName}(${image.imageId})</li>
			</c:forEach>
		</ul>
		<hr>
		<h3>이미지 파일 추가</h3>

		<form action="add_images" method="post" enctype="multipart/form-data">
			<input type="hidden" name="galleryId" value="${gallery.galleryId}">
			<div class="md-form">
				<label>타이틀</label> <input type="text" name="title"
					class="form-control">
			</div>

			<div class="md-form">
				<label>출처</label> <input type="text" name="source"
					class="form-control">
			</div>

			<input type="file" name="files" 
				multiple="multiple" accept="image/*" required>

			<p>
				<button class="btn btn-info" type="submit">
					<i class="fas fa-check"></i> 확인
				</button>
				<button class="btn btn-info" type="reset">
					<i class="fas fa-undo"></i> 취소
				</button>
			</p>
		</form>

	</div>
</div>