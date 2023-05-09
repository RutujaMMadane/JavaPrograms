package LambdaEx;

public class MethodReferenceEx {
	
	public void saySomething() {
		
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceEx obj=new MethodReferenceEx();
		Sayable sayable=obj::saySomething;
		sayable.say();

	}

}
