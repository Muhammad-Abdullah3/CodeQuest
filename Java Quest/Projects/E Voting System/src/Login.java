import java.util.Scanner;
class Signup 
{
	int choice = 0;
	Scanner inp = new Scanner(System.in);
	public void candLogIn()
	{
		Candidate can = new Candidate();
		System.out.println("Congratulations You have Signed up as a Candidate.");
	}
	public void voterLogIn()
	{
		Voter vo = new Voter();
	}
	public void menu()
	{
		System.out.println("Press 1 for Signing Up as a Candidate:");
		System.out.println("Press 2 for Signing Up as a Voter:");
		switch(choice)
		{
		case 1:
			candLogIn();
			break;
		case 2:
			voterLogIn();
			break;
		default:
			System.out.println("Invalid Choice please chose again.");
			Signup sign = new Signup();
			sign.menu();
		}
	}
}
