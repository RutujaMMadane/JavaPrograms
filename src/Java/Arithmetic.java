package Java;

import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 and number 2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;
		System.out.println("Addition="+add);
		System.out.println("Multiplication="+mul);
		System.out.println("Division="+div);
		System.out.println("Modulo="+mod);
 
	}

}
