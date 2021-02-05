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
	width : 800px;
	border: 1px solid black;
	border-collapse: collapse;
	margin : 0 auto;
}

tr, td {
	border: 1px solid black;
	
}

.title{
	text-align: center;
	font-weight: bold;
}

.btnDiv{
	text-align: center;
	margin-top: 15px;
}

a {
	color : black;
	text-decoration: none;
}

a:hover{
	color : black;
}

a:active {
	color : black;
}

.menu {
	width:800px;
	text-align: right;
	margin: 0 auto;

}


#title{
	color: blue;
}

.content{
	text-align: center;
}
</style>
</head>
<body>
<div>
	<div style="height: 30px;"></div>
	<div class="menu">
		<c:if test="${not empty sessionScope.loginInfo}">
			${sessionScope.loginInfo.name }님 반갑습니다
			<a href="logout.me">LOGOUT</a>
		</c:if>
		<c:if test="${empty sessionScope.loginInfo }">
		<h3>
			<a href="loginForm.me">LOGIN</a> 
			<a href="joinForm.me">JOIN</a>
		</h3>
		</c:if>
		
	</div>
	<table>
		<colgroup>
			<col width="10%">
			<col width="*">
			<col width="15%">
			<col width="15%">
			<col width="10%">
		</colgroup>
		<tr class="title">
			<td>NO</td>
			<td>제 목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
 		<c:forEach items="${list }" var="board">
			<tr>
				<td class="content">${board.boardNum }</td>
				<td><a href="boardDetail.bo?
				boardNum=${board.boardNum }&title=${board.title }&memberId=${board.memberId }&createDate=${board.createDate }&readCnt=${board.readCnt }&content=${board.content}" id="title">${board.title }</a></td>
				<td class="content">${board.memberId }</td>
				<td class="content">${board.createDate }</td>
				<td class="content">${board.readCnt }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="btnDiv">
		<c:if test="${not empty sessionScope.loginInfo}">
			<input type="button" value="글쓰기"
			onclick="location.href='boardWriteForm.bo';">
		</c:if>
	</div>
</div>
</body>
</html>



