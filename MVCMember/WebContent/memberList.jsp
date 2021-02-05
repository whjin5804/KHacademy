<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
			<td>이름</td>
			<td>삭제</td>
			<td></td>
		</tr>
		<c:forEach items="${list }" var="member">
			<tr>
				<td><a href="memberDetail.me?id=${member.id }">${member.id }</a></td>
				<td>${member.name }</td>
				<td><a href="deleteMember.me?id=${member.id }">삭제</a></td>
				<td><a href="updateMemberForm.me?name=${member.name }&age=${member.age}&id=${member.id}&password=${member.password}&gender=${member.gender}&email=${member.email}">수정</a></td>
			</tr>
		</c:forEach>		
	</table>
</body>
</html>








