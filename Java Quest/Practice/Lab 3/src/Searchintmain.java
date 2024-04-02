import java.util.Scanner;
public class Searchintmain {
	public static void main(String[] args)
	{
		//Creating a Scanner object
		Scanner inp = new Scanner(System.in);
		int[] arr = {23,5,12,53,22,88,1,9,65};
		System.out.println("Enter the number you want to search.");
		int number = inp.nextInt();
		if(Search.searNum(number,arr))
		{
			System.out.println("Number is found");
		}
		else
		{
			System.out.println("Number is not found.");
		}
		inp.close();
	}

}
