<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<div class="bg_resort bg-base">
	<div class="mask flex-center rgba-white-strong">
		<div class="container">
			<iot:page-header icon="hotel" title="숙소 목록" />

			<div class="my-3 text-right">
				<form action="search">
					검색 : <select name="category">
						<option value="">검색항목</option>
						<option value="가족호텔">가족호텔</option>
						<option value="소형호텔">소형호텔</option>
						<option value="한국전통호텔">한국전통호텔</option>
						<option value="호스텔">호스텔</option>
						<option value="휴양 콘도미니엄">휴양 콘도미니엄</option>
					</select>
					<button type="submit">
						<i class="fas fa-search"></i>
					</button>
				</form>
			</div>

			<div class="text-right">( 총 ${pagination.total}건 )</div>

			<table class="table table-stripped">
				<thead>
					<tr>
						<th style="width: 10px">No</th>
						<th style="width: 100px">종류</th>
						<th style="width: 100px">지역</th>
						<th style="width: 120px">숙소이름</th>
						<th style="width: 120px">객실 수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="resort" items="${list}" varStatus="status">
						<tr>
							<td>${resort.resortId}</td>
							<td>${resort.type}</td>
							<td>${resort.region}</td>
							<td><a
								href="view/${resort.resortId}?page=${pagination.page}">
									${resort.name}</a></td>
							<td>${resort.room}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<iot:pagination />
		</div>
	</div>
</div>