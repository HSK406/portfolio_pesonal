<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="UTF-8"/>
<script src="/resources/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	$('#list').on("click", function() {
		location.href='/list.do';
	});
	
});

$(document).ready(function() {
	
	$('#noticeList').on("click", function() {
		location.href='/noticeList.do';
	});
	
});
</script>

</head>
<body>
<h1>
	안녕하세요  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<button id="list">test</button>
<button id="noticeList">공지사항 게시판</button>
</body>
</html>