<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="java"/>
<c:set var="age" value="30"/>
<c:out value="${age }"/>
<c:out value="${name }"/><br>
${name }

<c:if test="${age ne 20 }">
	나이는 20살이 아닙니다.
</c:if>

<c:choose>
	<c:when test="${age eq 30 }">
		30살입니다.
	</c:when>
	<c:when test="${age ne 20 }">
		30살이 아닙니다.
	</c:when>
	<c:otherwise>
		둘다 아닙니다.
	</c:otherwise>
</c:choose>

<c:forEach begin="0" end="3" var="num">
	${num }
</c:forEach>





</body>
</html>