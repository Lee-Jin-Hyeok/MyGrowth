package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1/test";
	private static final String USER_ID = "root";
	private static final String USER_PW = "1111";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void insert(User user) {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String sql = "INSERT INTO user(user_id, user_pw, user_name, user_age) values(?, ?, ?, ?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPw());
			pstmt.setString(3, user.getUserName());
			pstmt.setInt(4, user.getUserAge());
			rs = pstmt.executeQuery();
			System.out.println("rs : " + rs);
		} catch(Exception e) {
			System.out.println("SQL ¿À·ù ¶ä ¤µ¤¡");
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void select(User user) {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String sql = "SELECT * FROM user WHERE user_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			rs = pstmt.executeQuery();
			System.out.println("rs : " + rs);
			
			System.out.println("ResultSet Print");
			System.out.println("-----------------------");
			
			while(rs.next()) {
				System.out.println(rs.getString("user_id"));
				System.out.println(rs.getString("user_pw"));
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getInt("user_age"));
			}
		} catch(Exception e) {
			System.out.println("SQL ¿À·ù ¶ä ¤µ¤¡");
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}