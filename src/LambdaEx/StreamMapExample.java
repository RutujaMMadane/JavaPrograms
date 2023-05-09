package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=Arrays.asList("Sansa","Jon","Arya");
		names.stream().filter((s)->s.startsWith("J"))
		.map(String::toUpperCase)
		.forEach(n->System.out.println(n));

	}

}
