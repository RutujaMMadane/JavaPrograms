package ForLoop;

import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=0;
		for(int start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				fact++;
			}
		}
		if(fact==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}

	}

}
