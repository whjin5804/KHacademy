<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginId = (String)session.getAttribute("loginId");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	text-align: right;
}


</style>
</head>
<body>
<div>
<%=loginId %>님 반갑습니다
<a href = "logout.jsp">로그아웃</a>
</div>
</body>
</html>