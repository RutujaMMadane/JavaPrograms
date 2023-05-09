package LambdaEx;

public class TestDemo implements TestInterface {

	@Override
	public int square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo t=new TestDemo();
		t.display();
		System.out.println(t.square(2));
		
		

	}

}
