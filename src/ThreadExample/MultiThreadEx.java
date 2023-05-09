package ThreadExample;

public class MultiThreadEx extends Thread {
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			System.out.println("hai");
			try {
				Thread.sleep(1000);
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
		m.setName("First");
		m.setPriority(MAX_PRIORITY);
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		MultiThreadDemo m1=new MultiThreadDemo();
		m1.start();
		m1.setName("Second");
		System.out.println(m1.getName());
		m1.setPriority(MIN_PRIORITY);
		System.out.println(m1.getPriority());

	}
}
