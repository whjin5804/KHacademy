package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.MemberDTO;


public class MemberDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private String sql;
	private ResultSet rs;
	
	
	//회원가입
	public int insertMember(MemberDTO member) {
		sql = "INSERT INTO MEMBER "
					+ "(ID, PASSWORD, NAME, AGE, GENDER, EMAIL) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
		int result = 0;
		try {
		      conn = JDBCUtil.getConnection();
		      pstmt = conn.prepareStatement(sql);
		      
		      //?정보를 세팅
		      pstmt.setString(1, member.getId());
		      pstmt.setString(2, member.getPassword());
		      pstmt.setString(3, member.getName());
		      pstmt.setInt(4, member.getAge());
		      pstmt.setString(5, member.getGender());
		      pstmt.setString(6, member.getEmail());
		      
		      result = pstmt.executeUpdate();
		      if(result == 1) {
		    	  System.out.println("쿼리성공");
		      }
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		return result;
	}
	
	//로그인
	public boolean login(MemberDTO member) {
		sql = "SELECT ID, PASSWORD"
				+ " FROM MEMBER"
				+ " WHERE ID = ?"
				+ " AND PASSWORD = ?";
		
		boolean result = false;
		
		try {
			conn = JDBCUtil.getConnection();
		    pstmt = conn.prepareStatement(sql);
		    
		    //?세팅
		    pstmt.setString(1, member.getId());
		    pstmt.setString(2, member.getPassword());
		    
		    rs = pstmt.executeQuery();
		    result = rs.next();
		    
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return result;
	}
	
	//모든 회원의 아이디와 이름을 조회
	public List<MemberDTO> selectMemberList() {
		sql = "SELECT ID, NAME FROM MEMBER";
		List<MemberDTO> list = new ArrayList<>();
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getString("ID"));
				member.setName(rs.getString("NAME"));
				list.add(member);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return list;
	}
	
	//회원 상세 조회
	//DB에서 select결과, 한줄은 DTO에 받으면됨
	//여러개일때는 list로 만들어서 던진다.
	public MemberDTO selectMemberDetail(String id) {
		sql = "SELECT ID, PASSWORD, NAME, AGE, GENDER, EMAIL "
				+ "FROM MEMBER "
				+ "WHERE ID = ?";
		MemberDTO member = new MemberDTO();
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				member.setId(rs.getString("ID"));
				member.setPassword(rs.getString("PASSWORD"));
				member.setAge(rs.getInt("AGE"));
				member.setName(rs.getString("NAME"));
				member.setGender(rs.getString("GENDER"));
				member.setEmail(rs.getString("EMAIL"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return member;
	}
	
	//데이터 삭제
	public int deleteMember(String id) {
		
		sql = "DELETE MEMBER"
				+ " WHERE ID = ?";
		int result = 0;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("쿼리성공");
			}else {
				System.out.println("쿼리 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		return result;
	}
	
	public int updateMember(String id, String name, int age) {
		sql = "UPDATE MEMBER "
				+ "SET NAME = ?, AGE = ? "
				+ "WHERE ID = ?";
		int result = 0;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, id);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
}
