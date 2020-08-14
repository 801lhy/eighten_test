<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<!-- ======= Header ======= -->
	<header id="header" class="fixed-top">
		<div class="container d-flex align-items-center">
			<a href="${pageContext.request.contextPath}/main" class="logo mr-auto">
				<img src="${pageContext.request.contextPath}/resources/img/logo.png" alt="Aighten" class="img-fluid">
			</a>
			<!-- Uncomment below if you prefer to use text as a logo -->
			<!-- <h1 class="logo mr-auto"><a href="index.html">Butterfly</a></h1> -->

			<nav class="nav-menu d-none d-lg-block">
				<ul>
					<li class="drop-down"><a href="${pageContext.request.contextPath}/intro_company">아이튼 소개</a>
						<ul>
							<li><a href="${pageContext.request.contextPath}/intro_company">회사 소개</a></li>
							<li><a href="${pageContext.request.contextPath}/intro_education">교육 특징</a></li>
							<li><a href="${pageContext.request.contextPath}/intro_value">교육 철학</a></li>
						</ul>
					</li>
					<li class="drop-down"><a href="${pageContext.request.contextPath}/intro_curriculum">교육 시스템</a>
						<ul>
							<li><a href="${pageContext.request.contextPath}/intro_curriculum">교육과정</a></li>
						</ul>
					</li>
					<li class="drop-down"><a href="${pageContext.request.contextPath}/board/notice">게시판</a>
						<ul>
							<li><a href="${pageContext.request.contextPath}/board/notice">공지사항</a></li>
							<li><a href="${pageContext.request.contextPath}/board/gallery">갤러리</a></li>
						</ul>
					</li>
					<li class="drop-down"><a href="">문의</a>
						<ul>
							<li><a href="${pageContext.request.contextPath}/intro_admission">입학 상담</a></li>
							<li><a href="${pageContext.request.contextPath}/intro_join">가맹 문의</a></li>
						</ul>
					</li>
					<li><a href="https://www.duru.io/main">크라우드소싱 신규사업</a></li>

				</ul>
			</nav>
		</div>
	</header>
</html>

