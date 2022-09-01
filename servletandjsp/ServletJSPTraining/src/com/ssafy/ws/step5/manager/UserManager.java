package com.ssafy.ws.step5.manager;

import java.util.ArrayList;

import com.ssafy.ws.step5.dto.User;

public class UserManager {
	ArrayList<User> users = new ArrayList<>();
	int userSeq = 0;
	static private UserManager manager = new UserManager();
	private UserManager() {
		
	}
	
	public UserManager getInstnace() {
		return manager;
	}
	
	public User login(String id, String pw) {
		for(int i=0; i<userSeq; i++) {
			if(id == users.get(i).getUserId() && pw == users.get(i).getPassword()) {
				return users.get(i);
			}
		}
		
		
		return null;
	}
	
	public boolean signUp(User user) {
		
		for(int i=0; i<userSeq; i++) {
			if(user.getUserId() == users.get(i).getUserId()) return false;
			
		}
		users.add(user);
		userSeq++;
		return false;
	}
	
	public String getNickName(int userSeq) {
		return users.get(userSeq).getNickName();
	}
	
	
	
	
}
