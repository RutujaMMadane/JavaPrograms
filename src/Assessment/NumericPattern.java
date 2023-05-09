package Assessment;

import java.io.*; 
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
// Class name should be "Source",
// otherwise solution won't be accepted
public class NumericPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		// Declare the variable
		 int a;

		 // Read the variable from STDIN
		 a = in.nextInt();
		 for(a=1;a<=3;a++)
		 {
			 for(int j=3-a;j>0;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=a;j++)
			 {
				 System.out.print(a+" ");
			 }
			 System.out.println();
		 }
		 for(a=1;a<=2;a++)
		 {
			 for(int j=2-a;j>0;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=a;j++)
			 {
			     System.out.print(a+" ");
			 }
			 System.out.println();
		 }
		 for(a=1;a<=4;a++)
		 {
			 for(int j=4-a;j>0;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=a;j++)
			 {
				 System.out.print(a+" ");
			 }
			 System.out.println();				 
		 }

    }
 }