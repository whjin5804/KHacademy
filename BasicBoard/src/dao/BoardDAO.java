package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import dto.BoardDTO;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet rs;
	HttpSession session;
	
	
	
	public void insertBoard(BoardDTO board) {
		sql = "INSERT INTO BOARD("
				+ "BOARD_NUM"
				+ ", TITLE"
				+ ", CONTENT"
				+ ", MEMBER_ID) "
				+ "VALUES ("
				+ "( SELECT NVL(MAX(BOARD_NUM) + 1, 1)"
				+ " FROM BOARD)"
				+ ", ?"
				+ ", ?"
				+ ", ?"
				+ ")";
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getMemberId());

			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	public List<BoardDTO> selectAll() {
		sql = "SELECT BOARD_NUM"
				+ ", TITLE"
				+ ", MEMBER_ID"
				+ ", TO_CHAR(CREATE_DATE, 'YYYY-MM-DD') AS CREATE_DATE"
				+ ", READ_CNT"
				+ ", CONTENT"
				+ " FROM BOARD"
				+ " ORDER BY BOARD_NUM DESC";
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setBoardNum(rs.getInt("BOARD_NUM"));
				board.setMemberId(rs.getString("MEMBER_ID"));
				board.setTitle(rs.getString("TITLE"));
				board.setMemberId(rs.getString("MEMBER_ID"));
				board.setCreateDate(rs.getString("CREATE_DATE"));
				board.setReadCnt(rs.getInt("READ_CNT"));
				board.setContent(rs.getString("CONTENT"));
				list.add(board);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return list;
		
	}
	
	//디테일에서 삭제
	public int deleteBoard(int boardNum) {
		sql = "DELETE BOARD WHERE BOARD_NUM = ?";
		int result = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			
			pstmt.setInt(1, boardNum);

			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(pstmt, conn);
		}
		return result;
	}
	
	public void updateBoard(String title, String content, int boardNum) {
		sql = "UPDATE BOARD"
				+ " SET TITLE = ?, CONTENT = ?"
				+ " WHERE BOARD_NUM = ?;";
		int result = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//?세팅
			
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, boardNum);

			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	
	
	
}
