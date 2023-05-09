package ArraysExamples;

import java.util.*;
public class DiagonalArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)//0<2 1<2
		{
			for(int j=0;j<col;j++)//0<2 1<2 2<2=f
				                 //0<2 1<2
			{
				if(i==j)//0==0 0==1 1==0 1==1
				{
					System.out.print(a[i][j]);//1 s
					                          //s  7
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
