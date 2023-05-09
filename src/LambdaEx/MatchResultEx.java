package LambdaEx;

import java.util.Arrays;
import java.util.List;

public class MatchResultEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("Sansa","Jon","Arya");
		boolean matchedResult=names.stream().anyMatch((s)->s.startsWith("A"));
		System.out.println(matchedResult);
		 matchedResult=names.stream().allMatch((s)->s.startsWith("A"));
		 System.out.println(matchedResult);
		 matchedResult=names.stream().noneMatch((s)->s.startsWith("A"));
		 System.out.println(matchedResult);

	}

}
