package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Employee e1=new Employee(1,"Gayathri","cba",23000);
		Employee e2=new Employee(2,"Ravi","cba",23445);
		Employee e3=new Employee(3,"Gayathri","cba",33000);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		

		System.out.println("======================================================");
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}

	}

}
