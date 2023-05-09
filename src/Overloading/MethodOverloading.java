package Overloading;

public class MethodOverloading {
	public void square()
	{
		System.out.println("No parameter method called");
	}
	public void square(int num)
	{
		int square=num*num;
		System.out.println("Method with integer argument:"+square);
	}
	public void square(double num)
	{
	   double square=num*num;
		System.out.println("Method with integer argument:"+square);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.square();
		obj.square(6);
		obj.square(4.5);

	}

}
