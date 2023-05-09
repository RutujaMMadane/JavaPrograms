package Queue;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]A={21,44,32,65,54,33,76};
		Integer[]B= {32,2,82,44,3,11,54};
		
		Set<Integer> obj1=new HashSet<Integer>();
		obj1.addAll(Arrays.asList(A));
		Set<Integer> obj2=new HashSet<Integer>();
		obj2.addAll(Arrays.asList(B));
		
		Set<Integer> union_data=new HashSet<Integer>(obj1);
		union_data.addAll(obj2);
		System.out.println("union of obj1 and obj2:");
		System.out.println(union_data);
				
		Set<String> obj= new LinkedHashSet<String>();
		obj.add("Text1");
		obj.add("Text2");
		obj.add("Text3");
		obj.add("Text4");
		obj.add("Text5");
		System.out.println(obj);

	}

}
