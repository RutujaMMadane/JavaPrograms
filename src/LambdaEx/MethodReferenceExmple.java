package LambdaEx;


public class MethodReferenceExmple {

   public  MethodReferenceExmple() {

		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		
		Sayable sayable=MethodReferenceExmple::new;
		sayable.say();

	}

}
