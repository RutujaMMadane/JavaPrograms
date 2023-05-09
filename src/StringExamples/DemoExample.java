package StringExamples;
import java.lang.String;
public class DemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hii";//literal type
		String s1="hello";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		if(s==s1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
