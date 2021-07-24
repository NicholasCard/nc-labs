package sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


/*
 *  Create a group sorter app, console based, that will list down the groups in ascending or descending order based on 
 *  the average score of members of the group.
 *
 *  Features include
 *
 *  1. add groups
 *
 *  2. add members to a group
 *      AA1|A2|A3#BB1|B2|B3
 *
 *  3. add scores of each member for a given event
 *      Event1>A190|A256|...
 *      Event2>A178|A245|...
 *
 *  4. show the groups with scores descending
 *      A - 89
 *      B - 86
 *      C - 78
 */




//have to figure out a way to grab all of the grades for one particular group and get the average 
//need to create a loop that goes through all the loops then adds the grades and divides by the length


//might have wanted to use a hash map here honestly
//look into hashmaps because key value pairs would be super easy


//i could just add things to a group variable but i dont think that solves my issue

//still need a way to filter based on group and add all of the grades together into one variable
//then back into a list or hashmap

public class Runner {
	
	
	public static void sortGroupAverage(List<Student> list) {
		
		double average = 0;
		for (Student grades : list) {
			average = (grades.getGrade() + average) ;
			
		}
		System.out.println("This is the average grade for all students: " + average / list.size());
		
	}
	
	//method created for printing students
	public static void printStudents(List<Student> students) {
		
		for (Student st : students) {
			
			System.out.println("Name: "+ st.getName() + " Group: " + st.getGroup() + " Grade: " + st.getGrade());
		}
	}
	
	public static void print(List<Student> list)
    {
        for (Student obj : list) {
            System.out.println(obj.getGroupProperty());
        }
    }
	
	public static void sortGroup(List<Student> list)
    {
  
        list.sort((st1, st2)
                      -> st1.getGroupProperty().compareTo(
                          st2.getGroupProperty()));
    }
	
	public static void sortGrade(List<Student> list)
    {
  
        list.sort((st1, st2)
                      -> st2.getGradeProperty().compareTo(
                          st1.getGradeProperty()));
    }
	
	//create a scanner method
	private static boolean running = true;
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		HashMap<String, Integer> groupAverages = new HashMap<>();
		
		//i want to put this in a better spot but figure it out later
		students.add(new Student("Travis", "B", 89));
		students.add(new Student("Olivia", "A", 80));
		students.add(new Student("Travis", "C", 90));
		students.add(new Student("Nick", "B", 56));
		
		sortGroupAverage(students);
		
		sortGroup(students);
		sortGrade(students);
		print(students);
		
		printStudents(students);
		Scanner sc = new Scanner(System.in); 
		
		
		
		//needs to loop until they say exit 
		
		System.out.println("Input your students by typing NEW or EXIT");
		System.out.println("format is NAME, GROUP, GRADE");
		System.out.println("Once you are finished inputting type EXIT");

		
		//commenting this out for now until i get the whole collection thing working
		while (running) {
			
			String cont = sc.nextLine();
			
			
			if (cont.equalsIgnoreCase("new")) {
				
				System.out.println("Enter the Name");
				String name = sc.nextLine();
				System.out.println("Enter the GROUP");
				String group = sc.nextLine();
				System.out.println("Enter the GRADE");
				int grade = sc.nextInt();
				
				Student person = new Student(name, group, grade);
				
				students.add(person);
				
				System.out.println("here are the students sorted by groups");
				sortGroup(students);
				printStudents(students);
				
				System.out.println("here are the students sorted by grades");
				sortGrade(students);
				printStudents(students);
				//next step would be either sort by averages based on groups or 
				//sort by grades and groups so group a first and their grades then group
				
				
				//have to print out the averages 
				//might have coded myself into a hole here
				
				
				System.out.println("If you would like to continue type new");
			}
		
			else if (cont.equalsIgnoreCase("exit")) {
				System.out.println("Thanks for using the sorter");
				running = false;
				break;
			}
			
		}
		
		
		
		
	}

}
