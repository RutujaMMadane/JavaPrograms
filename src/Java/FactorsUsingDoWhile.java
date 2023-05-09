package Java;

import java.util.*;
public class FactorsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int start=1;
		do
		{
			if(num%start==0)
			{
				System.out.println(start);
			}
			start++;
		}
		while(start<=num);

	}

}
