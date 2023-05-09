package ThreadExample;

public class MultiThreadJoin extends Thread {
	
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
		MultiThreadJoin m=new MultiThreadJoin();
		m.start();
		m.setName("First");
		m.setPriority(MAX_PRIORITY);
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		try {
			m.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		MultiThreadJoin m1=new MultiThreadJoin();
		m1.start();
		m1.setName("Second");
		System.out.println(m1.getName());
		m1.setPriority(MIN_PRIORITY);
		System.out.println(m1.getPriority());
	}	

}
