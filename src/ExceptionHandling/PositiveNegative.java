package ExceptionHandling;

public class PositiveNegative {
	
public static void value(int num) {

		
		if(num<0)
		{
			try {
				throw new Exception("negative number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("positive number");
		}

	
	}
	public static void main(String[] args) {
		value(19);
	}

}
