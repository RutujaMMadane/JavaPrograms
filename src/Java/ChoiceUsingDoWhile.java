package Java;

import java.util.*;
public class ChoiceUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		do
		{
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Large");
			break;
			case 2:
				System.out.println("medium");
			break;
			case 3:
				System.out.println("small");
			break;
			default:
				System.out.println("Invalid Input");
			break;
		}
		System.out.println("do u want to continue");
		s=sc.next();
		}
		while(s.equals("yes"));
	}
}

