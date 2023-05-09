package FileHandling;
import java.io.File;
import java.io.IOException;
public class FileCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:/B1.txt");
		if(f.createNewFile())
		{
			System.out.println("File is successfully Created");
			
		}
		else
		{
			System.out.println("Already created");
		}
		
		
		
		

	}

}
