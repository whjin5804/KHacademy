package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public log() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		String data = "";
		data += "<html>";
		data += "<body>";
		data += "<form action='log2' method='post'>";
		data += "이름 : " + name + "<br>";
		data += "아이디 :  <input type='text' name='id'><br>";
		data += "비밀번호 :  <input type='text' name='pw'><br>";
		data += "<input type='submit' value='전송'>";
		data += "</body>";
		data += "</html>";
		out.print(data);
		
		
	}

}
