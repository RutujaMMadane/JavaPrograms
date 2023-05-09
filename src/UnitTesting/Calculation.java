package UnitTesting;

public class Calculation {
	
	public static int maxNum(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				arr[i]=max;
			}
		}
		return max;
	}

}
