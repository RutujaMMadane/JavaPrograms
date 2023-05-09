package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os=new FileOutputStream("Output.txt");
			os.write(70);
			os.write(65);
			os.write(78);
			os.close();
			System.out.println("Successfully created and written the file");
			
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}

	}

}
