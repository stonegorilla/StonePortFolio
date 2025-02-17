package com.ssafy.user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ssafy.user.model.dto.User;
import com.ssafy.util.DBUtil;

public class UserDaoImpl implements UserDao{
	// 만들어진 DBUtil 들고오기 
		private final DBUtil util = DBUtil.getInstance();
		
		static private UserDaoImpl instance = new UserDaoImpl();
		
		private UserDaoImpl() {
			
		}
		
		public static UserDaoImpl getInstance() {
			return instance;
		}
		
	@Override
	public void InsertUser(User user) throws SQLException {
		
		String sql = "insert into usertable (userId, password, name, nickname,email) values (?,?,?,?,?)";
		// db에 접속해서 사용하게끔 쓰자 
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getNickName());
			pstmt.setString(5, user.getEmail());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(pstmt,conn);
		}
	}

	@Override
	public User CheckUser(String userId, String password)  {
		String sql = "select*from usertable where userId = ? and password=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 user = new User();
				 user.setIdx(rs.getInt("idx"));
				 user.setUserId(rs.getString("userId"));
				 user.setPassword(rs.getString("password"));
				 user.setName(rs.getString("name"));
				 user.setNickName(rs.getString("nickname"));
				 user.setEmail(rs.getString("email"));
			 }
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(rs,pstmt,conn);
		}
		return user;
	}
	
	public String writerUser(int idx) {
		String sql = "select nickname from usertable where idx=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String writer= "";
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				writer = rs.getString("nickname");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			util.close(rs,pstmt,conn);
		}
		
		return writer;
		
	}

}
