<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
	border: 1px solid black;
	border-collapse: collapse;
	margin : 0 auto;
	width : 800px;
	padding : 20px;
}

tr, td{
	border: 1px solid black;
	border-collapse: collapse;
}

#btnDiv{
   text-align: center;
   margin-top: 20px;
}

</style>
</head>
<body>
<table>
	<tr>
		<td>글번호</td>
		<td>${board.boardNum}</td>
		<td>조회수</td>
		<td>${board.readCnt }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${board.memberId }</td>
		<td>작성일</td>
		<td>${board.createDate }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td colspan="3">${board.title }</td>
	</tr>
	<tr>
		<td style="height:300px;">내용</td>
		<td colspan="3" style="height:300px;">${board.content}</td>
	</tr>
	<tr>
		<td>첨부파일</td>
		<td colspan="3">${board.fileName}</td>
	</tr>
</table>

<%-- <input type="button" value="목록가기">
<input type="button" value="수정">
<form action="deleteBoard.bo?boardNum=${board.boardNum }">
<input type="submit" value="삭제">
</form> --%>
   <div id="btnDiv">
      <input type="button" value="목록가기" onclick="location.href='boardList.bo';">
      <input type="button" value="수 정" onclick="location.href='updateBoardForm.bo?boardNum=${board.boardNum}';">
      <input type="button" value="삭 제" onclick="location.href='deleteBoard.bo?boardNum=${board.boardNum}';">
   </div>

</body>
</html>