package com.ssafy.user.model.dao;

import java.sql.SQLException;

import com.ssafy.user.model.dto.User;

public interface UserDao {
	
	
	// id 등록 
	public void InsertUser(User user) throws SQLException;
	
	// id,비밀번호 확인
	public User CheckUser(String userId,String password) throws SQLException;
	
	// 댓글이나 보드에서 사용할대
	public String writerUser(int idx);
}
