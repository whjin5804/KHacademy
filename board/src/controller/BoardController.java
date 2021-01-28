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

import dto.BoardDTO;



@WebServlet("*.bo")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<BoardDTO> list = new ArrayList<>();
	
	
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
		
		//첫 페이지로 이동
		if(command.equals("/selectBoardList.bo")) {

			path = "selectBoardList.jsp";
		}
		
		else if(command.equals("/boardListForm.bo")) {
			BoardDTO board = new BoardDTO();
			board.setTitle(request.getParameter("title"));
			board.setWriter(request.getParameter("writer"));
			board.setDate(request.getParameter("date"));
			board.setContent(request.getParameter("content"));
			board.setNumber(list.size());
			list.add(board);
			
			request.setAttribute("list", list);
			
			path = "boardListForm.jsp";
		}
		
		//글등록완성 후
		else if(command.equals("/boardList.bo")) {
			BoardDTO board = new BoardDTO();
			board.setTitle(request.getParameter("title"));
			board.setWriter(request.getParameter("writer"));
			board.setDate(request.getParameter("date"));
			board.setContent(request.getParameter("content"));
			board.setNumber(list.size());
			list.add(board);
			
			request.setAttribute("list", list);
			
			path = "boardList.jsp";
		}
		
		//상세페이지로 이동
		else if(command.equals("/selectBoardDetail.bo")) {
			String number = request.getParameter("number");
			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String date = request.getParameter("date");
			String content = request.getParameter("content");
			
			request.setAttribute("number", number);
			request.setAttribute("title", title);
			request.setAttribute("writer", writer);
			request.setAttribute("date", date);
			request.setAttribute("content", content);
			path = "selectBoardDetail.jsp";
		}
		
		//디테일에서 업데이트 폼으로 이동하기
		else if(command.equals("/updateBoardForm.bo")) {
			request.setAttribute("number", request.getParameter("number"));
			request.setAttribute("title", request.getParameter("title"));
			request.setAttribute("writer", request.getParameter("writer"));
			request.setAttribute("date", request.getParameter("date"));
			request.setAttribute("content", request.getParameter("content"));
			path = "updateBoardForm.jsp";
		}
		else if(command.equals("/updateBoard.bo")) {
			
			for(BoardDTO board : list) {
				if(board.getWriter().equals("writer")) {
					
				}
			}
			
			path = "selectBoardDetail.bo";
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
