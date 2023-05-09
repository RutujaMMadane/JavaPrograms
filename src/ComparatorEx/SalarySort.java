package ComparatorEx;
import java.util.Comparator;
public class SalarySort implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.geteId(),o2.getSalary());
	}

	
}
