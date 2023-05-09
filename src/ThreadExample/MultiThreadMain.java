package ThreadExample;

public class MultiThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		First f=new First(t);
		Second s=new Second(t);
		f.start();
		f.setName("first");
		System.out.println(f.getName());
		s.start();
		s.setName("second");
		System.out.println(s.getName());

	}

}
