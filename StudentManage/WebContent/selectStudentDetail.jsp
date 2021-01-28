<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
학번 ${student.stuNum } <br>
이름 ${student.name } <br>
나이 ${student.age } <br>
학과 ${student.major } <br>
생일 ${student.birthday } <br>
성별 ${student.gender } <br>
<input type="button" value="목록가기" onclick="location.href='selectStudentList.st';">
<input type="button" value="삭제하기" onclick="location.href='deleteStudentList.st?name=${student.name }';">
<form action="updateStudentForm.st" method="post">
	<input type="hidden" name="stuNum" value="${student.stuNum }" readonly>
	<input type="hidden" name="name" value="${student.name }">
	<input type="hidden" name="age" value="${student.age }">
	<input type="hidden" name="major" value="${student.major }">
	<input type="hidden" name="birthday" value="${student.birthday }">
	<input type="hidden" name="gender" value="${student.gender }">
	<input type="submit" value="수정하기">
</form>
</body>
</html>