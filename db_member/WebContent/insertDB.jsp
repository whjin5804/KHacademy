<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//자바와 디비를 연결해주는 객체를 선언
   Connection conn = null;
	//실행할 쿼리문을 저장할 변수, auto commit
   String sql = "INSERT INTO MY_EMP (EMPNO, ENAME, JOB, SAL) VALUES (6, '김자바', '사원', 5000)";
	//쿼리 실행을 위한 객체 선언
   Statement stmt = null;

   try{
	   //접속할 데이터 베이스 정보를 읽어 옴
      Context init = new InitialContext();
      DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");

      //자바와 디비를 연결
      conn = ds.getConnection();
      //실행할 쿼리문을 준비
      stmt = conn.createStatement();
      //쿼리 실행 및 결과 리턴
      int result = stmt.executeUpdate(sql);
      
      if(result != 0){
         System.out.println("insert 성공");
      }
      
   }catch(Exception e){
      System.out.println("insert 실패");
      e.printStackTrace();
   }finally {
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








