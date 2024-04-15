import java.util.Scanner;
public class Main 
{
	void mainMenu()
	{
		Scanner inp = new Scanner(System.in); 
		System.out.println("\t\t------------------Welcome to Electronic Voting System-------------------------");
		System.out.println("Press 1 for Signing Up in Elections");
		System.out.println("Press 2 for Log in to your Profile");
		System.out.println("Press 3 for Checking in for Vote Casting");
		System.out.println("Press 4 for Checking out after Casting of the vote");
		int chose = inp.nextInt();
		switch(chose)
		{
		case 1:
			Signup sign1 = new Signup();
			sign1.menu();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Invalid Choice");
			mainMenu();
		}
		inp.close();
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.mainMenu();
	}
}
