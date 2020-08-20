<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	
	<title>Eighten_notice</title>
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
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	          <h2>공지사항</h2>
	          <ol>
	            <li><a href="index.html">게시판</a></li>
	            <li>공지사항</li>
	          </ol>
	        </div>
	
	      </div>
	    </section>
		
		<!-- ======= Inner Page ======= -->	
	    <section class="inner-page">
			<div class="container">
				<div class="section-title">
			  		<h2>Notice</h2>
			  		<p>중요 공지사항을 꼭 확인하세요!</p>
			 	</div>
			 
			 
			 	<!-- ========= 검색 ========= -->
				<div class="row justify-content-end">
					<div class="form-group col-md-2">
						<select class="form-control" name="searchType" id="searchType">
							<option value="n" <c:out value="${criteria.searchType == null ? 'selected' : '' }"/>>::: 선택 :::</option>
							<option value="t" <c:out value="${criteria.searchType eq 't' ? 'selected' : '' }"/>>제목</option>
							<option value="c" <c:out value="${criteria.searchType eq 'c' ? 'selected' : '' }"/>>내용</option>
						</select>
					</div>
					<div class="input-group col-md-3 row">
						<input type="text" class="form-control" name="keyword" id="keywordInput" value="${creteria.keyword}" placeholder="검색 키워드 입력"/>
						<span class="input-group-btn">
							<button type="button" class="btn btn-primary btn-flat" id="searchBtn">
								<i class="fa fa-search">Search</i>
							</button>
						</span>
					</div>
				</div>
			 	
			 	<!-- ========= 표 시작 ========= -->
			 	<table class="table table-hover text-center">
					<thead>
					    <tr>
					  	  	<th scope="col" style="width:5%"></th>
					  	  	<th scope="col" style="width:40%">제목</th>
					  	  	<th scope="col" style="width:20%">작성자</th>
					  	  	<th scope="col" style="width:25%">등록일</th>
					   		<th scope="col" style="width:10%">조회수</th>
					    </tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${fn:length(boardList)>0}">
								<c:forEach items="${boardList}" var="list">
									<tr>
										<td>${list.post_idx}</td>
										<td>
											<a href="<c:url value='/board/boardContent${pageMaker.makeSearch(pageMaker.criteria.page)}&post_idx=${list.post_idx}'></c:url>">
												${list.post_title}
											</a>
										</td>
										<td>${list.post_writer}</td>
										<td><fmt:formatDate value="${list.post_date}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
										<td>${list.views}</td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td colspan=5>작성된 게시글이 없습니다.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tbody>	
				</table>
				
				<!-- ======== 페이징 처리 ======== -->
				<nav aria-label="Page navigation example">
				  <ul class="pagination justify-content-center">
				  
				  	<!-- ====== 1 PAGE ====== -->
				  	<c:if test="${pageMaker.prev}">
					    <li class="page-item">
					    	<a class="page-link" href="${pageContext.request.contextPath}/board/notice${pageMaker.makeSearch(pageMaker.tempstartPage)}" aria-label="Previous">
					    	<span aria-hidden="true">${pageMaker.tempStartPage}</span></a>
					    </li>
					    <li class="page-item disabled"><a class="page-link">...</a></li>
				    </c:if>
				    
				    <!-- ====== CENTER PAGES ====== -->
				    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
				    	
				    	<c:choose>
				    		<c:when test="${pageMaker.nowPage==idx}">
						    	<li class="page-item active">
						    		<a class="page-link" href="${pageContext.request.contextPath}/board/notice${pageMaker.makeSearch(idx)}">${idx}</a>
						    	</li>
				    		</c:when>
												    		
				    		<c:otherwise>
						    	<li class="page-item">
						    		<a class="page-link" href="${pageContext.request.contextPath}/board/notice${pageMaker.makeSearch(idx)}">${idx}</a>
					    		</li>
				    		</c:otherwise>
				    	</c:choose>
				    	
				    </c:forEach>
				    
				    <!-- ====== LAST PAGE ====== -->
				    <c:if test="${pageMaker.next}">
				    	<li class="page-item disabled"><a class="page-link">...</a></li>
					    <li class="page-item">
					      <a class="page-link" href="${pageContext.request.contextPath}/board/notice${pageMaker.makeSearch(pageMaker.tempEndPage)}" aria-label="Next">
					      	<span aria-hidden="true">${pageMaker.tempEndPage}</span>
					      </a>
					    </li>
				    </c:if>
				    
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
	
	
	<!-- Template Main JS File -->
	<script src="../resources/js/main.js"></script>
	
	<script>
		$(document).ready(function(){
			
			$("#searchBtn").click(function(){
				self.location =
					${pageContext.request.contextPath} +"/board/notice${pageMaker.makeSearch(1)}"
					+ "&searchType=" + $("select option:selected").val()
					+ "&keyword=" + encodeURIComponent($("#keywordInput").val());
			});
		});
	</script>
	

</body>

</html>