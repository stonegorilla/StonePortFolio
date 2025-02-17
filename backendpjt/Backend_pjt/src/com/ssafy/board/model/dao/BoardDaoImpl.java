package com.ssafy.board.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.util.DBUtil;

public class BoardDaoImpl implements BoardDao {
	// 만들어진 DBUtil 들고오기 
	private final DBUtil util = DBUtil.getInstance();
	
	static private BoardDaoImpl instance = new BoardDaoImpl();
	
	private BoardDaoImpl() {
		
	}
	
	public static BoardDaoImpl getInstance() {
		return instance;
	}
	
	
	@Override
	public List<Board> selectAll() {
		// SQL 준비 
					String sql = "SELECT * FROM boardtable ";
		List<Board> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = util.getConnection();
			 stmt = conn.createStatement();
			 rs =  stmt.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();
				board.setIdx(rs.getInt("idx"));
				board.setBoardId(rs.getString("boardId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriterIdx(rs.getInt("writerIdx"));
				board.setPart(rs.getString("part"));
				board.setChannelName(rs.getString("channelName"));
				board.setUrl(rs.getString("url"));
				board.setCreateTime(rs.getString("createTime"));
				list.add(board);
				
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			util.close(rs,stmt,conn);
		}
		return list;
	}

	@Override
	public Board selectOne(int idx) {
		String sql = "SELECT *FROM boardtable where idx= ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = new Board();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board.setIdx(rs.getInt("idx"));
				board.setBoardId(rs.getString("boardId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriterIdx(rs.getInt("writerIdx"));
				board.setPart(rs.getString("part"));
				board.setChannelName(rs.getString("channelName"));
				board.setUrl(rs.getString("url"));
				board.setCreateTime(rs.getString("createTime"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			util.close(rs,pstmt,conn);
		}
		return board;
	}

	@Override
	public void InsertBoard(Board board) throws SQLException {
		String sql = "INSERT INTO board(boardId,title,content,writerIdx,part,channelName,url) values(?,?,?,?,?,?,?)";
		
		// db에 접속해서 사용하게끔 쓰자.
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBoardId());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getWriterIdx());
			pstmt.setString(5, board.getPart());
			pstmt.setString(6, board.getChannelName());
			pstmt.setString(7, board.getUrl());
			int result = pstmt.executeUpdate();
			System.out.println(result);
			// 오토커밋 한번 사용해봤으 ㅎㅎ 
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			util.close(pstmt,conn);
		}
				
	}

	@Override
	public void deleteBoard(int idx) {
		String sql = "delete from boardtable where idx=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			util.close(conn,pstmt);
		}
	}

	@Override
	public void updateBoard(Board board) {
		String sql = "update boardtable set title = ?, content= ? where idx=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getIdx());
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			util.close(conn,pstmt);
		}
	}
	

	
	
	
}
