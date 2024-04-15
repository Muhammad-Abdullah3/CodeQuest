import java.util.ArrayList;
class Candidate extends Person
{
	static ArrayList<String> canName = new ArrayList<>();
	static ArrayList<String> canFatName = new ArrayList<>();
	static ArrayList<String> canCnic = new ArrayList<>();
	static ArrayList<String> canSymbol = new ArrayList<>();
	static int candNum = 1;
	public void addCandidate()
	{		
		getInfo();
		canName.add(name);
		canFatName.add(fatherName);
		canCnic.add(cnic);
		candNum++;
	}
}
