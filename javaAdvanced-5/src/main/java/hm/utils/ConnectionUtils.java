package hm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String USER_NAME = "max";
	private static String USER_PASSWORD = "root";
	private static String URL = "jdbc:mysql://localhost/shop?serverTimezone=UTC";
	
	public static Connection connectToDB() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		return DriverManager.getConnection(URL,USER_NAME,USER_PASSWORD);
	}
}
