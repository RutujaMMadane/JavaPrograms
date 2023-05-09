package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class DemoFinalExample {
	
	private static int var=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=Arrays.asList(1,2,3);
		list.forEach(n->System.out.println(n+var));

	}

}


