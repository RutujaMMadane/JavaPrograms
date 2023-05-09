package LambdaEx;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(78);
		list.add(88);
		list.add(76);
		list.add(47);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("==========================");
		list.forEach((n)->System.out.println(n));
	

	}

}
