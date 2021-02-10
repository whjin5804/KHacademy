package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MemberDTO;



@WebServlet("*.me")	//회원에 대한 기능처리
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	MemberDAO memberDAO = new MemberDAO();
	
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
		
		//첫 페이지(회원가입폼으로 이동)
		if(command.equals("/joinForm.me")) {
			
			path = "joinForm.jsp";
		}
		
		//joinForm.jsp > 회원가입완료
		else if(command.equals("/join.me")) {
			 String memberId = request.getParameter("memberId");
	         String password = request.getParameter("password");
	         String name = request.getParameter("name");
	         
	         MemberDTO member = new MemberDTO();
	         
	         member.setMemberId(memberId);
	         member.setPassword(password);
	         member.setName(name);
	         
//	         memberDAO.join(member);
	         
	         path = "loginForm.me";
		}
		
		//바로위
		else if(command.equals("/loginForm.me")) {
			
			path = "loginForm.jsp";
		}
		
		//loginForm.jsp > 로그인
		else if(command.equals("/login.me")) {
			String memberId = request.getParameter("memberId");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			
			MemberDTO member = new MemberDTO();
			member.setMemberId(memberId);
			member.setPassword(password);
			member.setName(name);
			
//			MemberDTO memberDTO = memberDAO.login(member);
//			
//			isRedirect = true;
//			if(memberDTO.getMemberId() != null) {
//				HttpSession session = request.getSession();
//				session.setAttribute("loginInfo", memberDTO);
//				
//				path = "boardList.bo";
//			}
//			else {
//				path = "loginForm.me";
//			}
			
		}
		
		//boardList.jsp > 로그아웃
		else if(command.equals("/logout.me")) {
			HttpSession session = request.getSession();
			session.removeAttribute("loginInfo");	//바로위에서 저장된 정보를 지운다.
			isRedirect = true;
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
