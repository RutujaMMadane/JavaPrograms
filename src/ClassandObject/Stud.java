package ClassandObject;

public class Stud {
	int id;
	String name;
	String address;
	int marks[];
	int total=0;
	double percentage()
	{
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		double percentage=total*100/500.0;
		return percentage;
		
	}

}
