package ClassandObject;

public class Student {
	int id;
	String name;
	String address;
	int s1,s2,s3,s4,s5;
	double total;
	public int[] mark;
	double total()
	{
		total=(s1+s2+s3+s4+s5);
		return total;
	}
	double percentage()
	{
       double percentage=(total/5);
		return percentage;
	}

}
