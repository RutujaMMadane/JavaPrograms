package LambdaEx;

import java.util.Random;
import java.util.stream.Stream;

public class StreamRandomEx {
	public static void main(String[] args)
	{
		Stream<Integer>stream2=Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		
		stream2.forEach(p->System.out.println(p));
		Stream<Integer>randomNumbers=Stream.generate(()->(new Random()).nextInt(100));
		
		randomNumbers.limit(20).forEach(n->System.out.println(n));
	}

}
