package test;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String id;
	private transient String pw;
	private String email;
	
	public User(String name, String id, String pw, String email) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("User{ name : %s, id : %s, pw : %s, email : %s }", this.name, this.id, this.pw, this.email);
	}
}