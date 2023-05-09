package LambdaEx;

public class AdditionMain {

	public static void main(String[] args) {
		
		Addition a=(x,y)->(x+y);
		System.out.println(a.add(6,7));

	}

}
