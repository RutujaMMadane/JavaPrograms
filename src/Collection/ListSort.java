package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(17);
		list.add(13);
		list.add(18);
		list.add(15);
		list.add(16);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		


	}

}
