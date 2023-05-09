package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class MReferDemo {
	
	private static int var=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(var+1,var+2,var+3);
		list.forEach(System.out::println);


	}

}
