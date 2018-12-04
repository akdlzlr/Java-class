<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>


<div class="bg_food bg-base">
	<div class="mask flex-center rgba-white-strong">
		<div class="container">
			<iot:page-header icon="utensils" title="음식점 목록" />

			<div class="my-3 text-right">
				<form action="search">
					검색 : <select name="category">
						<option value="">검색항목</option>
						<option value="한식">한식</option>
						<option value="중식">중식</option>
						<option value="일식">일식</option>
						<option value="양식">양식</option>
						<option value="횟집">횟집</option>
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
						<th style="width: 120px">식당이름</th>
						<th style="width: 120px">주 메뉴</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="restaurant" items="${list}" varStatus="status">
						<tr>
							<td>${restaurant.restaurantId}</td>

							<td>${restaurant.type}</td>
							<td><a
								href="view/${restaurant.restaurantId}?page=${pagination.page}">
									${restaurant.name}</a></td>
							<td>${restaurant.mainMenu}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<iot:pagination />
		</div>
	</div>
</div>