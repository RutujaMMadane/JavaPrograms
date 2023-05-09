package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(121,"Abc","HIJ");
		Employee emp2=new Employee(122,"EFG","STU");
		Employee emp3=new Employee(123,"XYZ","PQR");
		FileOutputStream fout=new FileOutputStream("d:/input.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.writeObject(emp3);
		out.close();

	}

}
