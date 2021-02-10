package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardDTO;
import sqlmap.SqlSessionManager;





//		첫번째 매개변수 : 실행할 쿼리 ID
//		두번째 매개변수 : 쿼리에서 채워야할 데이터
//		sqlSession.selectOne(null, sqlSession);
//		sqlSession.insert(null, sqlSession);
//		sqlSession.update(null, sqlSession);
//		sqlSession.delete(null, sqlSession);

public class BoardServiceImpl implements BoardService {
	//데이터베이스 연결
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession(true);
	
	//메소드 선언법
	//매개변수 : 실행할 쿼리문에 전달할 데이터가 없다 > 매개변수 필요없음
	//쿼리문에 전달할 데이터가 있다 > 매개변수는 boardDTO 타입
	//리턴 : 
	//실행할 쿼리가 insert, update, delete면 int 혹은 void
	//실행 쿼리가 select면서 여러행의 데이터가 나올 경우 > List<BoardDTO>
	//실행 쿼리가 select면서 하나의 행 데이터가 나올 경우 > boardDTO
	
	@Override
	//게시글 등록
	public void insertBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	//게시글 목록 조회
	public List<BoardDTO> selectBoardList() {
		List<BoardDTO> list = sqlSession.selectList("boardMapper.selectBoardList");
		sqlSession.commit();
		return list;
	}

	@Override
	//게시글 상세 조회
	public BoardDTO selectBoardDetail(int boardNum) {
		System.out.println(boardNum + "sdf");
		BoardDTO board =  sqlSession.selectOne("boardMapper.selectBoardDetail", boardNum);
		sqlSession.commit();
		return board;
	}


	@Override
	//게시글 삭제
	public int deleteBoard(int boardNum) {
		int result = sqlSession.delete("boardMapper.deleteBoard", boardNum);
		sqlSession.commit();
		return result;
	}
	
	
	
	
}














