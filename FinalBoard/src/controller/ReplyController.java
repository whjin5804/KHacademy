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

import dto.ReplyDTO;
import service.ReplySerivce;
import service.ReplyServiceImpl;



@WebServlet("*.re")	//게시판 기능 처리
public class ReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReplySerivce replySerivce = new ReplyServiceImpl();
	
//	BoardDAO dao = new BoardDAO();
	
	public ReplyController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isRedirect = false;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String path = "";
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());	// /chapter6/test에서 /chater6의길이만큼을뺌
		
		//index.jsp, boardWrite.bo  > 리스트
		if(command.equals("/replyBoard.re")) {
			HttpSession session = request.getSession();
			String content = request.getParameter("content");
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			ReplyDTO replyDTO = new ReplyDTO();
			replyDTO.setContent(content);
			replyDTO.setMemberId((String)session.getAttribute("memberId"));
			replyDTO.setBoardNum(boardNum);
			int result = replySerivce.insertReply(replyDTO);
//			System.out.println("content : " + content);
//			System.out.println("memberId" + replyDTO.getMemberId());
//			System.out.println("boardNum : " + boardNum);
			
			isRedirect = true;
			path = "boardDetail.bo?boardNum=" + boardNum;
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		if(isRedirect) {
			response.sendRedirect(path);
		}else {
			dispatcher.forward(request, response);
		}
	}
	
	
	
}
