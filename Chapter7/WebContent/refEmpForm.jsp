<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="showEmpInfo.emp" method="post">
이름 <input type="text" name="name"><br>
부서 
<select name="subject">
	<option value="영업부">영업부</option>
	<option value="개발부">개발부</option>
	<option value="인사부">인사부</option>
</select><br>
성별
<input type="radio" name="gender" value="남">남
<input type="radio" name="gender" value="여">여<br>
입사일 <input type="date" name="date"><br>
<input type="submit" value="등록">
</form>
</body>
</html>