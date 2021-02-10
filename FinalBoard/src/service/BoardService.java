package service;

import java.util.List;

import dto.BoardDTO;

public interface BoardService {
	//데이터베이스 기능 정의
	
	//게시글 목록 조회
	List<BoardDTO> selectBoardList();

	BoardDTO selectBoardDetail(int boardNum);

	void deleteBoard(int boardNum);

	void updateBoard(BoardDTO board);

	int insertBoard(BoardDTO board);
}
