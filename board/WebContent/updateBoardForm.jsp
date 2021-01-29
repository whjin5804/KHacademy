<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateBoard.bo" method="post">
<input type="hidden" name="content" value="${content }">
<table>
	<tr>
		<td>제목</td>
		<td><input type="text" name="title" value="${title }"></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="text" name="writer" value="${writer }" readonly></td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><input type="date" name="date" value="${date }" readonly ></td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea rows="10px" cols="40px" name="content">
			${content }
			</textarea>
		</td>
	</tr>
</table>
<input type="submit" value="수정">
</form>
</body>
</html>