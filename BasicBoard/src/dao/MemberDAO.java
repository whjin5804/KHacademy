package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.MemberDTO;

public class MemberDAO {
	//회원가입
	//로그인
	//회원삭제
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet rs;
	
	public void join(MemberDTO member) {
		sql = "INSERT INTO BOARD_MEMBER "
				+ "VALUES (?, ?, ?)";
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());

			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	
	public MemberDTO login(MemberDTO member) {
		sql = "SELECT MEMBER_ID, NAME FROM BOARD_MEMBER "
				+ "WHERE MEMBER_ID = ? AND PASSWORD = ?";
		/* boolean isLogin = false; */
		MemberDTO memberDTO = new MemberDTO();
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPassword());

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				memberDTO.setMemberId(rs.getString("MEMBER_ID"));
				memberDTO.setName(rs.getString("NAME"));
				
			}
			/* isLogin = rs.next(); */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return memberDTO;
	}
	
	
	
}
