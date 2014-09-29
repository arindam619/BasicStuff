package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	private static final String DB_USER = "test";
	private static final String DB_PASS = "123456";
	private static final String CONN_STR = "jdbc:mysql://localhost/student";
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		//ResultSet rs = null;
		
		StringBuilder sb;
		
		try {
			
			conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);			
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO record (name,subject,theory,practical,total) VALUES (?,?,?,?,?)");
			
			stmt.setString(1, "Supriya");
			stmt.setString(2, "Java");
			stmt.setInt(3, 65);
			stmt.setInt(4, 15);
			stmt.setInt(5, 80);
			
			if ( 1 == stmt.executeUpdate() )
				System.out.println("record added...");
			
			/*
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("SELECT * FROM record");
			
			while ( rs.next() ) {
				
				sb = new StringBuilder();
				
				sb.append( rs.getString("name") + ", " );
				sb.append( rs.getString("subject") + ", " );
				sb.append( rs.getString("total") + ", " );
				
				System.out.println(sb);
				
			}
			*/
			
			
			//if (rs != null) rs.close();
			
			if (stmt != null)
				stmt.close();
			
			if (conn != null)
				conn.close();
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
		
		
	}

}
