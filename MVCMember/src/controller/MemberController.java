package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("*.me")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberDAO dao = new MemberDAO();
	
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String path = "";
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());	// /chapter6/test에서 /chater6의길이만큼을뺌
		
		//첫 페이지(로그인폼으로 이동)
		if(command.equals("/loginForm.me")) {
			
			path = "loginForm.jsp";
		}
		//회원가입입력폼으로 이동
		else if(command.equals("/joinForm.me")) {
			
			path = "joinForm.jsp";
		}
		//회원가입 내용 입력 후(DAO로 데이터보내서 DB작업 시킨다)
		else if(command.equals("/join.me")) {
			MemberDTO member = new MemberDTO();
			member.setId(request.getParameter("id"));
			member.setPassword(request.getParameter("password"));
			member.setName(request.getParameter("name"));
			member.setAge(Integer.parseInt(request.getParameter("age")));
			member.setGender(request.getParameter("gender"));
			member.setEmail(request.getParameter("email"));
			
			int result = dao.insertMember(member);
			
			if(result == 1) {
				path = "loginForm.me";
			}else {
				path = "joinForm.me";
			}
		
		}
		
		//로그인 처리
		else if(command.equals("/login.me")) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			MemberDTO member = new MemberDTO();
			member.setId(id);
			member.setPassword(password);
			
			boolean result = dao.login(member);
			
			if(result) {
				path = "memberList.me";
			}
			else {
				path = "loginForm.me";
			}
			
			
		}
		
		//회원 목록 페이지로 이동
		else if(command.equals("/memberList.me")) {
			List<MemberDTO> list = dao.selectMemberList();
			request.setAttribute("list", list);
			
			path = "memberList.jsp";
		}
		
		//상세정보페이지로 이동
		else if(command.equals("/memberDetail.me")) {
			String id = request.getParameter("id");
			
			MemberDTO member = dao.selectMemberDetail(id);
			
			request.setAttribute("member", member);
			
			path = "memberDetail.jsp";
		}
		
		//삭제하고 리스트페이지로 오기
		else if(command.equals("/deleteMember.me")) {
			String id = request.getParameter("id");
			
			int result = dao.deleteMember(id);
			if(result == 1) {
				path = "memberList.me";
			}
			else {
				path = "loginForm.me";
			}
			
		}
		
		else if(command.equals("/updateMember.me")) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			int result = dao.updateMember(id, name, age);
			
			if(result == 1) {
				path = "memberList.me";
			}
			
		}
		else if(command.equals("/updateMemberForm.me")) {
			MemberDTO member = new MemberDTO();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setAge(Integer.parseInt(request.getParameter("age")));
			member.setPassword(request.getParameter("password"));
			member.setGender(request.getParameter("gender"));
			member.setEmail(request.getParameter("email"));
			System.out.println(member.getPassword());
			request.setAttribute("member", member);
			
			
			path = "updateMemberForm.jsp";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
