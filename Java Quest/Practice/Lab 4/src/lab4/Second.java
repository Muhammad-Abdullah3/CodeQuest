package lab4;
import java.util.Scanner;
class Shapes
{
	protected int parameter = 0;
}
class Square extends Shapes
{
	public int area(int side)
	{
		return side*side;
	}
}
//Sub class of Shape (Circle) Starting
class Cir extends Shapes
{
	public float area(int rad)
	{
		return 2*(float) 3.14*rad;
	}
}
//Sub class of Shape (Circle) Ending
// Sub class of Shape (Triangle) Starting
class Tri extends Shapes
{
	public float area(int side)
	{
		return (side*side)/2;
	}
}
//Sub class of Shape (Triangle) Ending
public class Second {
	public static void main(String[] args)
	{
		Shapes sh1 = new Shapes();
		Scanner inp = new Scanner(System.in);
		// Creating object of all sub classes of Shape class
		Cir c1 = new Cir();
		Square s1 = new Square();
		Tri t1 = new Tri();
		System.out.println("Enter radius of Circle: ");
		sh1.parameter = inp.nextInt();
		float circArea = c1.area(sh1.parameter);
		System.out.println("Area of the Circle = "+circArea);
		System.out.println("Enter One Side of Square: ");
		sh1.parameter = inp.nextInt();
		float sqArea = s1.area(sh1.parameter);
		System.out.println("Area of the Square = "+sqArea);
		System.out.println("Enter One Side of triangle: ");
		sh1.parameter = inp.nextInt();
		float triArea = t1.area(sh1.parameter);
		System.out.println("Area of the Triangle = "+triArea);
	}

}

