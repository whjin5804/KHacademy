package service;

import java.util.List;

import dto.BoardDTO;

//인터페이스에는 public메소드의 정의만 올 수 있다.
public interface BoardService {
	//게시글 등록
	void insertBoard();
	
	//게시글 목록 조회
	List<BoardDTO> selectBoardList();
	
	//게시글 상세 조회
	BoardDTO selectBoardDetail(int boardNum);
	
	//게시글 삭제
	int deleteBoard(int boardNum);
	//게시글 수정

	
	//조회수 증가
}
