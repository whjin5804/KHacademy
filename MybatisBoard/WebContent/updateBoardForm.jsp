<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<form action="updateBoard.bo" method="post">
<div>
<h2>Update</h2><br><br>
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
		<td colspan="3"><input type="text" name = "title" value=${board.title }></td>
	</tr>
	<tr>
		<td style="height:300px;">내용</td>
		<td colspan="3" style="height:300px;"><textarea cols="50" rows="50" name = "content">${board.content }</textarea></td>
	</tr>
	<tr>
		<td>첨부파일</td>
		<td colspan="3">${board.fileName}</td>
	</tr>
</table>
   <div id="btnDiv">
      <input type="button" value="뒤로가기" onclick="history.back();">
      <input type="submit" value="수 정 완 료">
   </div>
</div>
<input type="hidden" name="boardNum" value="${board.boardNum }">
<input type="hidden" name="memberId" value="${board.memberId }">
<input type="hidden" name="createDate" value="${board.createDate }">
<input type="hidden" name="readCnt" value="${board.readCnt }">
</form>
</body>
</html>