package LambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>alphabets=Arrays.asList("A","B","C");
		List<String>names=Arrays.asList("Sansa","John","Arya");
		Stream<String>opstream=Stream.concat(alphabets.stream(),names.stream());
		opstream.forEach(str->System.out.println(str+" "));

	}

}
