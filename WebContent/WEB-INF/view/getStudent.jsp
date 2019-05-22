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
		<div class="col-md-4" style="background:#C6E2FF">
		<br>
			<form action="/springmvcdemo/demo/student/get">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="请输入姓名"
						name="name"> <br>
					<button type="submit" class="btn btn-primary btn-lg">Submit</button>
					
						<a href="/springmvcdemo/demo/student/addstudent">新增</a>
					
				</div>
			</form>
			<form>
				<div class="form-group">
					<table class="table table-striped table-bordered table-hover">
						<tr class="active">
							<th>编号</th>
							<th>姓名</th>
							<th>操作</th>

						</tr>
						<c:forEach items="${stulist}" var="stu">
							<tr>
								<td class="success">${stu.id}</td>
								<td class="info">${stu.name}</td>
								<td class="danger"><a
									href="/springmvcdemo/demo/student/change?id=${stu.id}">修改</a> <a
									href="/springmvcdemo/demo/student/remove?id=${stu.id}">删除</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
</body>
</html>