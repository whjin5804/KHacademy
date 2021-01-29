<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	String sql = "UPDATE MY_EMP SET ENAME = '파이썬', SAL = 5000 WHERE EMPNO = 4";
	Statement stmt = null;
	
	try{
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
      
      conn = ds.getConnection();
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);

      if(result == 0 ){
    	  System.out.println("성공");
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