package Overloading;

public class OverloadingTask {
	public void add(int a,int b)
	{
		int e=a+b; 
		System.out.println("Addition of two numbers:"+e);
	}
	public void add(int a,int b,int c)
	{
		int f=a+b+c; 
		System.out.println("Addition of three numbers:"+f);
	}
	public void add(int a,int b,int c,int d)
	{
		int g=a+b+c+d; 
		System.out.println("Addition of four numbers:"+g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTask obj=new OverloadingTask();
		obj.add(11, 22);
		obj.add(11, 22, 33);
		obj.add(11, 22, 33, 44);

	}

}
