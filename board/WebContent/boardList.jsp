<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
   width: 600px;
   border: 1px solid black;
   border-collapse: collapse;
   text-align: center;
}

tr, td{
   border: 1px solid black;
}


</style>
</head>
<body>
<form action="selectBoardList.bo" method="post">
		<table>
			<tr>
				<td>글번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
			</tr>
			<c:choose>
				<c:when test="${list.size() eq 0 }">
					<tr>
						<td colspan="4">데이터가 없습니다</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list }" var="board">
						<tr>
							<td>${board.number }</td>
							<td><a href="selectBoardDetail.bo?
							number=${board.number }&title=${board.title }&writer=${board.writer }&date=${board.date }&content=${board.content }">
									${board.title }</a></td>
							<td>${board.writer }</td>
							<td>${board.date }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
		<input type="submit" value="글쓰기">
</form>
</body>
</html>