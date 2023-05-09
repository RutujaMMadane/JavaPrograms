package Java;

import java.util.*;
public class DemoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  month");
		int month=sc.nextInt();
		switch(month)
		{
			case 1:System.out.println("jan");
			break;
			case 2:System.out.println("feb");
			break;
			case 3:System.out.println("mar");
			break;
			case 4:System.out.println("apr");
			break;
			case 5:System.out.println("may");
			break;
			case 6:System.out.println("june");
			break;
			default:System.out.println("no match choice");
			
		}
	}

}
