<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	String sql = "DELETE MY_EMP WHERE EMPNO = 1";
	Statement stmt = null;
	
	try{
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
      
      conn = ds.getConnection();
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);	//삽입, 수정, 삭제는 무조건 return값이 int
      
      if(result == 1){
    	  System.out.println("쿼리 성공");
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