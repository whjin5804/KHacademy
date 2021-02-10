<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Connection conn = null;
	String sql = "INSERT INTO TEST_STUDENT VALUES(?, ?, ?, ?, ?)";
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		
		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, 115);
		pstmt.setString(2, "이순신");
		pstmt.setString(3, "19901225");
		pstmt.setInt(4, 85);
		pstmt.setInt(5, 75);
		
		int result = pstmt.executeUpdate();
		if(result != 0){
			System.out.println("쿼ㄹ ㅣ 성공");
		}
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		pstmt.close();
		conn.close();
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>