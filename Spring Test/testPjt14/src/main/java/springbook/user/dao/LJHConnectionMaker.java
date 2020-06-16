package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LJHConnectionMaker implements ConnectionMaker {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1/spring_test";
	private static final String USER_ID = "root";
	private static final String USER_PW = "1111";
	
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USER_ID, USER_PW);
	}
}