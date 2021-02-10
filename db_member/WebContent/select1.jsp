<%@page import="java.sql.ResultSet"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	Connection conn = null;
	String sql = "SELECT 학번, 이름, 국어점수 FROM TEST_STUDENT";
	PreparedStatement pstmt = null;
	/* select시 조회된 데이터를 받아오는 객체 */
	ResultSet rs = null;
	

	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		
		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();	//쿼리의 모든 정보를 rs에 담음.
		
		//rs.next()를 while문에 넣으면 조회된 데이터의 행만큼 반복한다.
		while(rs.next()){	//rs.next : 다음 행의 데이터를 가리킨다.
			System.out.println("학번 : " + rs.getInt("학번"));	//숫자는 columm의 순서
			System.out.println("이름 : " + rs.getString("이름"));
			System.out.println("국어점수 : " + rs.getInt("국어점수"));
			System.out.println();
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(pstmt != null){
				pstmt.close();
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
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