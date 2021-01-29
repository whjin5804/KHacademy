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
		
		//첫페이지 리스트
		if(command.equals("/boardList.bo")) {
			BoardDTO board = new BoardDTO();
			board.setNumber(Integer.parseInt(request.getParameter("number")));
			board.setTitle(request.getParameter("title"));
			board.setTitle(request.getParameter("writer"));
			board.setTitle(request.getParameter("date"));
			board.setTitle(request.getParameter("content"));
			list.add(board);
			
			request.setAttribute("list", list);
			path = "boardList.jsp";
		}
		
		//작성하는 페이지로 이동
		else if(command.equals("/boardWriteForm.bo")) {
			
			path = "boardWriteForm.jsp";
		}
		
		else if(command.equals("/boardListForm.bo")) {
			path = "boardListForm.jsp";
		}
		
		//상세페이지로 이동
		else if(command.equals("/boardListDetail.bo")) {
			String number = request.getParameter("number");
			int num = Integer.parseInt(number);
			
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getNumber() == num) {
					request.setAttribute("board", list.get(i));
				}
			}
			
			path = "boardListDetail.jsp";
		}
		//첫 페이지로 이동(글쓰기)
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
