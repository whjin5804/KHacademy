<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 선언문 ;붙인다.-->
<%!
	//변수선언, 메소드 선언
	String name ="안녕";
	
	public String getName(){
		return name;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식 ;붙이지않는다. -->
<%=name %> <br>
<%=getName() %>
이동했습니다.<br>
<!-- 스크립틀릿 -->
<%
	int age = 20;
%>
<%=age %>
<%for(int i = 1; i < 11; i++){%>
	<%=i %><br>
<%} %><br>

<%
	int a = 4;
	//a가 4이상이면 4 이상입니다를 출력
	//그렇지 않으면 4보다 작습니다를 출력
	if(a >= 4){%>
		4이상입니다.
	<%}
	else{%>
		4보다 작습니다.
	<%}
%>



<%
for(int i = 1; i < 4; i++){ %>

<table>
	<tr>
		<td><%=(i - 1) * 3 + 1 %></td>
		<td><%=(i - 1) * 3 + 2 %></td>
		<td><%=(i - 1) * 3 + 3 %></td>
	</tr>
	<%} %>
</table>
<%
	//1~10까지 출력하되, 짝수는 빨간색으로 출력,
	//홀수는 파란색 글자로 출력
for(int i = 1; i < 11; i++){
	if(i % 2 == 0){%>
		<a style="color : red;"><%=i %></a>
	<%}
	else{%>
		<a style="color : blue;"><%=i %></a>
	<%}
}%>
	

</body>
</html>




