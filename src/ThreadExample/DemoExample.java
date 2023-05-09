package ThreadExample;

public class DemoExample implements Runnable {
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hai");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoExample d=new DemoExample();
		Thread t=new Thread(d);
		t.start();
	}

	
}
