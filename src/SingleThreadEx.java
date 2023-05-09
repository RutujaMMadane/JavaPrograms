
public class SingleThreadEx extends Thread {
	public void run()
	{
		System.out.println("hai");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleThreadEx s=new SingleThreadEx();
		s.start();	

	}

}
