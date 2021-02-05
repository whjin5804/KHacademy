<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
   text-align: center;
   margin-top: 50px;
}
table {
   margin: 0 auto;
}
tr,td{
   padding: 10px;
}
input[type="text"]{
   width: 98%;
}
</style>
</head>
<body>
<div>
<h2>REGISTER</h2><br><br>
<form action="boardWrite.bo" method="post">
<table>
   <tr>
      <td>제목</td>
      <td><input type="text" style="border-color: lightgray" name="title" required autocomplete="off"></td>
   </tr>
   <tr>
      <td>내용</td>
      <td>
         <textarea cols="60" rows="10" style="border-color: lightgray" name="content"></textarea>
      </td>
   </tr>
</table>
	<input type="hidden" name="title" value="title">
	<input type="hidden" name="content" value="content">
	<input type="submit" value="등록">
</form>
</div>
</body>
</html>
