<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	학번 : ${stu.stuNum }<br>	<!-- stu.getStuNum이므로 set,get 메소드 형태를 지켜줘야한다. -->
	이름 : ${stu.name }<br>
	나이 : ${stu.age }<br>
	학과 : ${stu.major }<br>
	생일 : ${stu.birthday }<br>
	성별 : ${stu.gender }<br>
</body>
</html>