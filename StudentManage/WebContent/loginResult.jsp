<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:choose><%-- jsp태그 --%>
	<c:when test="${isLogin }">
		<script type="text/javascript">
			alert('로그인 성공');
			location.href='selectStudentList.st';
		</script>>		
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert('학번이나 이름이 틀립니다.');
			location.href='loginForm.st';
		</script>>		
	</c:otherwise>
</c:choose>

</head>
<body>
${isLogin }
</body>
</html>