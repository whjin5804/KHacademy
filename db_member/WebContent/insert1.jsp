<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//TEST_STUDENT에 데이터를 삽입하는 기능
	Connection conn = null;
	String sql = "INSERT INTO TEST_STUDENT VALUES(5, '김자바', '2020-02-01', 40, 50)";
	Statement stmt = null;
	
	try{
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	
      conn = ds.getConnection();
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);
	
      if(result != 0){
    	  System.out.println("쿼리성공");
      }
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		stmt.close();
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