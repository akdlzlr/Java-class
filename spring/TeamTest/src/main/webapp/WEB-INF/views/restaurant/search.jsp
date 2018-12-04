<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<div class="bg_food bg-base">
	<div class="mask flex-center rgba-white-strong">
		<div class="container">
			<iot:page-header icon="utensils" title="식당 검색" />

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
			<div class="my-3 text-right">( 총 : ${list.size()} 건)</div>

			<table class="table table-striped">
				<thead>
					<tr>
						<th style="width: 10px">No</th>
						<th style="width: 100px">종류</th>
						<th style="width: 120px">식당이름</th>
						<th style="width: 120px">주 메뉴</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<c:forEach var="item" items="${list}" varStatus="status">
							<tr>
								<td>${status.index+1}</td>
								<td>${item.type}</td>
								<td><a href="view/${item.restaurantId}"> ${item.name}</a></td>
								<td>${item.mainMenu}</td>
							</tr>
						</c:forEach>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>