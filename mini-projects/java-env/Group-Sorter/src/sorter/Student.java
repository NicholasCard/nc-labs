package sorter;



public class Student {

	public String name;
	public String group;
	public Integer grade;
	
	//need to just have a student object
	
	public Student(String name, String group, Integer grade) {
		this.name = name;
		this.group = group;
		this.grade = grade;
	}
	
	public void display()
    {
        System.out.println("Student name is: " + name + " "
                           + " and Student group is: "
                           + group + 
                           " and student grade is: " + " " +
                           grade);
        System.out.println();
    }
	
	public String getName() {
		return name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public Integer getGrade() {
		return grade;
	}
	
	//research into lambda functions and compareTo
	public String getGroupProperty()
    {
        return this.group;
    }
	
	public Integer getGradeProperty()
    {
        return this.grade;
    }
	
}


