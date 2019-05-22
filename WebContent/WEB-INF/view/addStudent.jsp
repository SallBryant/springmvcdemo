<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>查询学生</title>
</head>
<body>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4" style="background: #C6E2FF">
			<br>
			<form action="/springmvcdemo/demo/student/add">
				<div class="form-group">
					<label for="exampleInputEmail1">编号</label> <input type="text"
						class="form-control"  name="id">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">姓名</label> <input type="text"
						class="form-control"  name="name">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
</body>
</html>