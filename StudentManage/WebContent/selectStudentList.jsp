<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

table, tr, td {
	width : 500px;
	border : 1px solid black;
	border-collapse: collapse;
}

</style>
</head>
<body>
	<table>
		<tr>
			<td>학번</td>
			<td>이름</td>
			<td>학과</td>
		</tr>
		<c:forEach items="${list }" var="student" >	<%-- items는 : 뒷부분, var는 e부분 --%>
			<tr>
				<td>${student.stuNum }</td>
				<td><a href="selectStudentDetail.st?name=${student.name }">${student.name }</a></td>
				<td>${student.major }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>










