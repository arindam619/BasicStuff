package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Info {
	
	private static final String DB_USER = "test";
	private static final String DB_PASS = "123456";
	private static final String CONN_STR = "jdbc:mysql://localhost/student";
	
	private Connection conn = null;
	
	private static Info info = null;
	
	private void checkConnection() {
		
		if (conn == null)
			try {
				conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
			} catch (SQLException e) {
				System.err.println(e);
			}
		
	}
	
	private Info() {
		
		checkConnection();
		
		info = this;
		
	}
	
	
	/**
	 * Singleton design pattern
	 */
	public static Info Instance() {
		
		if (info == null)
			info = new Info();
		
		return info;
	}
	
	
	public void displayRecord() {

		StringBuilder sb;
		checkConnection();
		
		try (
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("SELECT * FROM record ORDER BY id DESC");				
			) {
			
			while ( rs.next() ) {
				
				sb = new StringBuilder();
				
				sb.append( rs.getString("id") + ": " );
				sb.append( rs.getString("name") + ", " );
				sb.append( rs.getString("subject") + ", " );
				sb.append( rs.getString("theory") + ", " );
				sb.append( rs.getString("practical") + ", " );
				sb.append( rs.getString("total") + ", " );
				
				System.out.println(sb);
				
			}
			
			if (conn != null) {
				conn.close();
				conn = null;
			}
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
		
	}	
	
	
	public String getStudentName(int id) {
		
		String studentName = null;
		checkConnection();
		
		try (
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM record WHERE id ="+id);
			) {
			
			
			while (rs.next()) {
				studentName = rs.getString("name");
			}
			
			if (conn != null) {
				conn.close();
				conn = null;
			}
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
		return studentName;		
		
	} 
	
	public boolean addRecord(HashMap<String, String> data) {
		
		boolean result = false;
		checkConnection();
		
		try (
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO record (name,subject,theory,practical,total) VALUES (?,?,?,?,?)");			
			) {
			
			stmt.setString(1,  data.get("name") );
			stmt.setString(2,  data.get("subject") );
			
			int theory = Integer.parseInt( data.get("theory") );
			int practical = Integer.parseInt( data.get("practical") );
			
			int total = practical > 0 ? theory+practical : theory;
			
			stmt.setInt(3, theory);
			stmt.setInt(4, practical);
			stmt.setInt(5, total);
			
			
			if ( 1 == stmt.executeUpdate() )
				result = true;
			
			if (conn != null) {
				conn.close();
				conn = null;
			}
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		return result;	
		
	}
	
	public boolean updateRecord(int id, HashMap<String, String> data) {
		
		boolean result = false;
		checkConnection();
		
		try (
				PreparedStatement stmt = conn.prepareStatement("UPDATE record SET name=?,subject=?,theory=?,practical=?,total=? WHERE id=?");			
			) {			
			
			stmt.setString(1, data.get("name") );
			stmt.setString(2, data.get("subject") );
			
			int theory = Integer.parseInt( data.get("theory") );
			int practical = Integer.parseInt( data.get("practical") );
			
			int total = practical > 0 ? theory+practical : theory;
			
			stmt.setInt(3, theory);
			stmt.setInt(4, practical);
			stmt.setInt(5, total);
			
			//set id
			stmt.setInt(6, id);
			
			
			if ( 1 == stmt.executeUpdate() )
				result = true;
			
			if (conn != null) {
				conn.close();
				conn = null;
			}
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
		return result;
	}
	
	public boolean deleteRecord(int id) {
		
		boolean result = false;
		checkConnection();
		
		try (
				PreparedStatement stmt = conn.prepareStatement("DELETE FROM record WHERE id=?");			
			) {
			
			stmt.setInt(1, id);
			
			if ( 1 == stmt.executeUpdate() )
				result = true;
			
			if (conn != null) {
				conn.close();
				conn = null;
			}
			
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
		return result;
	}
	
}
