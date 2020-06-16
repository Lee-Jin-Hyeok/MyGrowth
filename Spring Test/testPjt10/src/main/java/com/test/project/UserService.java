package com.test.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	public void userInsert(String userId, String userPw, String userAge, String userMail) {
		userDAO.insert(userId, userPw, userAge, userMail);
	}
	
	public User userFind(String userId, String userPw) {
		return userDAO.select(userId);
	}
}