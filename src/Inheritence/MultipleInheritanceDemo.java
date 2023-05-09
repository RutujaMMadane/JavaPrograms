package Inheritence;


public class MultipleInheritanceDemo implements Readable,Writable{
	public void read()
	{
		System.out.println("Student can Read");
	}
	public void writes()
	{
		System.out.println("Student can writes");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceDemo s=new MultipleInheritanceDemo();
		s.read();
		s.writes();

	}
	public void write() {
		// TODO Auto-generated method stub
		
	}

}
