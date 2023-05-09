package Collection;
import java.util.Map;
import java.util.TreeMap;

public class OrderSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderSort o1=new OrderSort(1004,23,99);
		OrderSort o2=new OrderSort(1002,25,299);
		OrderSort o3=new OrderSort(1001,22,199);
		
		TreeMap<Integer,OrderSort> map=new TreeMap<Integer,OrderSort>();
		map.put(o1.getOrderid(), o1);
		map.put(o2.getOrderid(), o2);
		map.put(o3.getOrderid(), o3);
		for(Map.Entry<Integer,OrderSort> m:map.entrySet());
		{
			System.out.println(map);
		}

	}

}
