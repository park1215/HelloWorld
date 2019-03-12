package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	public static Connection getConnection(){
		String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL";
		
		try {
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.jdbc.Driver");
		
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
