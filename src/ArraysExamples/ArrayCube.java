package ArraysExamples;

import java.util.*;
public class ArrayCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int cube=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			cube=cube+(a[i]*a[i]*a[i]);
		}
		System.out.println("The sum ="+cube);


	}

}
