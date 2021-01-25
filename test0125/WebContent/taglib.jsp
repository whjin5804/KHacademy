<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="age" value="30"></c:set>
<c:out value="${age }"/>
${age }<br>
<c:if test="${age eq 30 }">
	age는 30입니다.
</c:if>

<c:choose>	<%-- jsp주석 --%>
	<c:when test="${age eq 10 }">
		10!
	</c:when>
	<c:when test="${age eq 30 }">
		30!!
	</c:when>
	<c:otherwise>
		10과 30이 아님
	</c:otherwise>
</c:choose>
<br>

<c:forEach begin="1" end="5" var="num" step="2">
	${num } 
</c:forEach>

</body>
</html>