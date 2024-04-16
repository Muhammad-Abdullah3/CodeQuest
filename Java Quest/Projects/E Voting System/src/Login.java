import java.util.Scanner;
class LogIn 
{
	int choice = 0; String searchName,searchCnic;
	Scanner inp = new Scanner(System.in);
	public void candLogIn()
	{
		Candidate can = new Candidate();
		System.out.println("Enter Your Name: ");
		searchName = inp.nextLine();
		searchCnic = inp.nextLine();
		for(int i=0;i<Candidate.canName.size();i++)
		{
			if(Candidate.canName.get(i)==searchName&&Candidate.canCnic.get(i)==searchCnic)
			{
				System.out.print("Login Successful");
				
			}
		}
	}
	public void voterLogIn()
	{
		Voter vo = new Voter();
		System.out.println("Enter Your Name: ");
		searchName = inp.nextLine();
		searchCnic = inp.nextLine();
		for(int i=0;i<Voter.votName.size();i++)
		{
			if(Voter.votName.get(i)==searchName&&Voter.votCnic.get(i)==searchCnic)
			{
				System.out.print("Login Successful for Voter.");
			}
		}
	}
	public void LogInmenu()
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
