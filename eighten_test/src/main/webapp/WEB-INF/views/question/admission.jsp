<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_admission</title>
	<meta content="" name="descriptison">
	<meta content="" name="keywords">
	
	<!-- Favicons -->
	<link href="../resources/img/favicon.png" rel="icon">
	<link href="../resources/img/apple-touch-icon.png" rel="apple-touch-icon">
	
	<!-- Google Fonts -->
	<link
		href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Dosis:300,400,500,,600,700,700i|Lato:300,300i,400,400i,700,700i"
		rel="stylesheet">
	
	<!-- Vendor CSS Files -->
	<link href="../resources/vendor/bootstrap/css/bootstrap.min.css"	rel="stylesheet">
	<link href="../resources/vendor/icofont/icofont.min.css" rel="stylesheet">
	<link href="../resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
	<link href="../resources/vendor/venobox/venobox.css" rel="stylesheet">
	<link href="../resources/vendor/line-awesome/css/line-awesome.min.css" rel="stylesheet">
	<link href="../resources/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
	
	<!-- <link href="../resources/slick/slick.css" type="text/css" rel="stylesheet">
	<link href="../resources/slick/slick-theme.css" type="text/css" rel="stylesheet"> -->
	
	<!-- Template Main CSS File -->
	<link href="../resources/css/style.css" rel="stylesheet">
	
	
	<!-- =======================================================
	  * Template Name: Butterfly - v2.1.0
	  * Template URL: https://bootstrapmade.com/butterfly-free-bootstrap-theme/
	  * Author: BootstrapMade.com
	  * License: https://bootstrapmade.com/license/
	  ======================================================== -->
</head>

<body>
	<!-- ======= Header ======= -->	
 	<jsp:include page="../include/header.jsp"></jsp:include>
	<!-- ======= main ======= -->
	<main id="main">
	
		<!-- ======= Breadcrumbs ======= -->
	    <section class="breadcrumbs">
	      <div class="container">
	
	        <div class="d-flex justify-content-between align-items-center">
	          <h2>입학상담</h2>
	          <ol>
	            <li><a href="index.html">문의</a></li>
	            <li>입학상담</li>
	          </ol>
	        </div>
	
	      </div>
	    </section>
		
		<!-- ======= Inner Page ======= -->	
	    <section class="inner-page">
			<div class="container">
				<img src="../resources/img/aighten_ask_edu.jpg" class="img-fluid">
		  	</div>
	    </section>
	    
	 	<hr>
	    <!-- ======= Contact(question) ======= -->	
	    <section id="contact" class="contact">
	    	<!-- 1. title & map -->
			<div class="container">
				<div class="section-title">
			  		<h2>Contact Us</h2>
			  		<p>We Prepare the Future of AI</p>
			 	</div>
			 	<div>
		            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
						<div class="form-row">
							<div class="col-md-6 form-group">
								<input type="text" name="name" class="form-control" id="name" placeholder="이름" data-rule="required" data-msg="이름을 입력해주세요.">
			                  	<div class="validate"></div>
			                </div>
			                <div class="col-md-6 form-group">
								<input type="email" class="form-control" name="email" id="email" placeholder="이메일" data-rule="email" data-msg="올바른 이메일 형식을 입력해주세요">
								<div class="validate"></div>
			                </div>
			                <div class="col-md-6 form-group">
								<input type="tel" class="form-control" name="phone" id="phone" placeholder="연락처" data-rule="reqired" data-msg="연락처를 입력해주세요">
									<div class="validate"></div>
								</div>
								<div class="col-md-6 form-group" id="category">
									<select  class="form-control" height="">
										<option>입학상담</option>
										<option>가맹문의</option>
										<option>기타</option>
									</select>
							</div>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="subject" id="subject" placeholder="제목" data-rule="minlen:4" data-msg="제목은 최소 4글자 이상 입력해야합니다.">
							<div class="validate"></div>
						</div>
						<div class="form-group">
							<textarea class="form-control" name="message" rows="15" data-rule="required" data-msg="문의내용을 작성해주세요" placeholder="문의내용"></textarea>
							<div class="validate"></div>
						</div>
						<div class="mb-3">
							<div class="loading">Loading</div>
							<div class="error-message"></div>
							<div class="sent-message">문의가 접수되었습니다. 감사합니다.</div>
						</div>
						<div class="text-center"><button type="submit">Send Message</button></div>
		            </form>
          		</div>
		            
			</div>
	    </section>
	    
	</main>
	<!-- End #main -->
	
	<!-- ======= Footer ======= -->	
 	<jsp:include page="../include/footer.jsp"></jsp:include>
	<!-- End Footer -->

	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="../resources/vendor/jquery/jquery.min.js"></script>
	<script src="../resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="../resources/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="../resources/vendor/php-email-form/validate.js"></script>
	<script src="../resources/vendor/venobox/venobox.min.js"></script>
	<script src="../resources/vendor/waypoints/jquery.waypoints.min.js"></script>
	<script src="../resources/vendor/counterup/counterup.min.js"></script>
	<script src="../resources/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="../resources/vendor/owl.carousel/owl.carousel.min.js"></script>
	<script src="../resources/vendor/owl.carousel/owl.carousel.min.js"></script>
	
	<!-- <script src="../resources/vendor/slick/slick.min.js"></script> -->
	
	<!-- Template Main JS File -->
	<script src="../resources/js/main.js"></script>
	

</body>

</html>