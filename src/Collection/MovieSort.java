package Collection;

public class MovieSort implements Comparable<MovieSort> {
	private String movieName;
	private String directorName;
	private float duration;
	private float rating;
	public MovieSort()
	{
		
	}
	public MovieSort(String movieName, String directorName, float duration, float rating) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.duration = duration;
		this.rating = rating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", directorName=" + directorName + ", duration=" + duration
				+ ", rating=" + rating + "]";
	}
	public int compareTo(MovieSort m) {
		// TODO Auto-generated method stub
		return movieName.compareTo(m.getMovieName());
	}
	

}



