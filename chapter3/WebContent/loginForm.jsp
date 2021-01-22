<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form 태그로 input태그를 감싸면 감싸진 input태그의 데이터를
	전송할 수 있다. 전송을 하기 위해서는 반드시 form태그안에
	type이 submit인 input 태그가 존재해야한다.
	type이 submit인 input태그를 클릭하면 form태그의 action속성값을
	url 경로로 하는 servlet이 실행된다. 해당 servlet을 실행하면서
	동시에 form태그 안의 input태그 데이터를 함께 전송한다. 
	전송된 input태그들의 데이터는 name속성의 값으로 구분할 수 있다.
	servlet이 실행되면 doGet()메서드나 doPost()메서드가 실행되는데
	form 태그의 method속성의 값이 get이면 doGet()메서드가 실행되고
	method속성의 값이 post이면 doPost()메서드가 실행된다.-->
	
<form action="login" method="get" >
	아이디 : <input type="text" name="id" value="java"><br>
	비밀번호 : <input type="password" name="pw" value="1234"><br>
	<input type="submit" value="로그인">
</form>

</body>
</html>