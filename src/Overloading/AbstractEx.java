package Overloading;
abstract class Birds
{
	//abstract
	abstract void makeSound();
	public void fly()
	{
		System.out.println("I can fly");
	}
}
class Parrot extends Birds
{
	public void makeSound()
	{
		System.out.println("Parrot sound....");
	}
}
class Pigeon extends Birds
{
	public void makeSound()
	{
		System.out.println("Pigeon sound....");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Parrot();
		Parrot p=new Parrot();
		Pigeon pg=new Pigeon();
		p.makeSound();
		p.fly();
		pg.makeSound();
		pg.fly();
	}

}
