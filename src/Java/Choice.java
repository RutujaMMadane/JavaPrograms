package Java;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  alphabet");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'A':System.out.println("apple");
			break;
			case 'B':System.out.println("ball");
			break;
			default:System.out.println("no match choice");
		}
			
	}

}
