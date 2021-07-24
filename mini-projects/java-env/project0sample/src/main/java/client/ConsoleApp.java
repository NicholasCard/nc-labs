package client;

import java.util.List;
import java.util.Scanner;

import common.pojo.User;
import service.UserService;

public class ConsoleApp {

	 private UserService service = new UserService();
	
	 
	public void start() {
		
		showMenu();
		System.out.println("Enter Action: ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
		switch (choice) {
		case "1":
			listView();
			break;
		default:
			break;
		}
		
		//these will be the methods to show the prompt and the scanner and what not 
		
		
		//could do this with try with resources
		//further research
		input.close();
		//searchView();
		//addView();
		//updateView();
		//deleteView();
		
	}
	
	public void searchView() {
		// TODO Auto-generated method stub
		
		
	}
	
	private void showMenu() {
		//show menu 
			//1. list
			//2. search
			//3. add
			//4. update
			//5. delete
		
		System.out.println("1. List");
		System.out.println("2. Search");
		System.out.println("3. Add");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		
	}
	
	private void listView() {
		
		//this function is throwing a null pointer exception need to figure out why
		
		
		List<User> users = service.findAll();
		
		//header
		System.out.println("|  ID  |  First Name  |  Last Name  |  Role  |");
		
		//data
		
		for (User u : users) {
			System.out.println(u.getId() + " | " + u.getF_name() + " | " + u.getL_name() + " | " + u.getRole());
		}
		
	}
}
