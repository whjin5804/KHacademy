<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//TEST_STUDENT에서 학번이 8번인 애 지우는 쿼리
	Connection conn = null;
	String sql = "DELETE TEST_STUDENT WHERE 학번 = 5";
	Statement stmt = null;

	try{
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		
      conn = ds.getConnection();
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);
      
      if(result != 0){
    	  System.out.println("쿼리 성공!");
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