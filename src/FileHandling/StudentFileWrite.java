package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileWrite {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("d:/StudentDemo.csv");
		fw.write("ID,name,sub1,sub2,sub3,sub4,sub5");
		fw.write("\n 12,Rutuja,45,73,87,98,56");
		fw.write("\n 13,ABC,43,56,87,77,89");
		fw.write("\n 14,XYZ,65,87,89,87,67");
		fw.write("\n 15,KLM,43,56,87,77,89");
		fw.write("\n 16,PQR,65,87,89,87,67");

		fw.close();
		

	}

}



