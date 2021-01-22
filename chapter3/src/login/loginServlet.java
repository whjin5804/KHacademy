package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget() 메소드 호출");
		//넘어온 데이터 받기
		//객체에 모든 요청 정보가 담겨 있다.
		//그래서 request 객체를 통해 넘어온 데이터들을 받을 수 있다.
		//넘어온 데이터를 받기위해서 request.getParameter()메서드를 호출하면 된다.
		//해당 메서드의 매개변수로 들어오는 값은 input태그의 name속성의 값이다.
		//예를 들어, request.getParameter()
		//예를들어, request.getParameter("id")라고 하면
		//넘어온 데이터 중 name 속성의 값이 'id'인
		//input태그의 value 값을 받는다는 의미이다.
		String id = request.getParameter("id");	//input태그 중 name 속성의 값이 id인 정보를 받아온다.
		String pw = request.getParameter("pw");
		
		System.out.println(id + "/" + pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
