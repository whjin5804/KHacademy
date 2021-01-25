<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String id = (String)session.getAttribute("name");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>EL 연산자 사용</h3>
<hr>
<h5>${5 + 7 }</h5>
<h5>${10 % 3 }</h5>
<h5>${10 == 3 }</h5>
<h5>${10 eq 10}</h5>
<h5>${10 != 10}</h5>
<h5>${10 ne 10}</h5>

</body>
</html>