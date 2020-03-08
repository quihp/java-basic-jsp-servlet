<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title><dec:title default="Trang chủ" /></title>

<!-- Bootstrap core CSS -->
<link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/shop-homepage.css" rel="stylesheet">

</head>

<body>
	<%@ include file="/common/web/header.jsp"%>

	<div class="container">
		<dec:body/>
	</div>

	<%@ include file="/common/web/footer.jsp"%>

	<script src='<c:url value="/template/web/bootstrap/js/jquery.min.js"/>'></script>
	<script src='<c:url value="/template/web/bootstrap/js/bootstrap.bundle.min.js"/>'></script>


</body>
</html>