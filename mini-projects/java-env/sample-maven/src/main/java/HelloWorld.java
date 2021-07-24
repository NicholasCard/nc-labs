import java.sql.*;


public class HelloWorld {

	
	
	
	

	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","nacard192", "Distance07:22");
					{
						System.out.println("connected");
					}
			  // more code goes here
			} catch (SQLException e) {
				e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
			}
		
		}
	}

