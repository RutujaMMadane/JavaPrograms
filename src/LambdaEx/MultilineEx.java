package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class MultilineEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(1,2,3,40);
		list.forEach((x)->
		{
			x=x+2;
			System.out.println(x);
		});


	}

}
