package Assessment;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int row;
		int col;
		for(row=1;row<=a;row++)
		{
			for(col=a-row;col>=row;col--)
			{
			System.out.print(" ");
			}
			for(col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}	
		for(row=1;row<=b;row++)
		{
			for(col=b-row;col>=row;col--)
			
			{
				System.out.print(" ");
			}
			for(col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}	
		for(row=1;row<=c;row++)
		{
			for(col=c-row;col>=row;col--)
			
			{
				System.out.print(" ");
			}
			for(col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}	
	}
	

}
