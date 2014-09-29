package bc;

import java.sql.*;


public class AccessDB {
	
	private static final String DB_USER = "mysqluser";
	private static final String DB_PASS = "123456";
	private static final String CONN_STR = "jdbc:mysql://localhost/professional";

	
	public static void main(String[] args) {
		
		//Connection conn = null;
		//Statement stmt = null;
		//ResultSet rs = null;
		
		final String SQL = "INSERT INTO students (name, expert_field, level) VALUES ('Biswajeet', 'Server Networking', 70)";
				
		try (
				//try with resources
				Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				//ResultSet rs = stmt.executeQuery("SELECT name,expert_field FROM students WHERE level > 60");
				//stmt.executeQuery(SQL);				 
				
				) {
			
			stmt.executeUpdate(SQL);
			System.out.println("Successfully inserted");
			
			//conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
			//stmt = conn.createStatement();
			//rs = stmt.executeQuery("SELECT name,expert_field FROM students WHERE level > 60");
			
			//rs.last();
			//System.out.println("Number of rows: " + rs.getRow());
			
			/*
			while (rs.next()) {
				
				//String name = rs.getString("name");
				//System.out.println("Student: " + name);
				
				String output = rs.getString("name") + "\t" + rs.getString("expert_field");
				System.out.println(output);
				
			}
			*/
			
			
			//System.out.println("Connected to mysql.");
			
		} catch (SQLException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		} 
		
		/*
		finally {
			
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			
		}
		*/
		
	}

}
