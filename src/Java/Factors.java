package Java;

import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any number to Find Factors: ");
		
		int Number = sc.nextInt();
		int i = 1;
		do {
			if(Number%i == 0) {
				System.out.println(i+ "");
			}
			i++;
		} while(i <= Number);
	}

}
