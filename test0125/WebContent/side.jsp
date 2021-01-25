<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String menubar = "";
	String admin = "admin";
	String loginId2 = (String)session.getAttribute("loginId");
	


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
ul {
	padding : 0px;
	
}

</style>
</head>
<body>
<ul style="list-style-type: none;">
	<li><a href="templet.jsp?main=put.jsp">학생등록</a></li>
	<li><a href="templet.jsp?main=search.jsp">학생조회</a></li>
</ul>
</body>
</html>