package com.ssafy.util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBUtil {
	// MySql 드라이버 클래스 이름
	private final String driverName = "com.mysql.cj.jdbc.Driver";
	// DB와 연결하기 위해 필요한 url
	private final String url = "jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC";
	private final String username = "root";
	private final String password = "rootpass";
	
	private static DBUtil instance = new DBUtil();
	
	private DBUtil() {
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static DBUtil getInstance() {
		return instance;
	}
	
	/**
	 * 
	 * DriverManager를 통해 내 유저아이디와 유저비밀번호를 이용하여
	 * @return Connection
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	
	public static void close(Connection conn, PreparedStatement pstmt,ResultSet rs) {
		try {
			if(rs != null) rs.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			if(pstmt != null) pstmt.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try {	
			if(conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		
		
		try {
			if(pstmt != null) pstmt.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		try {	
			if(conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(AutoCloseable... autoCloseables ) {
		for(AutoCloseable ac : autoCloseables) {
			if(ac != null) {
				try {
					ac.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

