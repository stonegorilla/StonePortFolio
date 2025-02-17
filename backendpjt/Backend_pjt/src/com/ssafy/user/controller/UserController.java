package com.ssafy.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.user.model.dao.UserDao;
import com.ssafy.user.model.dao.UserDaoImpl;
import com.ssafy.user.model.dto.User;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private UserDao dao = UserDaoImpl.getInstance();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청 들어왔을 때
		if (request.getMethod().equals("POST"))
			request.setCharacterEncoding("UTF-8");

		// Front-controller 패턴으로
		String act = request.getParameter("act");

		switch (act) {
		case "loginForm":
			doLoginForm(request,response);
			break;
		case "testLogin":
			doTestLogin(request,response);
			break;
		case "signUpForm":
			doSignUpForm(request, response);
			break;
		case "signUp":
			doSignUp(request,response);
			break;
		
		default:
			break;

		}

	}

	

	private void doTestLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		User user = null;
		// 다오 
		try {
			user = dao.CheckUser(userId, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(user != null) {
			
			
			session.setAttribute("userIndex",user.getIdx());
			session.setAttribute("loginUser",user.getUserId());
			session.setAttribute("userName",user.getName());
			session.setAttribute("userNickName",user.getNickName());
			response.sendRedirect("board?act=main");
			System.out.println("오오오오");
		}else {
			PrintWriter writer = response.getWriter();
			writer.println("<script> alert('Not User'); location.href ='user?act=loginForm'; </script>");
		}
		
	}

	private void doSignUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		User user = new User();
		
		user.setUserId(request.getParameter("userId"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setNickName(request.getParameter("nickname"));
		user.setEmail(request.getParameter("email"));
		
		// 다오
		try {
			dao.InsertUser(user);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		PrintWriter writer = response.getWriter();
		
		writer.println("<script> alert('success'); location.href ='user?act=loginForm'; </script>");
		
//		response.sendRedirect("user?act=login");
		writer.close();
	}

	private void doLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/user/loginForm.jsp").forward(request, response);
		
	}

	private void doSignUpForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/user/signupForm.jsp").forward(request, response);
		System.out.println("홍");
	}
}
