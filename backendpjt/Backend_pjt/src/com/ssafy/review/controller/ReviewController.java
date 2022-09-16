package com.ssafy.review.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;
import com.ssafy.review.model.dao.ReviewDao;
import com.ssafy.review.model.dao.ReviewDaoImpl;
import com.ssafy.review.model.dto.Review;
import com.ssafy.user.model.dao.UserDao;
import com.ssafy.user.model.dao.UserDaoImpl;


@WebServlet("/review")
public class ReviewController extends HttpServlet {
	private BoardDao daoBoard = BoardDaoImpl.getInstance();
	private ReviewDao daoReview= ReviewDaoImpl.getInstance();
	private UserDao daoUser = UserDaoImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청 들어왔을 때
		if (request.getMethod().equals("POST"))
			request.setCharacterEncoding("UTF-8");

		// Front-controller 패턴으로
		String act = request.getParameter("act");

		switch (act) {
		
		case "reviewList":
			doReviewList(request,response);
		
		case "reviewCreate":
			doReviewCreate(request,response);
		case "reviewDetail":
			doReviewDetail(request,response);
		default:
			break;

		}

	}
	private void doReviewDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("오오");
		System.out.println(request.getParameter("boardIdx"));
		
		
		int idx = Integer.parseInt(request.getParameter("reviewIdx"));
		try {
			Review review = daoReview.selectOne(idx);
			String writer = daoUser.writerUser(review.getWriterIdx());
			Board board = daoBoard.selectOne(review.getBoardIdx());
			request.setAttribute("review", review);
			request.setAttribute("writer", writer);
			request.setAttribute("board", board);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("review/detail.jsp").forward(request, response);
		
	}
	private void doReviewCreate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int boardIdx = Integer.parseInt(request.getParameter("boardIdx"));
		Review review = new Review();
		review.setTitle(request.getParameter("title"));
		
		review.setBoardIdx(boardIdx);
		// 나중에 session으로 가지고 올거임 
		HttpSession session = request.getSession();
		review.setWriterIdx(Integer.parseInt( String.valueOf(session.getAttribute("userIndex"))));
		
		review.setTitle(request.getParameter("title"));
		try {
			daoReview.InsertReview(review);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("호우");
		response.sendRedirect("review?act=reviewList&boardIdx="+boardIdx);
	}
	private void doReviewList(HttpServletRequest request, HttpServletResponse response) {
		int boardIdx = Integer.parseInt(request.getParameter("boardIdx"));
		try {
			Board board = daoBoard.selectOne(boardIdx);
			request.setAttribute("board",  board );
			List<Review> list = daoReview.selectAll(boardIdx);
			request.setAttribute("reviewList", list);
			List<String> writerList = new ArrayList<>();
			for(int i=0; i<list.size(); i++) {
				String writer = daoUser.writerUser(list.get(i).getWriterIdx());
				writerList.add(writer);
			}
			
			request.setAttribute("writerList", writerList);
			
			request.getRequestDispatcher("review/list.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

	

	
}
