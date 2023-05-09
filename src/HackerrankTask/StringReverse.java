package HackerrankTask;
import java.util.*;

public class StringReverse {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println("Enter String");
        StringBuffer b=new StringBuffer(A);
        b.reverse();
        String data=b.toString();
        if(A.equals(data))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



