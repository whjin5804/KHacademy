package service;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardDTO;
import dto.ReplyDTO;
import sqlmap.SqlSessionManager;


public class ReplyServiceImpl implements ReplySerivce {
	//데이터베이스 연결
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//인터페이스에서 정의된 기능 구현
	
	@Override
	public int insertReply(ReplyDTO replyDTO) {
		int result = sqlSession.insert("insertReply", replyDTO);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<ReplyDTO> selectReplyAll(int boardNum) {
		List<ReplyDTO> list = sqlSession.selectList("selectReplyAll", boardNum);
		sqlSession.commit();
		return list;
	}

	@Override
	public void deleteReply(int boardNum) {
		sqlSession.delete("deleteReply", boardNum);
		
	}

	
	
}

