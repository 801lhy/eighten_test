<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_introduce_company</title>
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
	<!-- ======= main ======= -->
	<main id="main">
	
		<!-- ======= Breadcrumbs ======= -->
	    <section class="breadcrumbs">
	      <div class="container">
	
	        <div class="d-flex justify-content-between align-items-center">
	          <h2>회사소개 - Aighten</h2>
	          <ol>
	            <li><a href="index.html">아이튼 소개</a></li>
	            <li>회사 소개</li>
	          </ol>
	        </div>
	
	      </div>
	    </section>
		
		<!-- ======= Inner Page ======= -->	
	    <section class="inner-page">
			<div class="container">
				<img src="./resources/img/company_info.jpg" class="img-fluid">
		  	</div>
	    </section>
	    
	    <!-- ======= Contact(map) ======= -->	
	    <section id="contact" class="contact">
	    	<!-- 1. title & map -->
			<div class="container">
				<div class="section-title">
			  		<h2>Aighten 오시는 길</h2>
			  		<h3>서울특별시 강남구 언주로 617, 3층</h3>
			 	</div>
			
			 	<div>
				   	<!-- <iframe 
				   	src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1841.5165733686945!2d127.0349284116795!3d37.5110818969234!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca32ebf55a083%3A0xd1554689372bfe8e!2sSsiilaeb!5e0!3m2!1sen!2skr!4v1596516450791!5m2!1sen!2skr"
				   	style="border:0; width: 100%; height: 270px;" >
				    </iframe> -->
					<div id="map" style="width:100%;height:270px;"></div>
					<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=894ff21b92a20e1db061ff8f8fc2594d&libraries=services"></script>
			    </div>
			</div>
			
	    	<!-- 2. information -->
			<div class="container">
		    	<div class="info">
					<div class = "row" >
				
						<div class="col-lg-6">
				            <div class="email">
				            	<i class="icofont-envelope"></i>
				            	<h4>Email:</h4>
				            	<p>aighten@aighten.com</p>
				            </div>
				       	</div>
				
						<div class="col-lg-6">
				            <div class="phone">
				            	<i class="icofont-phone"></i>
				            	<h4>Call:</h4>
				            	<p>02-6952-0664</p>
				            </div>
				       	</div>
				
					</div>
				</div>
			</div>	
			
	    </section>		
		
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
	
	<!-- KakaMap JS File-->
	<script src="./resources/js/map.js"></script>
	
	

</body>

</html>