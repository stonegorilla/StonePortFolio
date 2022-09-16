package com.ssafy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// Mysql 드라이버 클래스 이름 (어디서 가지고 왔더라...)
	private final String driverName = "com.mysql.cj.jdbc.Driver";
	// DB와 연결하기 위해 필요한 url
	private final String url = "jdbc:mysql://localhost:3306/ssafy_pjt?serverTimezone=UTC";
	private final String username = "root";
	private final String password = "ssafy";

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
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	
	public static void close(AutoCloseable...  autoCloseables)  {
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
