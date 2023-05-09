package DefaultConstructor;

public class Demo {
	int i=90;
	public Demo()  //default constructor
	{
		System.out.println(i);
	}
	public Demo(int i)  //parameter constructor
	{
		System.out.println(i);
	}
	public void display()
	{
		System.out.println(i);
	}

}
