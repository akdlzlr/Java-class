<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script>
	$(function() {
		$("#id-check").click(
				function() {
					var userId = $('#userId').val();
					// 브라우저에서 실행하므로 루트를 신경써야함

					if (!userId) {
						return alert('사용자 ID를 입력하세요.');
					}

					var url = '${context}/account/idcheck'; //	?userId='+userId;
					//	jsp는 문자열로 해석하기 때문에 뒤에 el식 표현을 이스케이프 시켜 단순 문자열로 인식하게 한다.
					//  var url=`${context}/idcheck?userId=\${userId}`;

					var params = {
						userId : userId
					};

					$.get(url, params, function(data) {
						if (data == "ok") { //아이디가 중복 아님
							$('.check-result').text('사용 가능한 ID 입니다.').addClass(
									'text-success').removeClass('error');
							$('[type=submit]').prop('disabled', false);
						} else { // 아이디가 중복
							$('.check-result').text('이미 사용중인 ID 입니다.')
									.removeClass('text-success').addClass(
											'error');
							$('[type=submit]').prop('disabled', true);
						}
					});
				});

		$('#userId').keyup(
				function() {
					$('.check-result').text('ID 중복검사를 하세요.').removeClass(
							'text-success').removeClass('error');
					$('[type=submit]').prop('disabled', true);
				});

		$('form').submit(function(e) {
			e.preventDefault();

			//	비밀번호 확인.
			var password = $('[name=password]').val();
			var password2 = $('[name=pwdCheck]').val();
			if (password != password2) {
				alert('비밀번호가 일치하지 않습니다.');
				$('[name=password]').focus();
				return;
			}
			this.submit();

		});

	});
</script>


<div class="row">
	<div class="col-md-6 offset-md-3">
		<h1 class="my-5">회원가입</h1>
		<form:form commandName="member">
			<div class="md-form">
				<form:input path="userId" class="form-control" />
				<label for="userId">사용자 ID</label>
				<form:errors path="userId" element="div" cssClass="error" />
			</div>

			<p>
				<button type="button" id="id-check">ID 중복 검사</button>
				<span class="check-result"></span>
			</p>

			<div class="md-form">
				<form:input path="password" class="form-control" />
				<label for="password">비밀번호</label>
				<form:errors path="password" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<label for="pwdCheck">비밀번호 확인</label> <input type="password"
					id="pwdCheck" name="pwdCheck" class="form-control" />
			</div>

			<div class="md-form">
				<form:input path="name" class="form-control" />
				<label for="name">이름</label>
				<form:errors path="userId" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<form:input path="email" class="form-control" />
				<label for="email">email</label>
				<form:errors path="email" element="div" cssClass="error" />
			</div>

			<div class="md-form">
				<form:input path="phoneNumber" class="form-control" />
				<label for="phoneNumber">전화번호</label>
			</div>

			<div class="md-form">
				<form:input path="nickName" class="form-control" />
				<label for="nickName">닉네임</label>
			</div>

			<div class="md-form">
				<form:input path="address" class="form-control" />
				<label for="address">주소</label>
			</div>

			<button class="btn btn-info btn-block my-4" type="submit" disabled>가입하기</button>

		</form:form>
	</div>
</div>