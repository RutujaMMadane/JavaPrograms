package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("one.txt");
		int i;
		while((i=f.read())!=-1)
		{
			System.out.println((char)i);
		}

	}

}
