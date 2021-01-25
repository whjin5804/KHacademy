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
</head>
<body>
<div>
<%=loginId %>님 환영합니다.
<a href="logout.jsp" >로그아웃</a>
</div>
</body>
</html>