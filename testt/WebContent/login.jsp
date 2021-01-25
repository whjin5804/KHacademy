<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	
	String mainPage;
	if(id == null){
		mainPage = "login.jsp";
	}
	else{
		mainPage = "main.jsp";
	}

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="templet.jsp?mainPage=main.jsp" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" id="id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" id="pw"></td>
	</tr>
</table>
<input type="submit" value="로그인">
</form>
</body>
</html>