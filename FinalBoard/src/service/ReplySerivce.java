package service;

import java.util.List;

import dto.ReplyDTO;

public interface ReplySerivce {

	int insertReply(ReplyDTO replyDTO);
	//데이터베이스 기능 정의

	List<ReplyDTO> selectReplyAll(int boardNum);
	
	void deleteReply(int boardNum);
}
