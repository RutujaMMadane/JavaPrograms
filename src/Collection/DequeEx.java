package Collection;
import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue=new LinkedList<Integer>();
		queue.add(13);
		queue.add(90);
		queue.add(78);
		System.out.println(queue);
		queue.addFirst(12);
		queue.addLast(88);
		System.out.println(queue);
		queue.removeFirst();
		queue.removeLast();
		System.out.println(queue);

	}

	

}
