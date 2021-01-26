package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmpController() {
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
		//요청 URI을 확인
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());	// /chapter6/test에서 /chater6의길이만큼을뺌
		System.out.println("command =" + command);
		
		if(command.equals("/hello.emp")) {
			path = "hello.jsp";
		}
		
		//로그인 폼
		else if(command.equals("/empLogin.emp")) {
			path = "empLogin.jsp";
		}
		
		
		//로그인인포 폼
		else if(command.equals("/loginInfo.emp")) {
			path = "loginInfo.jsp";
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			request.setAttribute("id", id);
			request.setAttribute("pw", pw);
		}
		
		else if(command.equals("/regEmpForm.emp")) {
			path = "refEmpForm.jsp";
		}
		
		else if(command.equals("/showEmpInfo.emp")) {
			String name = request.getParameter("name");
			String subject = request.getParameter("subject");
			String gender = request.getParameter("gender");
			String date = request.getParameter("date");
			
			request.setAttribute("name", name);
			request.setAttribute("subject", subject);
			request.setAttribute("gender", gender);
			request.setAttribute("date", date);
			
			path = "showEmpInfo.jsp";
		}
		
		
		//요청경로가 "login.do"라면..
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
}
