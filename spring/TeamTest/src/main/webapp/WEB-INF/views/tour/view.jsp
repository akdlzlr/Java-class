<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="iot"%>

<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=yJBH6udesOrddgffwWZB&submodules=geocoder"></script>



<div class="bg_tour bg-base">
	<div class="mask flex-center rgba-white-strong">
		<div class="container">
			<h1 class="my-5">
				<i class="fab fa-fort-awesome"> 관광지 상세보기</i>
			</h1>

			<c:forEach var="item3" items="${list3}" varStatus="status">
				<div class="my-5">
					<img src="${context}/resources/image/${item3.imageList[0]}"
						width="40%" height="40%">
				</div>
			</c:forEach>

			<iot:board-display title="지역" item="${tour.region}" />
			<iot:board-display title="권역" item="${tour.location}" />
			<iot:board-display title="대분류" item="${tour.lgType}" />
			<iot:board-display title="중분류" item="${tour.mdType}" />
			<iot:board-display title="소분류" item="${tour.smType}" />
			<iot:board-display title="이름" item="${tour.name}" />
			<iot:board-display title="주소" item="${tour.address}" />


			<div id="map" style="width: 100%; height: 480px;" class="my-5"></div>
			<div class="text-center">
				<a href="../list?page=${param.page}"> <i
					class="fas fa-undo mr-2"></i>돌아가기
				</a>
			</div>

		</div>
	</div>
</div>


<script>
	$(function() {

		var map = new naver.maps.Map('map');
		var myaddress = '${tour.address}';// 도로명 주소나 지번 주소만 가능 (건물명 불가!!!!)
		naver.maps.Service.geocode({
			address : myaddress
		}, function(status, response) {
			if (status !== naver.maps.Service.Status.OK) {
				return alert(myaddress + '의 검색 결과가 없거나 기타 네트워크 에러');
			}
			var result = response.result;
			// 검색 결과 갯수: result.total
			// 첫번째 결과 결과 주소: result.items[0].address
			// 첫번째 검색 결과 좌표: result.items[0].point.y, result.items[0].point.x
			var myaddr = new naver.maps.Point(result.items[0].point.x,
					result.items[0].point.y);
			map.setCenter(myaddr); // 검색된 좌표로 지도 이동
			// 마커 표시
			var marker = new naver.maps.Marker({
				position : myaddr,
				map : map
			});
			// 마커 클릭 이벤트 처리
			naver.maps.Event.addListener(marker, "click", function(e) {
				if (infowindow.getMap()) {
					infowindow.close();
				} else {
					infowindow.open(map, marker);
				}
			});
			// 마크 클릭시 인포윈도우 오픈
			var infowindow = new naver.maps.InfoWindow({
				content : '<h4>${tour.name}</h4>'
			});
		});
	});
</script>