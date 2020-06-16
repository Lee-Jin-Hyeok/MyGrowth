package com.test.project;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	private Map<String,User> database;
	
	public UserDAO() {
		this.database = new HashMap<String, User>();
	}
	
	public void insert(String userId, String userPw, String userAge, String userMail) {
		User user = new User(userId, userPw, userAge, userMail);
		database.put(userId, user);
	}
	
	public User select(String userId) {
		return database.get(userId);
	}
}