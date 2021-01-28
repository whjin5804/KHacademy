<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="boardListForm.bo" method="post">
<table>
	<tr>
		<td>제목</td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="text" name="writer"></td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><input type="date" name="date"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea rows="10px" cols="40px" name="content">
			
			</textarea>
		</td>
	</tr>
</table>
	<input type="submit" value="완성">
</form>
</body>
</html>