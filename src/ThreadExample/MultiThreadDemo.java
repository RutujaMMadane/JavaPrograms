package ThreadExample;

public class MultiThreadDemo extends Thread {
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			System.out.println("hai");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadDemo m=new MultiThreadDemo();
		m.start();
		MultiThreadDemo m1=new MultiThreadDemo();
		m1.start();

	}
}
