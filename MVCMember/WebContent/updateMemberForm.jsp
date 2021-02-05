<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateMember.me" method="post">
	아이디 : <input type="text" name="id" value="${member.id }" readonly><br>
	비밀번호 : <input type="password" name="password" value="${member.password }" readonly><br>
	이름 : <input type="text" name="name"  value="${member.name }"><br>
	나이 : <input type="text" name="age" value="${member.age }"><br>
	성별 : 
		<input type="radio" name="gender" value="남" checked readonly>남
		<input type="radio" name="gender" value="여" readonly>여<br>
	이메일 : <input type="email" name="email" value="${member.email }"readonly><br>
	<input type="submit" value="수정">
</form>
</body>
</html>