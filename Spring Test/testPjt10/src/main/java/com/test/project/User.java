package com.test.project;

public class User {
	private String userId;
	private String userPw;
	private String userAge;
	private String userMail;
	
	public User(String userId, String userPw, String userAge, String userMail) {
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userMail = userMail;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
}