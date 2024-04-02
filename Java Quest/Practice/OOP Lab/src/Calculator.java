import java.util.Scanner;
public class Calculator 
{
	// Addition Function
	public static int add(int n, int m)
	{
		int sum = n+m;
		return sum;
	}
	// Subtraction Function
	public static int sub(int n, int m)
	{
		int diff = n-m;
		return diff;
	}
	// Multiply Function
	public static int mult(int n, int m)
	{
		int product = n*m;
		return product;
	}
	//Division Function
	public static float div(int n, int m)
	{
		float quot = n/m;
		return quot;
	}
	public static void main(String[] args) 
	{
		// Creating a Scanner object
		Scanner inp = new Scanner(System.in);
		// Creating two Variables and asking for input
		System.out.println("Enter First Number: ");
		int first = inp.nextInt();
		System.out.println("Enter Second Number: ");
		int sec = inp.nextInt();
		// Switch Case for decision of function
		System.out.print("Press 1 for Sum\nPress 2 for Difference\nPress 3 for Product\nPress 4 for Quotient\n");
		char choice = inp.next().charAt(0);
		switch(choice)
		{
		case '1':
			System.out.println("Sum of Entered numbers: "+(add(first,sec)));
			break;
		case '2':
			System.out.println("Difference of Entered numbers: "+(sub(first,sec)));
			break;
		case '3':
			System.out.println("Product of Entered numbers: "+(mult(first,sec)));
			break;
		case '4':
			System.out.println("Quotient of Entered numbers: "+(div(first,sec)));
			break;
		default:
			System.out.println("Invalid Input");
		}
		//Closing Scanner Object
		inp.close();
	}

}
