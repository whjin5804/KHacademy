<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="common.css" rel="stylesheet" type="text/css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<style type="text/css">

#container{
	margin : 10 auto;
	padding : 10px;
	font-size : 20px;
	
}


table{
	width: 800px;
	margin : 0 auto;
	border-collapse: collapse;
}

tr, td, th{
	border-bottom: 1px solid gray;	
	padding: 5px;
}

th{
	background-color: #f7f7f7;
	height : 45px;
	border-top: 1px solid blue;
}

#loginDiv{
	width: 800px;
	text-align: right;
	margin : 0 auto;
	font-weight: bold;
	margin-bottom: 10px;
}

#searchDiv{
	width: 800px;
	text-align: right;
	margin : 0 auto;
	margin-bottom: 10px;
}

#btnDiv{
	text-align: center;
	margin: 0 auto;
}

 .iconInput{
	display: inline-block;
	width: 200px;
	vertical-align: middle;
	white-space: nowrap;
}

.iconInput{
  overflow: hidden;
  width: 200px;
  vertical-align: middle;
  white-space: nowrap; 
}
.iconInput input#search{
  width: 200px;
  height: 30px;
  border: 1px solid black;
  font-size: 10pt;
  float: left;
  /* color: #fff; */
  padding-left: 15px;
  border-radius: 10px;
}

.iconInput input#search:focus{
   outline: none; 
}

.iconInput button.icon{
  border: none;
  background: #232833;
  height: 30px;
  width: 30px;
  color: white;
  font-size: 10pt;
  position: relative;
  right: 30px;
  border-radius: 10px;
}
button.icon:focus{
     outline: none;
  }
button.icon:active{
     opacity: 0.8; 
  } 
</style>

</head>
<body>
<div id="container">
	<div id="loginDiv">
		<c:if test="${empty memberId}" >
		<a href="loginForm.me">LOGIN</a>
		<a href="joinForm.me">JOIN</a>
		</c:if>
		<c:if test="${not empty memberId }">
		${memberId }님 환영합니다
		<a href="logout.me">LOGOUT</a>
		</c:if>
	</div>
	
	<div id="searchDiv">
		<select>
			<option>제목</option>
			<option>내용</option>
			<option>작성자</option>
		</select>
 <div class="iconInput">
<input type="search" id="search" placeholder="Search..." />
<button class="icon" type="button"><i class="fa fa-search"></i></button>
</div> 
	</div>
	
	<div id="tableDiv">
		<table>
			<colgroup>
				<col width="10%">
				<col width="*">
				<col width="15%">
				<col width="15%">
				<col width="10%">
				<col width="10%">
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
				<th>조회수</th>
				<th>첨부</th>
			</tr>
			<c:forEach items="${list }" var="board">
				<tr>
					<td align="center">${board.boardNum }</td>
					<td><a href="boardDetail.bo?boardNum=${board.boardNum }">${board.title }</a></td>
					<td align="center">${board.memberId }</td>
					<td align="center">${board.createDate }</td>
					<td align="center">${board.readCnt }</td>
					<td></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<div id="pagingDiv"></div>
	<div id="btnDiv">
		<input type="button" value="글쓰기" onclick="location.href='boardWriteForm.bo';">
	</div>
</div>
</body>
</html>