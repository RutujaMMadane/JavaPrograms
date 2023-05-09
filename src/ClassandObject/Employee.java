package ClassandObject;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp=new Emp();
		emp.id=11;
		emp.name="Rutuja";
		emp.salary=12345;
		 System.out.println("Employee Id is="+emp.id);
		 System.out.println("Employee name is="+emp.name);
		 System.out.println("Employee salary is="+emp.salary);
		 System.out.println("Annual Salary="+emp.annualSalary());
		 System.out.println("Employee pf is="+emp.pf());


	}

}
