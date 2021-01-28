<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertStudent.st" method="post">
	학번 <input type="text" name="stuNum"><br>
	이름 <input type="text" name="name"><br>
	나이 <input type="text" name="age"><br>
	학과 <input type="text" name="major"><br>
	생일 <input type="date" name="birthday" value="2020-01-27"><br>
	성별 <input type="radio" name="gender" value="남" checked>남
		 <input type="radio" name="gender" value="여">여<br>
	<input type="submit" value="가입">
</form>
</body>
</html>