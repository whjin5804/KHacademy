<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
   margin : 0 auto;
   width : 600px;
   border : 1px solid black;
   border-collapse: collapse;
   text-align : center;
}
td, tr {
   border : 1px solid black;
}
</style>
</head>
<body>
<div>
   <table>
      <colgroup>
         <col width="10%">
         <col width="*">
         <col width="10%">
         <col width="15%">
      </colgroup>
      <tr>
         <td>글번호</td>
         <td>제목</td>
         <td>작성자</td>
         <td>작성일</td>
      </tr>
      <!-- choose == switch -->
      <!-- when == case -->
      <c:choose>
         <c:when test="${list.size() eq 0 }"><!-- list에 데이터가 하나도 없으면 -->
            <tr>
               <td colspan="4">데이터가 없습니다.</td>
            </tr>
         </c:when>
         <c:otherwise>
      <!-- 이래의 행은 list에 데이터가 있는 개수만큼 생성되어야 함 -->
      <!-- 반복문을 쓰려면 c태그를 써야 함. 그 전에 맨 위에 taglib~ 써줘야 됨. -->
      <!-- items 뒤에는 반복할 대상. var에는 데이터 하나씩 뺐을때 그걸 뭐라 부를지. -->
            <c:forEach items="${list }" var="board">
               <tr>
                  <td>${board.number }</td>
                  <td><a href="boardListDetail.bo?
                  number=${board.number }&title=${board.title}">${board.title }</a></td>
                  <td>${board.writer }</td>
                  <td>${board.date }</td>
               </tr>
            </c:forEach>
         </c:otherwise>
      </c:choose>
   </table>
   <input type="button" value="글쓰기" onclick="location.href='boardWriteForm.bo';">
</div>
</body>
</html>
