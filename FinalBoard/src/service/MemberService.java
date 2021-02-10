package service;

import dto.MemberDTO;

public interface MemberService {
	//데이터베이스 기능 정의
	
	int insertJoin(MemberDTO member);
	
	MemberDTO selectLogin(MemberDTO member);
	
}
