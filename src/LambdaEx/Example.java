package LambdaEx;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=new ArrayList<String>();
		names.add("Amit");
		names.add("Negon");
		names.add("Aditya");
		names.add("Steve");
		int count=0;
		for(String str:names)
		{
			if(str.length() < 6) 
				count++;
		}
		long count1=names.stream().filter(str->str.length() < 6).count();
		System.out.println("There are "+count+" Strings with length less than 6");
		System.out.println("There are "+count1+" Strings with length less than 6");
				

	}

	
}
