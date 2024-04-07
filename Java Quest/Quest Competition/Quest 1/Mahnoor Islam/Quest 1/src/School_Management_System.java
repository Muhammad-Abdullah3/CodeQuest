import java.util.Scanner;
class Course{
	String courseName;
	String courseCode;
	String timings;
	public Course(String courseName, String courseCode, String timings) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.timings = timings;	
	}
}
abstract class Person{
	String name;
	int id;
	String department_name;
	String course;
	public abstract void getName();
	public abstract void getId();
	public abstract void getDepartmentName();
	public abstract void getCourse();
}
class Student extends Person{
	Scanner s = new Scanner(System.in);
    public void getName() {
    	System.out.println("Enter name of student: ");
    	name = s.nextLine();
	}
    public void getId() {
    	System.out.println("Enter ID of student: ");
    	id = s.nextInt();
    	s.nextLine(); 
	}
    public void getDepartmentName() {
    	System.out.println("Enter Department name: ");
    	department_name = s.nextLine();
	}
    public void getCourse() {
    	System.out.println("Enter your course title: ");
    	course = s.nextLine();
	}
	
}
class Teacher extends Person{
	
	Scanner s = new Scanner(System.in);
    public void getName() {
    	System.out.println("Enter name of Teacher: ");
    	name = s.nextLine();
	}
    public void getId() {
    	System.out.println("Enter ID of Teacher: ");
    	id = s.nextInt();
    	s.nextLine(); 
	}
    public void getDepartmentName() {
    	System.out.println("Enter Department name: ");
    	department_name = s.nextLine();
	}
    public void getCourse() {
    	System.out.println("Enter your course title: ");
    	course = s.nextLine();
	}
}
	
public class School_Management_System {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continueLoop = true;
		while(continueLoop) {
			System.out.println("Menu");
			System.out.println("Press 1 for Student Detail: ");
			System.out.println("Press 2 for Teacher Detail");
			System.out.println("Press 3 for Exit Loop: ");
			System.out.println("Enter your choice: ");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
					Student student = new Student();
					student.getName();
					student.getCourse();
					student.getDepartmentName();
					student.getId();
					System.out.println("Result of student: ");
		            System.out.println("Name: " + student.name);
		            System.out.println("ID: " + student.id);
		            System.out.println("Department: " + student.department_name);
		            System.out.println("Course: " + student.course);
				
					break;
				case 2:
					Teacher teacher = new Teacher();
					teacher.getName();
					teacher.getCourse();
					teacher.getDepartmentName();
					teacher.getId();
					System.out.println("Result of teacher: ");
		            System.out.println("Name: " + teacher.name);
		            System.out.println("ID: " + teacher.id);
		            System.out.println("Department: " + teacher.department_name);
		            System.out.println("Course: " + teacher.course);
					break;
				case 3:
					continueLoop = false;
					break;
				default:
					System.out.println("Invalid choice: ");
						
			}	
		}
	}
}