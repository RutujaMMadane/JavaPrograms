package Overloading;

class Human
	{
		public void walk()
		{
			System.out.println("Human can walk!");
		}
}
class Girls extends Human
	{
	//overiding parent method
		public void walk()

		{
			super.walk();
			System.out.println("Girls can also walk!");
		}
}
public class OverridingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girls obj1=new Girls();
		obj1.walk();
		Human obj=new Human();
		obj.walk();
	}

}
