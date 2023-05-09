package ArraysExamples;

public class DeepCopyTDEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,1},{2,2}};
		int b[][]=new int[2][2];
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[i][j];
			}
		}
		a[0][0]++;
		System.out.println("b data");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		System.out.println("a data");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
