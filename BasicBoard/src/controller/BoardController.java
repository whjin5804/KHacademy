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

import dao.BoardDAO;
import dto.BoardDTO;
import dto.MemberDTO;


@WebServlet("*.bo")	//게시판 기능 처리
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<MemberDTO> list = new ArrayList<>();
	BoardDAO dao = new BoardDAO();
	private int click;
	
	public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String path = "";
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());	// /chapter6/test에서 /chater6의길이만큼을뺌
		
		//index.jsp, boardWrite.bo  > 리스트
		if(command.equals("/boardList.bo")) {
			
			List<BoardDTO> list = dao.selectAll();
			
			request.setAttribute("list", list);
			
			path = "boardList.jsp";
		}
		
		//login.me & logout.me
		else if(command.equals("/boardListForm.bo")) {
			String memberId = request.getParameter("memberId");
			String password = request.getParameter("password");
			MemberDTO member = new MemberDTO();
			member.setMemberId(memberId);
			member.setPassword(password);
			list.add(member);
			
			path = "boardList.bo";
		}
		
		//boardList.jsp > 게시글 작성 폼으로 이동
		else if(command.equals("/boardWriteForm.bo")) {
			
			
			path = "boardWriteForm.jsp";
		}
		
		//boardWriteForm.jsp > 제목,내용 데이터에넣기
		else if(command.equals("/boardWrite.bo")) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			HttpSession session = request.getSession();
			BoardDTO board = new BoardDTO();
			MemberDTO memberDTO = new MemberDTO();
			//세션값을 받는데 loginInfo가 객체여서 객체로 받음
			memberDTO = (MemberDTO) session.getAttribute("loginInfo");
			
			board.setTitle(title);
			board.setContent(content);
			board.setMemberId(memberDTO.getMemberId());	//객체에 있는 id값을 빼온다.
			
			dao.insertBoard(board);
			
			path = "redirect:boardList.bo";
			//redirect:
			//컨트롤러에서 또 다른 컨트롤러갈때는 무조건붙힌다.
			//f5눌렀을떄 데이터가 복사되는것을 방지한다.
		}
		
		//boardList.jsp, deleteBoard.bo > 디테일
		else if(command.equals("/boardDetail.bo")) {
			click = click + 1;
			BoardDTO board = new BoardDTO();
			board.setBoardNum(Integer.parseInt(request.getParameter("boardNum")));
			board.setMemberId(request.getParameter("memberId"));
			board.setTitle(request.getParameter("title"));
			board.setContent(request.getParameter("content"));
			board.setCreateDate(request.getParameter("createDate"));
			board.setFileName(request.getParameter("fileName"));
			board.setReadCnt(click);
			
			request.setAttribute("board", board);
			
			
			path = "boardDetail.jsp";
		}
		
		//boardDetail.jsp > 삭제버튼
		else if(command.equals("/deleteBoard.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			System.out.println(boardNum);
			int result = dao.deleteBoard(boardNum);
			
			if(result == 1) {
				path = "boardList.bo";
				System.out.println("쿼리 성공");
			}
			else {
				path = "redirect:boardDetail.bo";
			}
		}
		
		//boardDetail.jsp > 수정버튼
		else if(command.equals("/updateBoardForm.bo")) {
			request.setAttribute("boardNum", request.getParameter("boardNum"));
			
			
			path = "updateBoardForm.jsp";
		}
		
		//updateBoardForm.jsp > 수정된값 받기
		else if(command.equals("/updateBoard.bo")) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			
			dao.updateBoard(title, content, boardNum);
			
			path = "boardList.bo";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
