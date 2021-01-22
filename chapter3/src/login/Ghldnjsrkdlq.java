package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ghldnjs")
public class Ghldnjsrkdlq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ghldnjsrkdlq() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String road = request.getParameter("road");
		
		PrintWriter out = response.getWriter();
		String data = "";
		data += "아이디 : " + id + "<br>";
		data += "비밀번호 : " + pw + "<br>";
		data += "이름 : " + name + "<br>";
		data += "연락처 : " + phone + "<br>";
		data += "성별 : " + gender + "<br>";
		data +=  "취미 : ";
		for(String e : hobby) {
			data += e + " ";
		}
		data +="<br>";
		data += "가입경로 : " + road + "<br>";
		out.print(data);
	
		
		
	}
}
