import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Input Two Strings: ");
		String str1 = inp.nextLine();
		String str2 = inp.nextLine();
		// Using + operator
		String result = str1+str2;
		System.out.println("Concatenated String :"+result);
		// Using Set Builder
		StringBuilder str3 = new StringBuilder();
		str3.append("My name ");
		str3.append("is");
		str3.append(" Muhammad");
		str3.append(" Abdullah");
		System.out.println("Concatenated using Set Builder: "+str3.toString());
		inp.close();
	}

}
