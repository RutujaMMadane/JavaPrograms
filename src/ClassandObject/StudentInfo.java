package ClassandObject;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.id=12;
		stud.name="Rutuja";
		stud.address="Wathar Nimbalkar";
		stud.s1=76;
		stud.s2=78;
		stud.s3=87;
		stud.s4=77;
		stud.s5=88;
		 System.out.println("Student id ="+stud.id);
		 System.out.println("Student name="+stud.name);
		 System.out.println("Student address ="+stud.address);
		 System.out.println("Student s1="+stud.s1);
		 System.out.println("Student s2="+stud.s2);
		 System.out.println("Student s3="+stud.s3);
		 System.out.println("Student s4="+stud.s4);
		 System.out.println("Student s5="+stud.s5);
		 System.out.println("Student total marks ="+stud.total());
		 System.out.println("Student percentage ="+stud.percentage());
	}

}
