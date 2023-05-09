package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class MultilineLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(1,2,3,40);
		list.forEach((x)->
		{
			int y=x+2;
			System.out.println(y);
		});

	}

}
