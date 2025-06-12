package videojuegos;

import java.sql.*;


public class ConnectionDB {
	
	private static final String URL = "jdbc:mariadb://localhost:3306/videojuegos";
	private static final String user = "user";
	private static final String Password = "P1234";
	
	public static Connection openConnection() throws SQLException {
		return DriverManager.getConnection(URL, user, Password);
		
	}
	
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}

}
