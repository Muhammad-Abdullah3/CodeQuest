class Student {
	public void department(String department){
		System.out.println("enter your department name"+ department);
	}
	public void name(String name) {
		System.out.println("enter your name"+ name);
	}
	public void time(String time) {
		System.out.println("enter your timing"+ time);
	}
	public void id(String id) {
		System.out.println("enter your id"+ id);
	}
	}
class Teacher extends Student{
	//@override
	public void department(String department){
		System.out.println("enter your department name"+ department);
		
	}
	//@override
	public void name(String name) {
		System.out.println("enter your name"+ name);
		
	}
	//@override
	public void time(String time) {
		System.out.println("enter your timing"+ time);
	}
	//@override
	public void id(String id) {

		System.out.println("enter your id"+ id);
	}
	}
	class Course extends Teacher{
		//@override
		public void department(String department){

			System.out.println("enter your department name"+ department);
			
		}
		//@override
		public void name(String name) {
			
			System.out.println("enter your name"+ name);
			
		}
		//@override
		public void time(String time) {
			
			System.out.println("enter your timing"+ time);
		}
		//@override
		public void id(String id) {
			
			System.out.println("enter your id"+ id);
	
		}
	}
public class Mainn{
		public static void main(String[] args) {
			Student s=new Student();
			s.department("BSCS");
			s.name("Rafia");
			s.time("2:30pm");
			s.id("54546");
		 Teacher t=new Teacher();
		 t.department("BSCS");
			t.name("Mam Ayeshs Majid");
			t.time("4:30");
			t.id("54537");
			Course c=new Course();
			c.department("cs");
			c.name(" computer Science");
			c.time("4 years");
			c.id("222222");
		}
	
	
}
