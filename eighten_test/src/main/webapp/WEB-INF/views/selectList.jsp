<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Select</title>
</head>
<body>
<h3>TEST Board</h3>
	<c:forEach items="${list}" var="selectList">
		post_type = ${selectList.post_type}<br>
		post_idx = ${selectList.post_idx}<br>
		views = ${selectList.views}<br>
		post_title = ${selectList.post_title}<br>
		post_writer = ${selectList.post_writer}<br>
		post_date = ${selectList.post_date}<br>
		post_content = ${selectList.post_content}<br>
		file_path = ${selectList.file_path}<br>
		file_name = ${selectList.file_name}<br>
	</c:forEach>
</body>
</html>