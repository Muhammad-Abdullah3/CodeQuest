import java.util.Scanner;
	 class Shapes{
		protected double parameter;
		public Shapes(double parameter)
		{
			this.parameter = parameter;
		}
		public void calculateArea(){	
		}
	}
	 
	class Cir extends Shapes{
	//Changes
		public Cir(double parameter)
		{
			super(parameter);
		}
		//Changed
		public void calculateArea(){
			double pi=3.14;
		double area=pi*(parameter*parameter);
			System.out.println("Area of the circle is : "+area);
		}	
	}
	
	class Tri extends Shapes{
		//Changes
				public Tri(double parameter)
				{
					super(parameter);
				}
				//Changed
		public void calculateArea() {
			double area=0.5*(parameter*parameter);
			System.out.println("Area of triangle is : " + area);	
		}	
	}
	
	class Square extends Shapes{
		//Changes
				public Square(double parameter)
				{
					super(parameter);
				}
				//Changed
		public void calculateArea(){
			double area=parameter*parameter;
			System.out.println("Area of Square is : " + area);
		}
	}

	public class Prac1 {
		public static void main(String[]args) {
			double pi=3.14;
			Scanner input=new Scanner(System.in);
			System.out.println("\t\tArea of Rectangle!!!!");
			Square obj1=new Square(3.4);
			//System.out.print("Enter the side of the Square : ");
			//obj1.parameter=input.nextDouble();
			obj1.calculateArea();
			
			System.out.println("\n\t\tArea of Right Angled Triangle!!!!");
			Tri obj2=new Tri(3.4);
			//System.out.print("Enter the Length of the Right Angled Triangle : ");
			//obj2.parameter=input.nextDouble();
			obj2.calculateArea();
			
			
			System.out.println("\t\tArea of Circle!!!!");
			Cir obj3=new Cir(3.4);
			//System.out.print("Enter the radius of the Circle : ");
			//obj3.parameter=input.nextDouble();
			obj3.calculateArea();
			
		}
}