import java.util.Scanner;
interface Shape
{
}
class Rectangle implements Shape
{
	Scanner inp = new Scanner(System.in);
	public float calculateArea()
	{
		System.out.println("Enter length of the Rectangle: ");
		float len = inp.nextFloat();
		System.out.println("Enter Width of the Rectangle: ");
		float wid = inp.nextFloat();
		return len*wid;
	}
}
//Sub class of Shape (Circle) Starting
class Circle implements Shape
{
	Scanner inp = new Scanner(System.in);
	public float calculateArea()
	{
		System.out.println("Enter Radius of the Circle: ");
		float rad = inp.nextFloat();
		return 2*(float) 3.14*rad;
	}
}
//Sub class of Shape (Circle) Ending
// Sub class of Shape (Triangle) Starting
class Triangle implements Shape
{
	Scanner inp = new Scanner(System.in);
	public float calculateArea()
	{
		System.out.println("Enter Base of the Triangle: ");
		float  base = inp.nextFloat();
		System.out.println("Enter Height of the Triangle: ");
		float height = inp.nextFloat();
		return (base*height)/2;
	}
}
//Sub class of Shape (Triangle) Ending
public class Task1 {
	public static void main(String[] args)
	{
		// Creating object of all sub classes of Shape class
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		float circArea = c1.calculateArea();
		System.out.println("Area of the Circle = "+circArea);
		float rectArea = r1.calculateArea();
		System.out.println("Area of the Rectangle = "+rectArea);
		float triArea = t1.calculateArea();
		System.out.println("Area of the Triangle = "+triArea);
	}

}
