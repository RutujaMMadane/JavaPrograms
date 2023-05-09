package ThreadExample;

public class ThreadTask  implements Runnable {
	Thread Cooking;
	private String IoT;
	ThreadTask(String name) {
	 IoT = name;

	}
	public void run() {
	 System.out.println("Thread running" + IoT);
	 for (int i = 0; i < 4; i++) 
	 {
	   System.out.println(i);
	   System.out.println(IoT);
	   try {
	      Thread.sleep(1000);
	   } 
	   catch (InterruptedException e) {
		  System.out.println("Thread is interrupted");
	   }
	 }
	}
	public void start() {
	 System.out.println("Thread started");
	 if (Cooking == null) 
	 {
	     Cooking = new Thread(this, IoT);
	     Cooking.start();
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTask d = new ThreadTask("Thread1");
		Thread t=new Thread(d);
		t.start();
		ThreadTask d1 = new ThreadTask("Thread2");
		Thread t2=new Thread(d1);
		t2.start();
		

	}

}
