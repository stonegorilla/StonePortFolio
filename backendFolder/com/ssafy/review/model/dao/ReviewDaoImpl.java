package com.ssafy.review.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.review.model.dto.Review;
import com.ssafy.util.DBUtil;

public class ReviewDaoImpl implements ReviewDao {
	
	private final DBUtil util = DBUtil.getInstance();
	
	static private ReviewDao instance = new ReviewDaoImpl();
	private ReviewDaoImpl() {}
	
	static public ReviewDao getInstance() {
		return instance;
	}
	@Override
	public List<Review> selectAll(int boardIdx) {
		// SQL 준비
		String sql = "select*from reviewtable where boardIdx =?";
		List<Review> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardIdx);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Review review = new Review();
				review.setIdx(rs.getInt("idx"));
				
				review.setTitle(rs.getString("title"));
				review.setContent(rs.getString("content"));
				review.setBoardIdx(rs.getInt("boardIdx"));
				review.setWriterIdx(rs.getInt("writerIdx"));
				review.setViews(rs.getInt("views"));
				review.setCreateTime(rs.getString("createTime"));
				list.add(review);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(rs,pstmt,conn);
		}
		return list;
	}

	@Override
	public Review selectOne(int idx) {
		String sql = "SELECT *FROM reviewtable where idx= ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Review review = new Review();
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				review.setIdx(rs.getInt("idx"));
				review.setTitle(rs.getString("title"));
				review.setContent(rs.getString("content"));
				review.setBoardIdx(rs.getInt("boardIdx"));
				review.setWriterIdx(rs.getInt("writerIdx"));
				review.setViews(rs.getInt("views"));
				review.setCreateTime(rs.getString("createTime"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void InsertReview(Review review) throws SQLException {
		String sql = "insert into reviewtable ( title, content,boardIdx,writerIdx) values (?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = util.getConnection();
			
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, review.getTitle());
			pstmt.setString(2, review.getContent());
			pstmt.setInt(3, review.getBoardIdx());
			pstmt.setInt(4, review.getWriterIdx());
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
	public void deleteReview(int idx) {
		String sql = "delete from reviewtable where idx=?";
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
	public void updateReview(Review review) {
		String sql = "update reviewtable set title = ?, content= ? where idx=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, review.getTitle());
			pstmt.setString(2, review.getContent());
			pstmt.setInt(3, review.getIdx());
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			util.close(conn,pstmt);
		}
		
	}

	@Override
	public void updateView(int idx) {
		String sql = "update reviewtable set views = views+1 where idx=?";
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
	
}
