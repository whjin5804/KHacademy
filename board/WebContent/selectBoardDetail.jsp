<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

table {
	border : 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

tr, td {
	border : 1px solid black;
	padding : 10px;
}

</style>
</head>
<body>
<table>
	<tr>
		<td>글 번호</td>
		<td>${number }</td>
		<td>작성자</td>
		<td>${writer }</td>
		<td>작성일</td>
		<td>${date }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td colspan="5">${title }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td colspan="5">${content }</td>
	</tr>
</table>
<input type="button" value="뒤로가기" onclick="location.href='boardList.bo';">
<form action="updateBoardForm.bo" method="post">
	<input type="hidden" name = "number" value="${number }">
	<input type="hidden" name = "writer" value="${writer }">
	<input type="hidden" name = "date" value="${date }">
	<input type="hidden" name = "title" value="${title }">
	<input type="hidden" name = "content" value="${content }">
	<input type="submit" value="수정">
</form>
<input type="button" value="삭제" onclick="location.href='';">

</body>
</html>