package aaaa;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		doProcess(request,response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch(action) {
		case "regist":
			doRegist(request,response);
			break;
		}
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age")) ;
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name,age,gender,hobbies);
		
		PersonManager pm = PersonManager.getInstance();
		// 요청 객체에 생성한 인스턴스를 집어 넣겠다. 
		request.setAttribute("person", p);
		request.setAttribute("size", pm.getList().size());
		
		// requestDispatcher에서 /를 쓰면 컨텍스트패쓰까지 경로를 포함한다. 
		RequestDispatcher disp = request.getRequestDispatcher("/");
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
