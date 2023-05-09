package Collection;

import java.util.TreeMap;
public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders map1=new Orders(11,23,54);
		Orders map2=new Orders(12,14,12);
		Orders map3=new Orders(14,41,21);
		TreeMap<Integer,Orders> map=new TreeMap<Integer,Orders>();
		
		map.put(map1.getOrderid(),map1);
		map.put(map2.getOrderid(),map2);
		map.put(map3.getOrderid(),map3);
				
	    System.out.println(map);
		
	}

}
