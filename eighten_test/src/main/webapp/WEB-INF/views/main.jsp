<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_main</title>
	<meta content="" name="descriptison">
	<meta content="" name="keywords">
	
	<!-- Favicons -->
	<link href="./resources/img/favicon.png" rel="icon">
	<link href="./resources/img/apple-touch-icon.png" rel="apple-touch-icon">
	
	<!-- Google Fonts -->
	<link
		href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Dosis:300,400,500,,600,700,700i|Lato:300,300i,400,400i,700,700i"
		rel="stylesheet">
	
	<!-- Vendor CSS Files -->
	<link href="./resources/vendor/bootstrap/css/bootstrap.min.css"	rel="stylesheet">
	<link href="./resources/vendor/icofont/icofont.min.css" rel="stylesheet">
	<link href="./resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
	<link href="./resources/vendor/venobox/venobox.css" rel="stylesheet">
	<link href="./resources/vendor/line-awesome/css/line-awesome.min.css" rel="stylesheet">
	<link href="./resources/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
	
	<!-- <link href="./resources/slick/slick.css" type="text/css" rel="stylesheet">
	<link href="./resources/slick/slick-theme.css" type="text/css" rel="stylesheet"> -->
	
	<!-- Template Main CSS File -->
	<link href="./resources/css/style.css" rel="stylesheet">
	
	
	<!-- =======================================================
	  * Template Name: Butterfly - v2.1.0
	  * Template URL: https://bootstrapmade.com/butterfly-free-bootstrap-theme/
	  * Author: BootstrapMade.com
	  * License: https://bootstrapmade.com/license/
	  ======================================================== -->
</head>

<body>
	<!-- ======= Header ======= -->	
	<jsp:include page="./include/header.jsp"></jsp:include>
	
	<!-- ======= main_slidebar Section ======= -->
	<section id="hero" class="d-flex align-items-center">
		<div class="container">
			<div class="owl-carousel testimonials-carousel">

				<div class="testimonial-item">
					<img src="./resources/img/main_1.jpg" class="testimonial-img" alt="">
				</div>

				<div class="testimonial-item">
					<img src="./resources/img/main_2.jpg" class="testimonial-img" alt="">
				</div>

				<div class="testimonial-item">
					<img src="./resources/img/main_3.jpg" class="testimonial-img" alt="">
				</div>

			</div>
		</div>
	</section>
	<!-- End Hero -->

	<!-- ======= main ======= -->
	<main id="main">
		<!-- ======= About Section ( video ) ======= -->
		<section id="about" class="about">
			<div class="container">
				<div class="row">
					<div class="col-xl-5 col-lg-6 d-flex justify-content-center video-box align-items-stretch">
						<a href="https://www.youtube.com/watch?v=DV2Y2CLLgiA" class="venobox play-btn mb-4" data-vbtype="video"	data-autoplay="true"></a>
					</div>

					<div class="col-xl-7 col-lg-6 icon-boxes d-flex flex-column align-items-stretch justify-content-center py-5 px-lg-5">
						<h3>진짜 코딩교육이 나타났다.</h3>
						<p>아이튼은 차별화된 인공지능을 제공합니다.</p>

					</div>
				</div>

			</div>
		</section>
		<!-- End About Section -->


				
		 <!-- ======= Notice Section ======= -->
	    <section id="team" class="team section-bg">
	      <div class="container">
	        <div class="section-title">
	          <h2>Notice</h2>
	          <button type="button" class="btn btn-info">공지사항 더보기</button>
	        </div>
			<table class="table table-hover">
			  <thead>
			    <tr>
			      <th scope="col">Notice Title</th>
			      <th scope="col">Date</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <td><a href="">에이튼 8월 주요일정 안내</a></td>
			      <td>2020-07-29</td>
			      
			    </tr>
			    <tr>
			      <td><a href="">원데이 인공지능 알고리즘 영재 특강</a></td>
			      <td>2020-07-20</td>
			    </tr>
			    <tr>
			      <td><a href="">에이튼 7월 주요일정 안내</a></td>
			      <td>2020-07-3</td>
			    </tr>
			  </tbody>
			</table>
	      </div>
	    </section><!-- End Team Section -->
	
	    <!-- ======= Gallery Section ======= -->
	    <section id="gallery" class="gallery">
	      <div class="container">
	
	        <div class="section-title">
	          <h2>Gallery</h2>
	          <button type="button" class="btn btn-info">갤러리 더보기</button>
	        </div>
	
	        <div class="album py-5">
			        <div class="container">
						<div class="row">
							<div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
				            <div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
				            <div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
				            <div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
				            <div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
				            <div class="col-md-4">
								<div class="card mb-4 shadow-sm">
									<a href="www.naver.com">
										<img class="card-img-top" data-src="" alt="" style="height: 225px; width: 100%; display: block;" src="${pageContext.request.contextPath}/resources/img/about.png" data-holder-rendered="true">
									</a>
									<div class="card-body">
										<p class="card-text">
											<a href="http://naver.com">
												[webzine vol.01] 아이튼 에이스 이근서 교육팀장을 만나 아이튼 에이스에 대해 들어 보았다!
											</a>
										</p>
									</div>
								</div>
				            </div>
			          	</div>
			        </div>
		      	</div>
	
	      </div>
	    </section><!-- End Gallery Section -->


	</main>
	<!-- End #main -->
	
	<!-- ======= Footer ======= -->	
	<jsp:include page="./include/footer.jsp"></jsp:include>
	<!-- End Footer -->

	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="./resources/vendor/jquery/jquery.min.js"></script>
	<script src="./resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="./resources/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="./resources/vendor/php-email-form/validate.js"></script>
	<script src="./resources/vendor/venobox/venobox.min.js"></script>
	<script src="./resources/vendor/waypoints/jquery.waypoints.min.js"></script>
	<script src="./resources/vendor/counterup/counterup.min.js"></script>
	<script src="./resources/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="./resources/vendor/owl.carousel/owl.carousel.min.js"></script>
	<script src="./resources/vendor/owl.carousel/owl.carousel.min.js"></script>
	
	<!-- <script src="./resources/vendor/slick/slick.min.js"></script> -->
	
	<!-- Template Main JS File -->
	<script src="./resources/js/main.js"></script>
	

</body>

</html>