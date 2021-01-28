<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   Connection conn = null;
   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   boolean connect = false;
   
   try{
      Class.forName(driver);
      conn = DriverManager.getConnection(url, "MyDB", "oracle");
      connect = true;
   }catch(Exception e){
      connect = false;
      e.printStackTrace();
   }
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(connect){ %>
   연결 됨
<%} else { %>
   연결 실패
<%} %>
</body>
</html>
