package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(5, "Five");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(4, "Four");
		
		System.out.println(map);

	}

}
