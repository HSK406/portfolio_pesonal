<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>list</title>
<meta charset="UTF-8" />
</head>
<body>
	<h1> List </h1>
	
	<table border="1">
		<c:forEach var="item" items="${testList}">
			<tr>
				<td><c:out value="${item.no }" /></td>
				<td><c:out value="${item.text }" /></td>
				<td><c:out value="${item.creUser }" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>