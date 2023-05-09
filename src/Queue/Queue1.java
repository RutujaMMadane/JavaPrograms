package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.PriorityQueue;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> obj=new PriorityQueue<String>();
		obj.add("Text1");
		obj.add("Text2");
		obj.add("Text3");
		obj.add("Text4");
		obj.add("Text5");
		obj.add("Text6");
		System.out.println("head:"+obj.element());
		System.out.println("head:"+obj.peek());
		System.out.println(obj);
		System.out.println("Iterating the queue elements:");
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		obj.remove();
		obj.poll();
		System.out.println("After removing two elements:");
		Iterator itr1=obj.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}

}
