package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("one.txt");
		String s="HelloWorld";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Created");

	}

}
