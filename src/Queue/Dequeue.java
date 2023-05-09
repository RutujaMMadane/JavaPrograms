package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> obj=new ArrayDeque<String>();
		obj.add("Text1");
		obj.add("Text2");
		obj.add("Text3");
		obj.add("Text4");
		obj.pollLast();
		for(String str:obj) {
			System.out.println(str);
		}
		
	}

}
