<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	Connection conn = null;
	String sql = "UPDATE TEST_STUDENT SET 이름 = ?, 국어점수 = ?, 영어점수 = ? WHERE 학번 = 112";	//?에 들어오는 건 input태그로 들어올놈들이다
	PreparedStatement pstmt = null;	//prepared가 ?를 인식할 수 있따.
	
	try{
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		
      conn = ds.getConnection();
      pstmt = conn.prepareStatement(sql);	//sql이라는 쿼리정보를 넘김
      
      pstmt.setString(1, "김자바");	//맨앞의 숫자들은 ?의 순서
      pstmt.setInt(2, 100);
      pstmt.setInt(3, 60);
      
      int result = pstmt.executeUpdate();
	
      if(result != 0){
    	  System.out.println("쿼리성공@");
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