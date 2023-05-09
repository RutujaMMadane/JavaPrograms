package LambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("Sansa","Jon","Arya");
		List<String>sortName=names.stream().sorted()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		System.out.println(sortName);
	
		
		
	}

}
