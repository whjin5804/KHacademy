<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<form action="ghldnjs" method="post">
<table>
	<tr>
		<td>아이디 : </td>
		<td><input type="text" name="id"></td>
	</tr>
	
	<tr>
		<td>비밀번호 : </td>
		<td><input type="text" name="pw"></td>
	</tr>
	
	<tr>
		<td>이름 : </td>
		<td><input type="text" name="name"></td>
	</tr>
	
	<tr>
		<td>연락처 : </td>
		<td><input type="tel" name="phone"></td>
	</tr>
	
	<tr>
		<td>성별 : </td>
		<td>
		<input type="radio" name="gender" value="남">남
		<input type="radio" name="gender" value="여">여
		</td>
	</tr>
	
	<tr>
		<td>취미 : </td>
		<td>
		<input type="checkbox" name="hobby" value="독서">독서
		<input type="checkbox" name="hobby" value="게임">게임
		<input type="checkbox" name="hobby" value="운동">운동<br>
		</td>
	</tr>
	
	<tr>
		<td>가입경로 : </td>
		<td>	
			<select name="road">
			    <option value="인터넷">인터넷</option>
			    <option value="지인추천" >지인추천</option>
			    <option value="기타">기타</option>
			</select>
		</td>
	</tr>
</table>
<input type="submit" value="회원가입">
</form>
</body>
</html>