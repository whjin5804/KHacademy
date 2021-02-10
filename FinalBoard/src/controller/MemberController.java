package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MemberDTO;
import service.MemberService;
import service.MemberServiceImpl;



@WebServlet("*.me")	//게시판 기능 처리
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService memberService = new MemberServiceImpl();
	
//	BoardDAO dao = new BoardDAO();
	
	public MemberController() {
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
		
		//boardList.jsp > 회원가입
		if(command.equals("/joinForm.me")) {
			path = "joinForm.jsp";
		}
		
		//boardList.jsp > 회원가입데이터넣기
		else if(command.equals("/join.me")) {
			MemberDTO member = new MemberDTO();
			member.setMemberId(request.getParameter("memberId"));
			member.setPassword(request.getParameter("password"));
			member.setName(request.getParameter("name"));
			memberService.insertJoin(member);
			
			isRedirect = true;
			path = "boardList.bo";
		}
		
		//boardList.jsp > 로그인
		else if(command.equals("/loginForm.me")) {
			path = "loginForm.jsp";
		}
		
		//loginForm.jsp > 로그인데이터 보내서 쿼리
		else if(command.equals("/login.me")) {
			MemberDTO member = new MemberDTO();
			member.setMemberId(request.getParameter("memberId"));
			member.setPassword(request.getParameter("password"));
			
			MemberDTO memberDTO = memberService.selectLogin(member);
			
			
			HttpSession session = request.getSession();
			String memberId = memberDTO.getMemberId();
			session.setAttribute("memberId", memberId);
			System.out.println(memberId + "이름");
			
			isRedirect = true;
			path = "boardList.bo";
		}
		
		else if(command.equals("/logout.me")) {
			HttpSession session = request.getSession();
			session.removeAttribute("memberId");
			
			path = "boardList.bo";
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		if(isRedirect) {
			response.sendRedirect(path);
		}else {
			dispatcher.forward(request, response);
			
		}
	}
	
	
	
}
