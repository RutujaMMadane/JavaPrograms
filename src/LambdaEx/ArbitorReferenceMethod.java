package LambdaEx;

import java.util.Arrays;

public class ArbitorReferenceMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] stringArray= {"steve","Ricky","Aditya","Naga","Lucky","Jon"};
		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String s:stringArray)
		{
			System.out.println(s);
		}
		
	
	}

}
