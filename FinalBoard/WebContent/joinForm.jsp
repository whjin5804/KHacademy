<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="common.css" rel="stylesheet" type="text/css">
<style>
#container{
   margin: 30px auto;/* 상하 30px */
   width: 500px;
}
.title{
   font-size: 18px;
   font-style: italic;
   font-weight: bold;
}
div > div{
   margin: 10px auto;
}
input[type="text"], input[type="password"]{
   width: 98%;
   height: 25px;
}
.btnDiv{
   text-align: center;
}
</style>
</head>
<body>
<form action="join.me" method="post">
<div id="container">
   <div class="title title2">아이디</div>
   <div><input type="text" name="memberId" required></div>
   <div class="title">비밀번호</div>
   <div><input type="password" name="password" required></div>
   <div class="title">이름</div>
   <div><input type="text" name="name"></div>
   <div class="btnDiv">
      <input type="submit" class="btn btn-small" value="회원가입">
   </div>
</div>
</form>
</body>
</html>