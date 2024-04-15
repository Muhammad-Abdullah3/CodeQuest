import java.util.ArrayList;
import java.util.Scanner;
class Candidate extends Person
{
	Scanner inp = new Scanner(System.in);
	static ArrayList<String> canName = new ArrayList<>();
	static ArrayList<String> canFatName = new ArrayList<>();
	static ArrayList<String> canCnic = new ArrayList<>();
	static ArrayList<String> canGender = new ArrayList<>();
	static ArrayList<String> canSymbol = new ArrayList<>();
	static ArrayList<Integer> canID = new ArrayList<>();
	static int candNum = 1;
	public void addCandidate()
	{		
		getInfo();
		canName.add(name);
		canFatName.add(fatherName);
		canCnic.add(cnic);
		canGender.add(gender);
		canID.add((candNum+100));
		candNum++;
		Voter.votId.add((Voter.voterNum+1000));
		Voter.voterNum++;
		Voter.votName.add(name);
		Voter.votFatName.add(fatherName);
		Voter.votCnic.add(cnic);
	}
	public void setSymbol()
	{
		System.out.println("Enter any Symbol Name you want to chose: ");
		String name = inp.nextLine();
		canSymbol.add(name);
	}
}
