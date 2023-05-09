package Java;

import java.util.Scanner;
public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value=");
		   int num=sc.nextInt();
		   int start=1;
		   while(start<=num)
		   {
			   System.out.println(start);
			   start++;
		   }
	}

}
