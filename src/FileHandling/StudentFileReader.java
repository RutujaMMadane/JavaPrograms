package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileReader {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader f=new FileReader("d:/StudentDemo.csv");
		String id,name,sub1,sub2,sub3,sub4,sub5;
		BufferedReader br=new BufferedReader(f);

		String col=br.readLine();
		String row=br.readLine();
		System.out.println(col);
		while(row!=null)
		{
			String []s=row.split(",");
			id=s[0];
			name=s[1];
			sub1=s[2];
			sub2=s[3];
			sub3=s[4];
			sub4=s[5];
			sub5=s[6];
			System.out.println(id+name+sub1+sub2+sub3+sub4+sub5);
			row=br.readLine();
		}

	}

}
