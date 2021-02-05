<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<h2>Update</h2><br><br>
<form action="updateBoard.bo" method="post">
<table>
   <tr>
      <td>제목</td>
      <td><input type="text" style="border-color: lightgray" name="title" autocomplete="off"></td>
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
	<input type="hidden" name="boardNum" value="boardNum">
	<input type="submit" value="수정완료">
</form>
</div>

</body>
</html>