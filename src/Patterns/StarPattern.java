package Patterns;

public class StarPattern {
	
	public static void main(String [] args)
	{
		int row;
		int col;
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>=i;j--)
			
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
