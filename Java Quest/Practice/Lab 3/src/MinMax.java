
public class MinMax {
	public static int min(int[] array,int len)
	{
	int mini = array[0];
	for(int i=0;i<len;i++)
		{
		if(mini>array[i])
			{
			mini = array[i];
			}
		}
	return mini;
	}
	public static int max(int[] array,int len)
	{
	int maxi = array[0];
	for(int i=0;i<len;i++)
		{
		if(maxi<array[i])
			{
			maxi = array[i];
			}
		}
	return maxi;
	}

}
