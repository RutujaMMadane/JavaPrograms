package LambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=Arrays.asList("Java","C++","j2ee","DataScience","python");
		Optional<String>longestString=words.stream()
				.reduce((word1,word2)
						->word1.length() > word2.length()
						?word1:word2);
		
		longestString.ifPresent(n->System.out.println(n));

	}

}
