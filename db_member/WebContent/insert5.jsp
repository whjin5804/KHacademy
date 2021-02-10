<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String stuNum = request.getParameter("stuNum");
	String name = request.getParameter("name");
	String birthday = request.getParameter("birthday");
	String korScore = request.getParameter("korScore");
	String engScore = request.getParameter("engScore");
	
	Connection conn = null;
	String sql = "INSERT INTO TEST_STUDENT "
					+ "VALUES(?, ?, ?, ?, ?)";
	PreparedStatement pstmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");	
		
		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, Integer.parseInt(stuNum));
		pstmt.setString(2, name);
		pstmt.setString(3, birthday);
		pstmt.setInt(4, Integer.parseInt(korScore));
		pstmt.setInt(5, Integer.parseInt(engScore));
		
		pstmt.executeUpdate();
		
		
		
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