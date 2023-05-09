package ArraysExamples;

import java.util.*;
public class ArrayRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();//3
		int a[]=new int[size];//3
		for(int i=0;i<size;i++)//0<3 1<3 2<3
		{
			 a[i]=sc.nextInt();
			 //a[0]=12,a[1]=14 a[2]=15
		}
		for(int j=0;j<size;j++)
		{
			System.out.println(a[j]);
		}

	}

}
