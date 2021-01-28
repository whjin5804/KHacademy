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


import dto.StudentDTO;


@WebServlet("*.st")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<StudentDTO> list = new ArrayList<>();
	
    public StudentController() {
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
		
		//첫 페이지로 이동
		if(command.equals("/intro.st")) {
			path = "intro.jsp";
		}
		//회원가입 입력 폼으로 이동
		else if(command.equals("/insertStudentForm.st")) {
			path = "insertStudentForm.jsp";
		}
		
		//회원가입
		else if(command.equals("/insertStudent.st")) {
			String stuNum = request.getParameter("stuNum");
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String major = request.getParameter("major");
			String birthday = request.getParameter("birthday");
			
			StudentDTO student = new StudentDTO();
			student.setStuNum(stuNum);
			student.setName(name);
			student.setAge(Integer.parseInt(age));
			student.setMajor(major);
			student.setBirthday(birthday);
			student.setGender(request.getParameter("gender"));
			
			list.add(student);
			
			path = "intro.st";
		}
		//로그인 했을 경우 들어옴
		else if(command.equals("/login.st")) {
			boolean isLogin = false;
			String stuNum = request.getParameter("stuNum");
			String name =  request.getParameter("name");
			
			
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getStuNum().equals(stuNum) && list.get(i).getName().equals(name)) {
					isLogin = true;
				}
			}
			request.setAttribute("isLogin", isLogin);
			path = "loginResult.jsp";
			
		}
		
		//로그인 폼으로 이동
		else if(command.equals("/loginForm.st")) {
			path = "login.jsp";
		}
		
		else if(command.equals("/success.st")) {
			path = "success.jsp";
		}
		else if(command.equals("/fail.st")) {
			path = "fail.jsp";
		}
		
		//학생 목록 페이지로 이동
		else if(command.equals("/selectStudentList.st")) {
			request.setAttribute("list", list);
			path = "selectStudentList.jsp";
		}
		
		//학생 상세 조회 페이지로 이동
		else if(command.equals("/selectStudentDetail.st")) {
			String name = request.getParameter("name");
			
			for(StudentDTO student : list) {
				if(student.getName().equals(name)) {
					request.setAttribute("student", student);
				}
			}
			
			path = "selectStudentDetail.jsp";
		}
		
		//학생 삭제 페이지로 이동
		else if(command.equals("/deleteStudentList.st")) {
			String name = request.getParameter("name");
			
			for(StudentDTO student : list) {
				if(student.getName().equals(name)) {
					list.remove(student);
					break;
				}
			}
			
			path = "selectStudentList.st";
			
		}
		
		//학생 정보 수정하러 가기
		else if(command.equals("/updateStudentForm.st")) {
			
			StudentDTO student = new StudentDTO();
			student.setStuNum(request.getParameter("stuNum"));
			student.setName(request.getParameter("name"));
			student.setAge(Integer.parseInt(request.getParameter("age")));
			student.setMajor(request.getParameter("major"));
			student.setBirthday(request.getParameter("birthday"));
			student.setGender(request.getParameter("gender"));
			
			request.setAttribute("student", student);
			
			path = "updateStudentForm.jsp";
		}
		
		//학생 정보 수정
		else if(command.equals("/updateStudent.st")) {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String major = request.getParameter("major");
			String birthday = request.getParameter("birthday");
			String gender = request.getParameter("gender");
			
			for(StudentDTO student : list) {
				if(student.getName().equals(name)) {
					student.setAge(Integer.parseInt(age));
					student.setMajor(major);
					student.setBirthday(birthday);
					student.setBirthday(birthday);
					student.setGender(gender);
				}
			}
			
			path = "selectStudentList.st";
			
			
		}
		
		
		//요청경로가 "login.do"라면..
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);	//path의 값 즉b.jsp로 이동한다.
		dispatcher.forward(request, response);
		
	}
	
	
	
}
