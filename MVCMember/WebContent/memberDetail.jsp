<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>성별</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td>${member.id }</td>
			<td>${member.password }</td>
			<td>${member.name }</td>
			<td>${member.age}</td>
			<td>${member.gender}</td>
			<td>${member.email }</td>
		</tr>
	
	
	</table>
</body>
</html>