<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : ${param.name }<br>
나이 : ${param.age }<br>
아이디 : ${sessionScope.id }<br>
<a href="d.jsp?name=${param.name }">페이지이동</a>
</body>
</html>