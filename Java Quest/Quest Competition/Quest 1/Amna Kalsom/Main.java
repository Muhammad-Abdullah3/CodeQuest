class Person 
{
    protected String name;
    protected int age;
    protected String timing;
    protected String depart;
    public Person(String name, int age, String timing,String depart)
    {
        this.name = name;
        this.age = age;
        this.timing = timing;
        this.depart=depart;
    }
}
class Student extends Person {
    private int studentId;
    public Student(String name, int age, String timing, int studentId,String depart) {
        super(name, age,timing,depart);
        this.studentId = studentId;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("timing: " + timing);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + depart);
    }
}
class Teacher extends Person {
    private String employeeId;

    public Teacher(String name, int age, String gender, String employeeId,String depart) {
        super(name, age, gender,depart);
        this.employeeId = employeeId;
    }
    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("timing: " + timing);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + depart);
    }
}
class Course {
    private String courseName;
    private String courseId;
    private Teacher teacher;
   private String depart;

    public Course(String courseName, String courseId, Teacher teacher, String depart) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacher = teacher;
        this.depart=depart;
    }
    
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Department: " + depart);
    }
}
public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("sidra zahid", 35, "08:00", "T123","CS");
        teacher.displayInfo();
        Student student1 = new Student("Amna", 19, "08:00", 53373,"CS");
        student1.displayInfo();
        Student student2 = new Student("Ahmad", 20, "09:00", 56674,"CS");
        student2.displayInfo();
        Course mathCourse = new Course("Mathematics", "MATH101", teacher,"CS");
               mathCourse.displayInfo();
    }
}