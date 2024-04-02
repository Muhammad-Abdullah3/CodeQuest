import java.util.Scanner;
public class MinMaxClassMain {
public static void main(String[] args)
	{
	Scanner inp =  new Scanner(System.in);
	System.out.println("Enter the length of the array: ");
	
	int len = inp.nextInt();
	int[] arr=new int[len];
	System.out.println("Enter "+ len +" numbers.");
	for(int i=0;i<len;i++)
	{
	 arr[i] = inp.nextInt();
	}
	int maxi = MinMax.max(arr,len);
	int mini = MinMax.min(arr,len);
	System.out.println("Maximum number in the given array = "+maxi);
	System.out.println("Minimum number in the given array = "+mini);
	inp.close();
	}
}
