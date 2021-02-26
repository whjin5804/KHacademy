<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="common.css" rel="stylesheet" type="text/css">
<style type="text/css">
table{
	width: 800px;
	margin : 0 auto;
	margin-top: 30px;
	padding:10px;
	border-top: 1px solid black;
	border-bottom: 1px solid black;
	border-collapse: collapse;
}

.content{
	width: 800px;
	margin : 0 auto;
	margin-top:10px;
	border-collapse: collapse;
}

#warning{
	margin-bottom: 20px;
	font-size: 20px;
}

#contentDiv{
	margin-bottom: 20px;
}
#buttonDiv{
	text-align: center;
	margin-top: 30px;
	cursor: pointer;
}


/* 버튼을 클릭하고 있을 때 */
.btn:active {
	background-color: #f9696e;
	position: relative;
	top: 2px;
	left: 2px;
	
}

/* 버튼을 클릭햇을때 */
.btn:focus{
	outline: none;
}

.btn-small{
	font-size: 12px;
	width: 80px;
	padding: 5px 0;
}

.reply{
	margin: 20px auto;
	text-align: center;
	margin-top: 50px;
}

.replyList{
	margin-top: 50px;
}

.replyBox{
	border: 1px solid black;
}

.dateDiv{
	color : gray;
	font-size: 10px;
	margin: 10px 0;
}

.idDiv{
	color : gray;
	font-size: 14px;
}
</style>

</head>
<body>
<div id="tableDiv">
	<table>
		<colgroup>
			<col width="*">
			<col width="15%">
			<col width="20%">
			<col width="15%">
		</colgroup>
		<tr>
			<td>${board.title }</td>
			<td>${board.memberId }</td>
			<td>${board.createDate }</td>
			<td>${board.readCnt}</td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td><img alt="" src="upload/${board.fileName}" width="80px"></td>
		</tr>
	</table>
</div>
<div class="content">
<div id="warning" style="font-size: 5px;">
저작권 등 다른 사람의 권리를 침해하거나 
명예를 훼손하는 게시글은<br> 이용약관 및 관련법률에 의해 
제재를 받으실 수 있습니다.
</div>
<div id="contentDiv">
${board.content }
</div>
</div>
<div class="content" id="buttonDiv">
	<input type="button" value="목록" class="btn " onclick="location.href='boardList.bo';">
<c:if test="${memberId eq board.memberId}">
	<input type="button" value="수정" class="btn" onclick="location.href='updateBoardForm.bo?boardNum=${board.boardNum}';">
</c:if>
<c:if test="${memberId eq board.memberId || memberId == 'admin'}">
	<input type="button" value="삭제" class="btn" onclick="location.href='deleteBoard.bo?boardNum=${board.boardNum}';">
</c:if>
</div>
<div class="reply">
	<c:if test="${not empty memberId }">
	<form action="replyBoard.re" method="post">
<!-- 	<textarea rows="15" cols="15" placeholder="저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시물은 이용약관 및 관련 법률에 의해 제재를 받을 수 있습니다. 건전한 토론문화와 양질의 댓글 문화를 위해, 타인에게 불쾌감을 주는 욕설 또는 특정 계층/민족, 종교 등을 비하하는 단어들은 표시가 제한됩니다." name="content">
	
	</textarea> -->
 <input type="text" placeholder="저작권 등 다른 사람의 권리를 침해하거나 명예를 훼손하는 게시물은 이용약관 및 관련 법률에 의해 제재를 받을 수 있습니다. 건전한 토론문화와 양질의 댓글 문화를 위해, 타인에게 불쾌감을 주는 욕설 또는 특정 계층/민족, 종교 등을 비하하는 단어들은 표시가 제한됩니다." name="content">
 <input type="hidden" name="boardNum" value=${board.boardNum }>
	<%-- ${board.boardNum }이다 --%>
	<input type="submit" value="작성완료">
	</form>
	<!-- <input type="button" value="댓글작성" onclick="location.href='replyBoard.re';"> -->
	</c:if>
	<div class="replyList">
		<c:if test="${not empty list }">
			<c:forEach items="${list }" var="reply">
			<div class="replyBox">
				<div class="idDiv">
					${reply.memberId }
				</div>
				<div class="dateDiv">${reply.createDate }</div>
				<div>${reply.content }</div>
				<br>
			</div>
			</c:forEach>
		</c:if>
		<c:if test="${empty list }">
		댓글이 없습니다.
		</c:if>
	</div>
</div>

</body>
</html>