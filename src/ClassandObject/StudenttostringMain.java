package ClassandObject;

public class StudenttostringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[]= {78,90,78,67,88};
		Student s1=new Student();
		s1.id=1001;
		s1.name="Rutuja";
		s1.address="Phaltan";
		s1.mark=m1;
		System.out.println(s1);
		System.out.println("===========================");
		
		int m2[]= {67,90,78,67,98};
		Student s2=new Student();
		s2.id=1002;
		s2.name="sakshi";
		s2.address="Phaltan";
		s2.mark=m2;
		System.out.println(s2);

	}

}
