<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div>
		<form action="/writeResult.do" id="insertNotice" name="insertNotice"
			method="POST">
			<div>
				<h2>글쓰기</h2>
				<div>
					<table>
						<tr>
							<th>제목</th>
							<td><input style="width: 500px" id="subject" name="subject" /></td>
						</tr>
						<tr>
							<th>내용</th>
							<td><textarea style="width: 500px" rows="10" cols="10"
									id="content" name="content"></textarea></td>
						</tr>
						<tr>
							<th>작성자</th>
							<td><input style="width: 500px" id="userId" name="userId" /></td>
						</tr>
					</table>
					<div>
						<button id="submit" type="submit">작성</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
