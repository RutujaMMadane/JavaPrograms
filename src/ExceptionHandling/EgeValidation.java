package ExceptionHandling;

public class EgeValidation {

	public static void validate(int age) {
		
		if(age<18)
		{
			try {
				throw new Exception("invalid age");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("welcome to vote");
		}

	}
	public static void main(String[] args) {
		validate(19);
	}

}
