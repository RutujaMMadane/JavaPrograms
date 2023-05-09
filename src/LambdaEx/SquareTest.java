package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class SquareTest {
	
	public static void main(String []args)
	{
		
		Square s=(x)->
		{
			
			System.out.println(x*x);
			return x;
		};
		s.calculate(6);
	}

}
