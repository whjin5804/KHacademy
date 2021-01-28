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
<form action="updateStudent.st" method="post">
	학번 <input type="text" name="stuNum" value="${student.stuNum }" readonly><br>
	이름 <input type="text" name="name" value="${student.name }" readonly><br>
	나이 <input type="text" name="age" value="${student.age }"><br>
	학과 <input type="text" name="major" value="${student.major }"><br>
	생일 <input type="date" name="birthday" value="${student.birthday }"><br>
	성별 
<%-- 	<c:if test="${student.gender eq '남'}">
	<input type="radio" name="gender" value="남" checked>남
	<input type="radio" name="gender" value="여" >여<br>
	</c:if>
	<c:if test="${student.gender eq '여' }">
	<input type="radio" name="gender" value="남" >남
	<input type="radio" name="gender" value="여" checked>여<br>
	</c:if> --%>
			
		<input type="radio" name="gender" value="남"  <c:if test="${student.gender eq '남' }">checked</c:if> >남
		<input type="radio" name="gender" value="여"  <c:if test="${student.gender eq '여' }">checked</c:if> >여<br>
	
	
	<input type="submit" value="가입">
</form>
</body>
</html>