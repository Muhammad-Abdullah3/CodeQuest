import java.util.ArrayList;
class Voter extends Person
{
	static ArrayList<String> votName = new ArrayList<>();
	static ArrayList<String> votFatName = new ArrayList<>();
	static ArrayList<String> votCnic = new ArrayList<>();
	static ArrayList<String> votGender = new ArrayList<>();
	static ArrayList<Integer> votId = new ArrayList<>();
	static ArrayList<Boolean> checkVote = new ArrayList<>();
	static int voterNum = 1;
	public void addVoter()
	{
		getInfo();
		votName.add(name);
		votFatName.add(fatherName);
		votCnic.add(cnic);
		votGender.add(gender);
		votId.add((voterNum+1000));
		voterNum++;
	}
}
