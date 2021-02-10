package service;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import dto.ReplyDTO;
import sqlmap.SqlSessionManager;


public class ReplyServiceImpl implements ReplySerivce {
	//데이터베이스 연결
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//인터페이스에서 정의된 기능 구현
	
	@Override
	public int insertReply(ReplyDTO replyDTO) {
		sqlSession.insert("insertReply", replyDTO);
		return 0;
	}
	
}














