import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExample {

	public static void main(String[] args) {
		
		
		//load the properties file
		Properties props = new Properties();
		
		try (FileInputStream fileStream  = new FileInputStream("src/main/resources/config.properties")){
			
		props.load(fileStream);
		
		
		String URL = (String)props.get("db_url");
		String USERNAME = (String)props.get("db_user");
		String PASSWORD = (String)props.get("db_password");
		
		//
		
			//1. get connection object
			try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			
			// 2. get statement object
			Statement stmt = conn.createStatement();
			
			//there is another statement variation 
			
			//need to add the bank.table notation to get to the right schema 
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO bank.users (f_name, l_name, role) VALUES (?, ?, ?)");
				
			pstmt.setString(1, "siobhan");
			pstmt.setString(2, "mcshea");
			pstmt.setString(3, "employee");
			
			int inserted1 = pstmt.executeUpdate();
			System.out.println("inserted1: " + inserted1);
			// 3. get resultSet Object
			
			PreparedStatement pstmt2 = conn.prepareStatement("SELECT f_name, id, l_name FROM bank.users WHERE f_name = ?");
			
			//running the execute query readData(stmt) method
			readData(pstmt2);
			
			//int inserted = stmt.executeUpdate("INSERT INTO users (f_name, l_name, role) VALUES ('siobhan', 'mcshea', 'customer')");
			
			
			//this will print out 1 if successful and 0 if it failed
			//System.out.println("inserted: " + inserted);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		 catch (Exception ex) {
			 ex.printStackTrace(); 
		 }
			
		
		
		
		
	}
	static void readData(PreparedStatement pstmt2) throws SQLException {
		
		// 3. get result object if query
		
		//* this has to be the schema name so it knows which schema it needs to grab from 
		
		//i have now gotten the connection to the database successful
		    
		pstmt2.setString(1, "nick");
		
		ResultSet rs = pstmt2.executeQuery();
		
		while(rs.next()) {
			
			//you can change the rs.getString with a number to get the column 
			//()
			String f_name = rs.getString("f_name");
			String l_name = rs.getString("l_name");
			
			//it grabs the columns in order if you select more columns
			//String f_name = rs.getString(0);
			System.out.println(f_name + " " + l_name);
		}
		
	}

}