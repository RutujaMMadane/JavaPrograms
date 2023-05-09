package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortNameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				EmployeeSortName e1=new EmployeeSortName(1,"Gayathri","cba",63000);
				EmployeeSortName e2=new EmployeeSortName(2,"Ravi","cba",73445);
				EmployeeSortName e3=new EmployeeSortName(3,"Radhai","Pune",33000);
				ArrayList<EmployeeSortName> list=new ArrayList<EmployeeSortName>();
				list.add(e1);
				list.add(e2);
				list.add(e3);
				System.out.println(list);
				salaryCalculation(list);
				System.out.println("===================================================");
				for(EmployeeSortName e:list)
				{
					System.out.println(e);
				}
				System.out.println("=====================================      Sorting");
				Collections.sort(list);
				for(EmployeeSortName e:list)
				{
					System.out.println(e);
				}
					
			}
			public static void salaryCalculation(List<EmployeeSortName>list)
			{
				for(EmployeeSortName e:list)
				{
					if(e.getSalary()>50000)
					{
						System.out.println(e.geteName());
					}
			    }
	        }

}
