package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(14);
		list.add(13);
		list.add(22);
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.set(1, 19));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		
		System.out.println("======================================================");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}


	}

}
