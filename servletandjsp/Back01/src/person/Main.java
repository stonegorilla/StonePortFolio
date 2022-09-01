package person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/main")
public class Main extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
//		System.out.println(request.getParameter("name"));
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String action = request.getParameter("action");
		switch(action) {
		case "regist":
			doRegist(request,response);
			break;
		default:
			break;
		}
	}
	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
//		String hobby = request.getParameter("hobby");
//		PrintWriter writer = response.getWriter(); // 걍 넣어본것
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name,age,gender,hobbies);
		PersonManager pm = PersonManager.getInstance();
		pm.regist(p);
		// 요청 객체에 생성한 인스턴스를 집어 넣겠다. 
		request.setAttribute("person", p);
		request.setAttribute("size", pm.getList().size());
		
		RequestDispatcher disp = request.getRequestDispatcher("/result.jsp");
		disp.forward(request, response);
	}
}
