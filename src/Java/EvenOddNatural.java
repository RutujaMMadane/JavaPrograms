package Java;

import java.util.Scanner;

public class EvenOddNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int k=1;
		int sum=0;
		while(k<=i)
		{
			if(k%2==0) {
				   System.out.println("The number is even "+k); 
			}
			   else {
				   System.out.println("The number is odd "+k); 
			   }
			k++;
		}
	}

}
