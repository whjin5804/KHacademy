package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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
		
		//첫 페이지로 이동(글쓰기)
		if(command.equals("/selectBoardList.bo")) {
			//현재날짜 구하기
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int date = cal.get(Calendar.DATE);
			
			String monthString;
			if(month < 10) {
				monthString = "0" + month;
			}
			else {
				monthString = month + "";
			}
			
			String dateString = String.format("%02d", date);
			
			
			String nowdate = year + "-" + monthString + "-" + dateString;
			
			request.setAttribute("nowdate", nowdate);
			
			path = "selectBoardList.jsp";
		}
		
		//글쓰기 입력받은 후
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
		
		//글등록완성 후 리스트페이지로 이동
		else if(command.equals("/boardList.bo")) {
			BoardDTO board = new BoardDTO();
			board.setTitle(request.getParameter("title"));
			board.setWriter(request.getParameter("writer"));
			board.setDate(request.getParameter("date"));
			board.setContent(request.getParameter("content"));
			//board.setNumber(list.size());
			int boardNum = 0;
			if(list.size() == 0) {
				boardNum = 1;
			}
			else {
				boardNum = list.get(list.size() - 1).getNumber() + 1;
			}
			board.setNumber(boardNum);
			list.add(board);
			
			request.setAttribute("list", list);
			
			path = "boardList.jsp";
		}
		
		//상세페이지로 이동
		else if(command.equals("/selectBoardDetail.bo")) {
			request.setAttribute("number", request.getParameter("number"));
			request.setAttribute("title", request.getParameter("title"));
			request.setAttribute("writer", request.getParameter("writer"));
			request.setAttribute("date", request.getParameter("date"));
			request.setAttribute("content", request.getParameter("content"));
			path = "selectBoardDetail.jsp";
		}
		
		//디테일에서 업데이트 폼으로 이동하기
		else if(command.equals("/updateBoardForm.bo")) {
			//객체에 왜넣었지
			request.setAttribute("number", Integer.parseInt(request.getParameter("number")));
			request.setAttribute("title", request.getParameter("title"));
			request.setAttribute("writer", request.getParameter("writer"));
			request.setAttribute("date", request.getParameter("date"));
			request.setAttribute("content", request.getParameter("title"));
			
			path = "updateBoardForm.jsp";
		}
		
		//업데이트 한 후 이동됨
		else if(command.equals("/updateBoard.bo")) {
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			
			for(BoardDTO board : list) {
				if(board.getWriter().equals(writer)) {
					board.setTitle(title);
					board.setContent(content);
				}
			}
			
//			board.setTitle(request.getParameter("title"));
//			board.setContent(request.getParameter("content"));
			//request.setAttribute("list", list);
			path = "selectBoardDetail.bo";
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
