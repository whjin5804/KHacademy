package service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardDTO;
import sqlmap.SqlSessionManager;


public class BoardServiceImpl implements BoardService {
	//데이터베이스 연결
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//인터페이스에서 정의된 기능 구현
	
	@Override
	public List<BoardDTO> selectBoardList(BoardDTO board) {
		List<BoardDTO> list = sqlSession.selectList("boardMapper.selectBoardList", board);
		sqlSession.commit();
		return list;
	}//


	@Override
	public BoardDTO selectBoardDetail(int boardNum) {
		BoardDTO board = sqlSession.selectOne("boardMapper.selectBoardDetail", boardNum);
		sqlSession.commit();
		return board;
	}


	@Override
	public void deleteBoard(int boardNum) {
		try {
			sqlSession.delete("replyMapper.deleteReply", boardNum);
			sqlSession.delete("boardMapper.deleteBoard", boardNum);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}
		
	}


	@Override
	public void updateBoard(BoardDTO board) {
		sqlSession.update("boardMapper.updateBoard", board);
		sqlSession.commit();
	}


	@Override
	public int insertBoard(BoardDTO board) {
		int result = sqlSession.insert("boardMapper.insertBoard", board);
		sqlSession.commit();
		return result;
	}


	@Override
	public void updateReadCnt(int boardNum) {
		sqlSession.update("updateReadCnt", boardNum);
		sqlSession.commit();
	}


	@Override
	public int selectBoardCnt() {
		int totalCnt = sqlSession.selectOne("selectBoardCnt");
		sqlSession.commit();
		return totalCnt;
	}

	
}














