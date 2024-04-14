import java.util.Scanner;
interface Vehicle
{
	public void start();
	public void stop();
	public void getinfo();
}
class Bike implements Vehicle
{
	String model,power;
	double price = 0;
	public void start()
	{
		System.out.println("Bike is Started.");
	}
	public void stop()
	{
		System.out.println("Bike is Stoped.");
	}
	public void getinfo()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the model of the Bike.");
		model= inp.nextLine();
		System.out.println("Enter the power of the Bike in CC.");
		power = inp.nextLine();
		System.out.println("Enter price of the Bike.");
		price = inp.nextDouble();
		inp.close();
	}
	public void displayInfo()
	{
		System.out.println("Model of the Bike: "+model);
		System.out.println("Power of the Bike in CC: "+power);
		System.out.println("Price of the Bike: "+price);
	}
}
class Car implements Vehicle
{
	String model,power;
	double price = 0;
	public void start()
	{
		System.out.println("Bike is Started.");
	}
	public void stop()
	{
		System.out.println("Bike is Stoped.");
	}
	public void getinfo()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the model of the Truck.");
		model= inp.nextLine();
		System.out.println("Enter the power of the Car in CC.");
		power = inp.nextLine();
		System.out.println("Enter price of the Car.");
		price = inp.nextDouble();
		inp.close();
	}
}
class Truck implements Vehicle
{
	String model,power;
	double price=0;
	public void start()
	{
		System.out.println("Truck is Started.");
	}
	public void stop()
	{
		System.out.println("Truck is Stoped.");
	}
	public void getinfo()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the model of the Truck.");
		model = inp.nextLine();
		System.out.println("Enter the power of the Truck in Horse Power.");
		power = inp.nextLine();
		System.out.println("Enter price of the Truck.");
		price = inp.nextDouble();
		inp.close();
	}
}
public class Question1 
{

	public static void main(String[] args) 
	{
		Bike obj1 = new Bike();
		obj1.getinfo();
		obj1.start();obj1.stop();
		obj1.displayInfo();

		Truck obj2 = new Truck();
		obj2.getinfo();
		obj2.start();obj2.stop();

		Car obj3 = new Car();
		obj3.getinfo();
		obj3.start();obj3.stop();
	}

}
