package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("d:/studentnew.csv");
		fw.write("Id,Name,Address");
		fw.write("\n 12,Rutuja,Wathar");
		fw.write("\n 13,ABC,PUNE");
		fw.write("\n 14,XYZ,CDA");
		
		fw.close();
		

	}

}
