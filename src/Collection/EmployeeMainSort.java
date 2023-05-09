package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMainSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSort e1=new EmployeeSort(1,"Gayathri","cba",63000);
		EmployeeSort e2=new EmployeeSort(2,"Ravi","cba",73445);
		EmployeeSort e3=new EmployeeSort(3,"Radhai","Pune",33000);
		ArrayList<EmployeeSort> list=new ArrayList<EmployeeSort>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		salaryCalculation(list);
		System.out.println("=============================================================");
		for(EmployeeSort e:list)
		{
			System.out.println(e);
		}
		System.out.println("============================    Sorting     =================");
		Collections.sort(list);
		for(EmployeeSort e:list)
		{
			System.out.println(e);
		}
			
	}
	public static void salaryCalculation(List<EmployeeSort>list)
	{
		for(EmployeeSort e:list)
		{
			if(e.getSalary()>50000)
			{
				System.out.println(e.geteName());
			}
		}
	}
	
}
