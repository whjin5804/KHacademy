<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("id");
	session.setAttribute("loginId", id);	
	String loginId = (String)session.getAttribute("loginId");
	
	String topPage = "";
	if(loginId == null){
		topPage = "top.jsp";
	}
	else{
		topPage = "loginTop.jsp";
	}
	
	
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
<style type="text/css">
body {
	margin : 0;
}
table {
	width : 100%;
	height : 970px;
	border-collapse: collapse;
	margin : 0;
}

#top {
	padding-bottom: 30px;
	height : 100px;
}
</style>
</head>
<body>
<div>
	<table border="1">
		<colgroup>
			<col width="15%">
			<col width="*">
		</colgroup>
		<tr>
			<td colspan="2" id="top"><jsp:include page="<%=topPage %>"/></td>
		</tr>
		<tr>
			<td rowspan="2">side</td>
			<td><jsp:include page ="<%=mainPage %>"/></td>
		</tr>
		<tr>
			<td colspan="2" style="height : 200px;">bottom</td>
		</tr>
	</table>
</div>
</body>
</html>