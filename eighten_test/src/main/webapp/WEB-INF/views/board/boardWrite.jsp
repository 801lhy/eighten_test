<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_BoardWrite</title>
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
	
	<!-- JSTL library -->
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	
	
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
	          <h2>게시글 작성</h2>
	        </div>
	
	      </div>
	    </section>
		
		<!-- ======= Inner Page ======= -->	
	    <section class="inner-page">
			<div class="container">
				<div class="section-title">
			  		<h2>Write</h2>
			  		<p>게시글 작성</p>
			 	</div>
			 	<div class="col-lg-12">
			 		<form role="form" id="writeForm" method="post" action="${pageContext.request.contextPath}/board/boardWrite">
			 			<div class="box-body">
			 				<div class="form-group">
			 					<label for="title">제목</label>
			 					<input class="form-control" id="title" placeholder="제목을 입력해 주세요">
			 				</div>
			 				<div class="form-group">
			 					<label for="content">내용</label>
			 					<textarea class="form-control" id="content" name="content" rows="30" placeholder="내용을 입력해 주세요" style="resize: none;"></textarea>
		 					</div>
		 					<div class="form-group">
		 						<label for="writer">작성자</label>
		 						<input class="form-control" id="writer" name="writer">
		 					</div>
		 					<!-- 첨부파일 영역 추가 -->
		 					<div class="form-group">
		 						<div class="fileDrop">
		 							<br/>
		 							<br/>
		 							<br/>
		 							<br/>
		 							<p class="text-center"><i class="fa fa-paperclip"></i>첨부파일을 드래그해주세요</p>
		 						</div>
	 						</div>
	 						<div class="box-footer">
	 							<button type="button" class="btn btn-primary listBtn"><i class="fa fa-list"></i>목록</button>
	 							<div class="pull-right">
	 								<button type="reset" class="btn btn-warning"><i class="fa fa-reply"></i>초기화</button>
	 								<button type="submit" class="btn btn-success"><i class="fa fa-save"></i>저장</button>
	 							</div>
	 						</div>
			 			</div>
			 		</form>
			 	
			 	</div>
			 	<hr>
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
	
	<!-- Handlebars 라이브러리 : 동적 HTML 코드 생성 -->
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.11/handlebars.min.js"></script> -->
	
	<!-- Template Main JS File -->
	<script src="../resources/js/main.js"></script>

</body>
</html>