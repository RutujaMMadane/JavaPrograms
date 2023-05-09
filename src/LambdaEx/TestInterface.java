package LambdaEx;

public interface TestInterface {
	
	public int square(int n);
	default void display()
	{
		System.out.println("Showing Data");
	}

}
