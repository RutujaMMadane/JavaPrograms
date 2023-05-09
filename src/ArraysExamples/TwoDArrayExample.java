package ArraysExamples;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		a[0][0]=12;
		a[0][1]=13;
		a[1][0]=14;
		a[1][1]=15;
		for(int i=0;i<2;i++)//0<2 1<2
		{
			for(int j=0;j<2;j++)//0<2 1<2 2<2=f
				                //0<2
			{
				System.out.print(a[i][j]+" ");//a[0][0]=12 a[0][1]=13
				                          // a[1][0]=14 a[1][1]=15
			}
			System.out.println();
		}

	}

}
