package assignment;
class fir{
	int num = 34;
	public void sq(int n)
	{
		int squar = num*num;
		System.out.println(squar);
	}
}

public class Instantiatio {
	public static void main(String[] args)
	{
	// Creating an object
	fir obj = new fir();// Instant created using new keyword
	obj.sq(3);
	}
}
