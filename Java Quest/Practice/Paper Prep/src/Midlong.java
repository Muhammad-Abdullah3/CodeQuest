import java.util.Scanner;
class Candidate
{
	static String[] candidateList;
	static int[] votes;
	static int candNo = 0;
	public void addCandidate(String name)
	{
		candidateList[candNo] = name;
		votes[candNo] = 0;
		candNo ++;
	}
	public void castVote(String name)
	{
		for(int i=0;i<candidateList.length;i++)
		{
			if(name==candidateList[i])
			{
				votes[i]++;
			}
		}
	}
	public void printResult()
	{
		System.out.println("Candidate\t\tVotes");
		for(int i=0;i<candidateList.length;i++)
		{  
			System.out.println(candidateList[i]+"\t\t"+votes[i]);
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
