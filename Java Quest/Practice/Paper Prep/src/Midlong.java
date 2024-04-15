import java.util.Scanner;
import java.util.ArrayList;
class Candidate
{
	static ArrayList<String> candidateList = new ArrayList<>();
	static ArrayList<Integer> votes = new ArrayList<>();
	public void addCandidate(String name)
	{
		candidateList.add(name);
		votes.add(0);
	}
	public void castVote(String name)
	{
		for(int i=0;i<candidateList.size();i++)
		{
			if(name==candidateList.get(i))
			{
				int temp = votes.get(i)+1;
				votes.set(i, temp);
			}
		}
	}
	public void printResult()
	{
		System.out.println("Candidate\t\tVotes");
		for(int i=0;i<candidateList.size();i++)
		{  
			System.out.println(candidateList.get(i)+"\t\t"+votes.get(i));
		}
	}
}
public class Midlong {

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		Candidate cand = new Candidate();
		char ch ='A';
		do
		{
			System.out.println("1-Add Candidate\n2-Cast Vote\n3-Print Result");
			int choice = inp.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of the Candidate:");
				String name = inp.nextLine();
				cand.addCandidate(name);
				break;
			case 2:
				System.out.println("Enter the name of the Candidate:");
				String name1 = inp.nextLine();
				cand.castVote(name1);
				break;
			case 3:
				cand.printResult();
			}
			System.out.println("Do you want to go back again (y/Y)");
			ch = inp.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println("Program terminated.");
	}
}
