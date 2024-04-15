import java.util.Scanner;
abstract class Person // Person class that will contain all info about persons 
{
	Scanner inp = new Scanner(System.in);
	String name,fatherName,cnic;
	public void getInfo()
	{
		System.out.println("Enter your Name: ");
		name = inp.nextLine();
		System.out.println("Enter your Father Name: ");
		fatherName = inp.nextLine();
		System.out.println("Enter your National Id Card Number without \"-\": ");
		cnic = inp.nextLine();
	}
}
