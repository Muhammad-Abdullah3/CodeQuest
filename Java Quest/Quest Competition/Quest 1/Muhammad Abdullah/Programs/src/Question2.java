// Person class representing common attributes and methods for both students and teachers
class Person 
{
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Student class
class Student extends Person 
{
    private int studentId;
    private Course[] courses;
    private int courseCount;

    public Student(String name, int age, String address, int studentId, int maxCourses) 
    {

        super(name, age, address);
        this.studentId = studentId;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void enrollCourse(Course course) 
    {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Cannot enroll in more courses");
        }
    }

    public void displayCourses() 
    {
        System.out.println("Courses enrolled:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].getName());
        }
    }
    @Override
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Student Id: "+studentId);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Teacher class representing teachers
class Teacher extends Person 
{
    private String department;
    private Course[] coursesTaught;
    private int courseCount;

    public Teacher(String name, int age, String address, String department, int maxCourses) 
    {
        super(name, age, address);
        this.department = department;
        this.coursesTaught = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void teachCourse(Course course) 
    {
        if (courseCount < coursesTaught.length) {
            coursesTaught[courseCount++] = course;
        } else {
            System.out.println("Cannot teach more courses");
        }
    }

    public void displayCoursesTaught()
    {
        System.out.println("Courses taught:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(coursesTaught[i].getName());
        }
    }
    @Override
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Department: "+department);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Course class representing courses
class Course 
{
    private String name;
    private String code;

    public Course(String name, String code) 
    {
        this.name = name;
        this.code = code;
    }
    public String getName()
    {
        return name;
    }

    public void getInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Course Code: " + code);
    }
}

// Main class Start
public class Question2 
{
    public static void main(String[] args) {
        Student s1 = new Student("Muhammad Abdullah", 19, "D.I.Khan", 1001, 6);
        Student s2 = new Student("Waheed Akhtar", 20, "Gujrat", 1002, 6);

        Teacher t1 = new Teacher("Mr. Muhammad Faraz", 28, "Faislabad", "Mathematics", 3);
        Teacher t2 = new Teacher("Ms. Mahjabeen Sami", 25, "Aukara", "Science", 3);

        Course mathCourse = new Course("Mathematics", "MTH101");
        Course scienceCourse = new Course("Science", "SCI101");

        s1.enrollCourse(mathCourse);
        s2.enrollCourse(scienceCourse);

        t1.teachCourse(mathCourse);
        t2.teachCourse(scienceCourse);

        s1.displayInfo();
        s1.displayCourses();

        t1.displayInfo();
        t1.displayCoursesTaught();
    }
}
