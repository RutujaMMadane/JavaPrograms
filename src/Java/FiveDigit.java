package Java;

import java.util.Scanner;
public class FiveDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int num=sc.nextInt();
		if(num>=10000 &&num<=99999)
		{
			System.out.println("five digit number");
		}
		else
		{
			System.out.println("it is not a five digit number");
		
			
		}
	}

}
