package ExceptionHandling;

public class StudentMain {

	public static void main(String[] args) throws StudentInvalidException{
		// TODO Auto-generated method stub
		Student s[]=new Student[3];
		int i;
		for(i=0;i<s.length;i++)
		{
			s[0]=new Student(1001," ABC","CBA");
			s[1]=new Student(12," PQR","CBA");
			s[2]=new Student(13," XYZ","CBA");
		}
		for(Student s1:s)
		{
			System.out.println(s1);
		}
		getName(s);

	}
	public static void getName(Student s[]) throws StudentInvalidException
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getId()==1001)
			{
				System.out.println(s[i].getName());
				
			}
			else
			{
				throw new StudentInvalidException("invalid student id");
			}
		}
	}

}
