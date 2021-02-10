<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
	width: 800px;
	margin : 0 auto;
	margin-top: 30px;
	padding:10px;
	border-top: 1px solid black;
	border-bottom: 1px solid black;
	border-collapse: collapse;
}

.content{
	width: 800px;
	margin : 0 auto;
	margin-top:10px;
	border-collapse: collapse;
}

#contentDiv{
	margin-bottom: 20px;
	margin-top: 30px;
	text-align: center;
}
</style>
</head>
<body>
<form action="updateBoard.bo" method="post">
<div id="tableDiv">
	<table>
		<colgroup>
			<col width="*">
			<col width="15%">
			<col width="20%">
			<col width="15%">
		</colgroup>
		<tr>
			<td><input type="text" name="title"></td>
			<td>${board.memberId }</td>
			<td>${board.createDate }</td>
			<td>${board.readCnt}</td>
		</tr>
	</table>
</div>

<div id="contentDiv">
<input type="text" name="content">
</div>
<input type="hidden" name="boardNum" value="${board.boardNum }">
<input type="submit" value="수정완료">
</form>
</body>
</html>