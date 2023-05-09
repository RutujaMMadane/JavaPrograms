package Overloading;

abstract class Language{
	//method of abstract class
	public void show()
	{
		System.out.println("This is Java Language");
	}
}
public class AbstractDemo extends Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't able to create instance of language because it is an abstract class 
		//create the object of main class
		AbstractDemo obj=new AbstractDemo();
		obj.show();

	}

}
