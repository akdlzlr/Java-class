<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!--Main container-->
<div class="container">
	<!--Carousel Wrapper-->
	<div id="carousel-example-2" class="carousel slide carousel-fade my-4"
		data-ride="carousel">
		<!--Indicators-->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-2" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-2" data-slide-to="1"></li>
			<li data-target="#carousel-example-2" data-slide-to="2"></li>
		</ol>
		<!--/.Indicators-->
		<!--Slides-->
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active">
				<div class="view">
					<img class="d-block" src="resources/image/1.jpg" width="1140"
						height="504" alt="First slide">

				</div>
			</div>
			<div class="carousel-item">
				<!--Mask color-->
				<div class="view">
					<img class="d-block" src="resources/image/2.jpg" width="1140"
						height="504" alt="Second slide">

				</div>
			</div>
			<div class="carousel-item">
				<!--Mask color-->
				<div class="view">
					<img class="d-block" src="resources/image/4.jpg" width="1140"
						height="504" alt="Third slide">

				</div>
			</div>
		</div>
		<!--/.Slides-->
		<!--Controls-->
		<a class="carousel-control-prev" href="#carousel-example-2"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carousel-example-2"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
		<!--/.Controls-->
	</div>
	<hr>
	<div class="row my-3">
		<!--Grid column-->
		<c:forEach var="item" items="${list}" varStatus="status">
			<div class="col-lg-4 col-md-12">
				<div class="card">
					<div class="view overlay">
						<img src="resources/image/food${item.imageList[0]}" width="350"
							height="233" class="card-img-top" alt=""> <a href="${context }/restaurant/view/${item.restaurantId}">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">${item.name }</h4>
						<p class="card-text">
							${item.mainMenu }<br> ${item.address }
						</p>
						<a href="${context }/restaurant/view/${item.restaurantId}"
							class="btn winter-neva-gradient">Button</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<hr>
	<div class="row my-3">
		<c:forEach var="item2" items="${list2}" varStatus="status">
			<div class="col-lg-4 col-md-12">
				<div class="card">
					<div class="view overlay">
						<img src="resources/image/room${item2.imageList[0]}" width="350"
							height="233" class="card-img-top" alt=""> <a href="${context }/resort/view/${item2.resortId}">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">${item2.name}</h4>
						<p class="card-text">
							${item2.type }, 객실수:${item2.room}<br> ${item2.address }
						</p>
						<a href="${context }/resort/view/${item2.resortId}"
							class="btn winter-neva-gradient">Button</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<hr>
	<div class="row my-3">
		<hr>
		<c:forEach var="item3" items="${list3}" varStatus="status">
			<div class="col-lg-4 col-md-12">
				<div class="card">
					<div class="view overlay">
						<img src="resources/image/${item3.imageList[0]}" width="350"
							height="233" class="card-img-top" alt=""> <a href="${context }/tour/view/${item3.tourId}">
							<div class="mask rgba-white-slight"></div>
						</a>
					</div>
					<div class="card-body">
						<h4 class="card-title">${item3.name }</h4>
						<p class="card-text">
							${item3.lgType } ${itme3.mdType } ${item3.smType }<br>
							${item3.address }
						</p>
						<a href="${context }/tour/view/${item3.tourId}"
							class="btn winter-neva-gradient">Button</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>