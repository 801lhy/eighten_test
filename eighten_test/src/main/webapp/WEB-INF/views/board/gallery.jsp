<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_gallery</title>
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
	          <h2>갤러리</h2>
	          <ol>
	            <li><a href="index.html">게시판</a></li>
	            <li>갤러리</li>
	          </ol>
	        </div>
	
	      </div>
	    </section>
		
		<!-- ======= Inner Page ======= -->	
	    <section class="inner-page">
			<div class="container">
				<div class="section-title">
			  		<h2>Gallery</h2>
			  		<p>아이튼 포토 갤러리 입니다.</p>
			 	</div>
			 	
			 
			 	<div class="row table_search mb-2 mt-2">
				    <div class="col-md-3 offset-md-5 row justify-content-end">
				        <select name="field" class="col-md-6">
				            <option value="">제목</option>
				            <option value="">내용</option>
				        </select>
				    </div>
				    <form class="col-md-4 row search_form">
				        <input class="col-md-8" placeholder="검색 키워드 입력" aria-label="Search">
				        <button class="btn col-md-4 btn-info" type="submit">Search</button>
				    </form>
				</div>
				
			    <!-- ==== Gallery Section ==== -->
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
				
				<nav aria-label="Page navigation example">
				  <ul class="pagination justify-content-center">
				    <li class="page-item">
				      <a class="page-link" href="#" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    <li class="page-item"><a class="page-link" href="#">1</a></li>
				    <li class="page-item"><a class="page-link" href="#">2</a></li>
				    <li class="page-item"><a class="page-link" href="#">3</a></li>
				    <li class="page-item">
				      <a class="page-link" href="#" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				  </ul>
				</nav>
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