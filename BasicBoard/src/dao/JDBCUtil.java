package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCUtil {
	
	//자바와 DB의 연결에 필요한 Connection 객체 생성
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//접속할 데이터 베이스 정보를 읽어 옴
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
		}catch(Exception e) {
			System.out.println("진원호! > JDBCUtil : getConnection()메소드 오류" );
			e.printStackTrace();
		}
		return conn;
	}
	
	//사용한 객체 소멸시키는 메소드
	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			System.out.println("진원호! > JDBCUtil : close()메소드 오류" );
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			System.out.println("진원호! > JDBCUtil : close()메소드 오류" );
			e.printStackTrace();
		}
	}
	
	
}
