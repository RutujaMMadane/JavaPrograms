package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>intSeq=Arrays.asList(1,2,3);
		
		java.util.function.Consumer<? super Integer>cnsmr=x->
		System.out.println(x);
		intSeq.forEach(cnsmr);
	}

}
