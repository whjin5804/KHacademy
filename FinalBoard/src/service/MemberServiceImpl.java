package service;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.MemberDTO;
import sqlmap.SqlSessionManager;


public class MemberServiceImpl implements MemberService {
	//데이터베이스 연결
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//인터페이스에서 정의된 기능 구현
	@Override
	public int insertJoin(MemberDTO member) {
		sqlSession.insert("insertJoin", member);
		sqlSession.commit();
		return 0;
	}
	@Override
	public MemberDTO selectLogin(MemberDTO member) {
		MemberDTO memberDTO = sqlSession.selectOne("memberMapper.selectLogin", member);
		return memberDTO;
	}
	
	
	
}














