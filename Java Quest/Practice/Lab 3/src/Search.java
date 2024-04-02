
public class Search {
	public static boolean searNum(int num, int[] ar)
	{
		int len = ar.length;
		for(int i=0;i<len;i++)
		{
			if(num==ar[i])
			{
				return true;
			}
		}
		return false;
	}

}
