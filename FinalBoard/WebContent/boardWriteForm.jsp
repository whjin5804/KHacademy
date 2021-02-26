<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="common.css" rel="stylesheet" type="text/css">
<style type="text/css">

table {
	margin : 0 auto;
	border: 1px solid black;
	border-collapse: collapse;
	margin-top: 15px;
}

tr,td{
	border: 1px solid black;
	border-collapse: collapse;

}
#btnDivv{
	margin : 0 auto;
	text-align: center;
}
</style>
</head>
<body>
<form action="boardWrite.bo" method="post" enctype="multipart/form-data">
<div style="margin-top: 10px;"></div>
<table>
	<tr>
		<td>제목</td>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="15" cols="66" name="content"></textarea></td>
	</tr>
	<tr>
		<td>첨부파일</td>
		<td><input type="file" name="file" ></td>
	</tr>
</table>
<div id="btnDivv">
<input type="submit" value="등록">
</div>
</form>
</body>
</html>