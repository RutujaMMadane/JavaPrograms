package Java;

import java.util.Scanner;

public class NaturalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int j=1;
		int k=1;
		int sum=0;
		while(k<=i)
		{
			sum=sum+k;
			k++;
		}
		System.out.println("The Sum is "+sum);
	}

}
