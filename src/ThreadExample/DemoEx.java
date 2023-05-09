package ThreadExample;

public class DemoEx implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("Hai");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEx d=new DemoEx();
		Thread t=new Thread(d);
		t.start();

	}

}
