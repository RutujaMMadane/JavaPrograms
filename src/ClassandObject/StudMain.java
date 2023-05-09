package ClassandObject;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int m1[]= {78,90,87,78,98};
		Stud s=new Stud();
		s.id=1123;
		s.name="Rutuja";
		s.address="Phaltan";
		
		System.out.println("Student id="+s.id);
		System.out.println("Student name="+s.name);
		System.out.println("Student address="+s.address);
		s.marks=m1;
		double percentage= s.percentage();
		System.out.println("Student Percentage"+percentage);

	}

}
