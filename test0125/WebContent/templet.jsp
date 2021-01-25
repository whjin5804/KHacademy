<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%	

	String menubar = "";
	String id = request.getParameter("id");
	session.setAttribute("loginId", id);
	String loginId = (String) session.getAttribute("loginId");
	if(loginId == null){
		menubar = "";
	}
	else if(loginId != null && loginId.equals("admin")){
		menubar = "amin.jsp";
	}
	else{
		menubar = loginId;
	}
	
	String mainbar = "";
	String main = request.getParameter("main");
	if(main == null){
		mainbar = "main.jsp";
	}
	else{
		mainbar = main;		
	}
	
	String topper1 = request.getParameter("topper1");
	String topper = "";
	if(loginId == null){
		topper = "top.jsp";
	}
	else{
		topper = topper1;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

table {
	width: 100%;
	height: 100%;
	border-collapse: collapse;
}

tr, td{
	height : 300px;
}

#top{
	height : 35%;
}
#side{
	width : 300px;
}

#bottom {
	height : 30%;
}

#mainDiv {
	text-align: center;
}

</style>
</head>
<body>
<table border="1">
	<tr>
		<td colspan="3" id="top"><jsp:include page="<%=topper %>"/></td>
	</tr>
	<tr>
		<td rowspan="2" id="side">
		<jsp:include page="side.jsp"/>
		<a href="templet.jsp?main=amin.jsp">관리자메뉴</a>
		</td>
		<td colspan="2" id="mainDiv">
		<jsp:include page="<%=mainbar %>"/>
		</td>
	</tr>
	<tr>
		<td colspan="2" id="bottom">
		<jsp:include page="bottom.jsp"/>
		</td>
	</tr>
	

</table>
</body>
</html>