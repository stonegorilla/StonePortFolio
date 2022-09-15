package com.ssafy.board.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

@WebServlet("/board")
public class BoardController extends HttpServlet{
	private BoardDao dao = BoardDaoImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get 요청에서는 딱히 안해도 되지만 POST 요청이 들어왔을때
		if(request.getMethod().equals("POST")) request.setCharacterEncoding("UTF-8");
		
		// Front-controller 패턴
		String act = request.getParameter("act");
		
		switch(act) {
		
		
	}

	
	
	
	
	
	}
	
}
