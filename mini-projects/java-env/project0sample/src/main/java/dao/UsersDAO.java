package dao;

import java.util.ArrayList;
import java.util.List;

import common.pojo.User;

public class UsersDAO {

	// this function will eventually call the SQL statement that just selects all of the 
	//Users from the database
	public List<User> findAll() {
		List<User> mock = new ArrayList<User>();
		//temporary until sql connection
		
		mock.add(new User(4, "olivia", "brumgard", "employee"));
		mock.add(new User(5, "nick", "nards", "customer"));
		
		return mock;
 		
	}
	
	public List<User> findAll(String f_name) {
		return null;
	}
	
	public int save(User u) {
		return 0;
	}
	
	public void update(int id, String f_name) {
		
	}
	
public void delete(int id) {
		
	}
}
