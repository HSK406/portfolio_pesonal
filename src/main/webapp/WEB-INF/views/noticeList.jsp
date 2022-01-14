<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>

<head>
<title>공지사항 페이지</title>
<meta charset="UTF-8" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="resources/css/index.css">
<script src="/resources/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$('#write').on("click", function() {
			location.href = '/writeForm.do';
		});

	});
</script>

</head>
<body>
	<div class="container">
		<img src="resources/img/notice_banner.png" alt="banner">
		<table class="table table-hover tale-striped text-center">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="listVO">
					<tr>
						<td>${listVO.noticeNum }</td>
						<td>${listVO.subject }</td>
						<td>${listVO.userId }</td>
						<td>${listVO.regDate }</td>
						<td>${listVO.viewCount }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button type="button" class="btn btn-primary" id="write">글쓰기</button>

	</div>

	<div>
		<ul class="pagination justify-content-center">
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> ◀ </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> 1 </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> 2 </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> 3 </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> 4 </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> 5 </a></li>
			<li><a href="#" style="margin-right: 5px;"
				class="text-secondary"> ▶ </a></li>
		</ul>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
		integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
		crossorigin="anonymous"></script>

</body>
</html>