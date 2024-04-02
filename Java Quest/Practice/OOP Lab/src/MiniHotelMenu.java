import java.util.Scanner;
public class MiniHotelMenu 
{
	// Menu Function Prototype
	public static void menu()
	{
		System.out.println("Menu:\n\t1.Ice Cream 200/-\n\t2.Pasta 500/-\n\t3.Tea 100/-\n\t4.Samosa 100/-");
	}
	public static float taxCal(float total)
	{
		float gst = (17*total)/100;
		return total+gst;
	}
	public static void main(String[] args)
	{
		//Creating a Scanner Object
		Scanner inp = new Scanner(System.in);
		System.out.println("Welcome to Mini Moo Cafe");
		float total = 0;
		char order,choice;
		do
		{
			System.out.print("What do you want to order?");
			menu();
			order = inp.next().charAt(0);
			switch(order)
			{
			case '1':
				total+=200;
				break;
			case '2':
				total+=500;
				break;
			case '3':
				total+=100;
				break;
			case '4':
				total+=100;
				break;
			default:
				System.out.println("Invalid input.");
			}
			System.out.println("Total = "+total);
			System.out.println("Do you want to add more items?");
			choice = inp.next().charAt(0);
		}while(choice != 'n');
		float totalBill = taxCal(total);
		System.out.println("Total bill with 17% GST = "+totalBill);
		System.out.println("Have a good day. Come back again.");
		inp.close();
	}

}
