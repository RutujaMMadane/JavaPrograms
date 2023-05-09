package Collection;

import java.util.TreeSet;

public class MovieSortMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSort m1=new MovieSort("RRR","S.S.Rajamouli",4,3.4f);
		MovieSort m2=new MovieSort("LionKing","Jon Favreau",3.5f,4.2f);
		MovieSort m3=new MovieSort("Bahubali","S.S.Rajamouli",4f,3.4f);
		MovieSort m4=new MovieSort("Avatar","James Cameron",3.3f,4.4f);
		TreeSet<MovieSort> set=new TreeSet<MovieSort>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		System.out.println(set);
		System.out.println("==============================");
	
		for(MovieSort m:set)
		{
			if(m.getRating()>4.0f && m.getDuration()>=4)
			{
				System.out.println(m.getMovieName());
			}
			
		}
	}
}