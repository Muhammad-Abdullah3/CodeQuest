import java.util.Scanner;
class Signup 
{
	int choice = 0;
	Scanner inp = new Scanner(System.in);
	public void candSignUp()
	{
		Candidate can = new Candidate();
		can.addCandidate();
		can.setSymbol();
		System.out.println("Congratulations You have Signed up as a Candidate.");
	}
	public void voterSignUp()
	{
		Voter vo = new Voter();
		vo.addVoter();
		System.out.println("Congratulations You have Signed up as a Voter.");
	}
	public void menu()
	{
		System.out.println("Press 1 for Signing Up as a Candidate:");
		System.out.println("Press 2 for Signing Up as a Voter:");
		switch(choice)
		{
		case 1:
			candSignUp();
			break;
		case 2:
			voterSignUp();
			break;
		default:
			System.out.println("Invalid Choice please chose again.");
			Signup sign = new Signup();
			sign.menu();
			
		}
	}
}
