package Collection;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
				
		Vector<Integer> v=new Vector<Integer>();
		v.add(13);
		v.add(45);
		v.add(12);
		v.add(90);
		System.out.println(v);
		System.out.println(v.get(0));
		v.add(2,34);
		System.out.println(v);
		v.set(3,20);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);

	}

}
