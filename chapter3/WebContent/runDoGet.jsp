<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>doGet() 메소드를 호출하는 방법</h3>
<hr>
<h5>1. a태그 사용</h5>
<a href="doGet1">클릭하면 페이지가 이동합니다.</a><br>
<a href="doGet1?name=java&age=20">
클릭하면 이름과 나이 데이터를 가지고 페이지가 이동합니다.
</a>	<!-- a태그는 doget메소드 호출 -->

<h5>2. form태그의 method 속성을 'get'으로 지정</h5>
<h5>3. url을 직접 입력하여 호출</h5>
</body>
</html>