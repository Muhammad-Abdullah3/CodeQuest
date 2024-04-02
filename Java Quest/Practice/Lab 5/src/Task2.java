import java.util.Scanner;
interface Shape1
{
public float getArea(float para1,float para2);
}
interface Shape2
{
public void getPerimeter();
}
class Rect implements Shape1,Shape2
{
	float len = 0,wid=0;
	public void getPerimeter()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle: ");
		len = inp.nextFloat();
		System.out.println("Enter Width of the Rectangle: ");
		wid = inp.nextFloat();
	}
	@Override
	public float getArea(float length,float width)
	{
		return length*width;
	}
}

//Sub class of Shape (Circle) Starting
class Circ implements Shape1,Shape2
{
	 float rad = 0;
	 public void getPerimeter()
		{
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter Radius of the Circle: ");
			float pi = (float) 3.14;
			rad = inp.nextFloat();
			inp.close();
		}
	public float getArea(float rad,float pi)
	{
		return 2*(float) pi*rad;
	}
}
//Sub class of Shape (Circle) Ending
// Sub class of Shape (Triangle) Starting
class Tri implements Shape1,Shape2
{
	float base=0,height =0;
	public float getArea(float base,float height)
	{
		return (base*height)/2;
	}
	public void getPerimeter()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Base of the Triangle: ");
		base = inp.nextFloat();
		System.out.println("Enter Height of the Triangle: ");
		height = inp.nextFloat();
		inp.close();
	}
}
//Sub class of Shape (Triangle) Ending
public class Task2 {
	public static void main(String[] args)
	{
		// Creating object of all sub classes of Shape class
		Circ c1 = new Circ();
		Rect r1 = new Rect();
		Tri t1 = new Tri();
		c1.getPerimeter();		
		System.out.println("Area of the Circle = "+c1.getArea(c1.rad, (float)3.14));
		r1.getPerimeter();
		System.out.println("Area of the Rectangle = "+r1.getArea(r1.len, r1.wid));
		t1.getPerimeter();
		System.out.println("Area of the Triangle = "+t1.getArea(t1.base, t1.height));
	}

}
