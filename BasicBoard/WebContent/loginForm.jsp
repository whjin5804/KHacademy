<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{
   width: 300px;
   margin: 0 auto;
}
.title{
   font-weight: bold;
   font-size: 16px;
   font-style: italic;
}
.content{
   width: 100%;
   margin-bottom: 20px;
}
input[type="text"]{
   width: 98%;
   border-radius: 10px;
   border: 1px solid purple;
   height: 20px;
}
input:focus {
   outline:none;
}
.btnDiv{
   text-align: center;
   margin-top: 15px;
}
</style>
</head>
<body>
<form action="login.me" method="post">
<div class="container">
   <div style="height: 30px;"></div>
   <fieldset>
      <legend style="font-weight: bold; font-size: 20px;">Login</legend>
      <div class="title">
         I D.
      </div>
      <div class="content">
         <input type="text" name="memberId" required>
      </div>
      <div class="title">
         PASSWORD.
      </div>
      <div class="content">
         <input type="text" name="password" required>
      </div>
      <div class="btnDiv">
         <input type="submit" value="로그인">
      </div>
   </fieldset>
</div>
</form>
</body>
</html>