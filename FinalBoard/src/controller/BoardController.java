package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.BoardDTO;
import service.BoardService;
import service.BoardServiceImpl;

@WebServlet("*.bo") // 게시판 기능 처리
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardService boardService = new BoardServiceImpl();
//	List<BoardDTO> list = new ArrayList<BoardDTO>();
//	BoardDAO dao = new BoardDAO();

	public BoardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean isRedirect = false;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String path = "";
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()); // /chapter6/test에서 /chater6의길이만큼을뺌

		// index.jsp, boardWrite.bo > 리스트
		if (command.equals("/boardList.bo")) {
			List<BoardDTO> list = boardService.selectBoardList();
			request.setAttribute("list", list);
			HttpSession session = request.getSession();
			String memberId = (String)session.getAttribute("memberId");
			request.setAttribute("memberId", memberId);
			path = "boardList.jsp";
		}
		
		
		//boardList.jsp > 상세보기페이지
		else if(command.equals("/boardDetail.bo")) {
			HttpSession session = request.getSession();
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			BoardDTO board = boardService.selectBoardDetail(boardNum);
			request.setAttribute("board", board);
			request.setAttribute("memberId", session.getAttribute("memberId"));
			
			path = "boardDetail.jsp";
		}
		
		//boardDetail > 삭제
		else if(command.equals("/deleteBoard.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			boardService.deleteBoard(boardNum);
			
			isRedirect = true;
			path = "boardList.bo";
		}
		
		//boardDeatil > 수정
		else if(command.equals("/updateBoardForm.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			BoardDTO board = boardService.selectBoardDetail(boardNum);
			request.setAttribute("board", board);
			
			path = "updateBoardForm.jsp";
		}
		
		//updateBoardForm.jsp > 수정내용받아 바꾸기
		else if(command.equals("/updateBoard.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			BoardDTO board = new BoardDTO();
			board.setBoardNum(boardNum);
			board.setTitle(title);
			board.setContent(content);
			
			boardService.updateBoard(board);
			
			path = "boardDetail.bo";
		}
		
		//boardList.jsp > 글쓰기
		else if(command.equals("/boardWriteForm.bo")) {
			
			path = "boardWriteForm.jsp";
		}
		
		else if(command.equals("/boardWrite.bo")) {
			BoardDTO board = new BoardDTO();
			board.setTitle(request.getParameter("title"));
			board.setContent(request.getParameter("content"));
			boardService.insertBoard(board);
			
			isRedirect = true;
			path = "boardList.bo";
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(path); // path의 값 즉b.jsp로 이동한다.
		if (isRedirect) {
			response.sendRedirect(path);
		} else {
			dispatcher.forward(request, response);

		}
	}

}
