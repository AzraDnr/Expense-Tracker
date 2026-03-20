package ExpenseTracker;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;



public class SqlConnection {
	private final String USER_NAME = "root";
	private final String PASSWORD = "Ad123456*";
	private final String DB_URL = "jdbc:mysql://localhost:3306/expense_tracker";
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	}
	
}
