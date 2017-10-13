public class Movie
{
	private String movie_Name;
	private String cast1;
	private String cast2;
	private String cast3;
	private String movie_Genre;
	private int movie_Rating;
	
	public Movie(String aTitle, String cast1, String cast2, String cast3, String aGenre, int aRating)
	{
		movie_Name = aTitle;
		this.cast1 = cast1;
		this.cast2 = cast2;
		this.cast3 = cast3;
		movie_Genre = aGenre;
		movie_Rating = aRating;
	}
	
	public String getName() {
		return movie_Name;
	}
	
	public void setName(String title) {
		movie_Name = title;
	}
	
	public String getCast1() {
		return cast1;
	}
	
	public void setCast1(String castName) {
		cast1 = castName;
	}
	
	public String getCast2() {
		return cast2;
	}
	
	public void setCast2(String castName) {
		cast2 = castName;
	}
	public String getCast3() {
		return cast3;
	}
	
	public void setCast3(String castName) {
		cast3 = castName;
	}
	
	public String getGenre() {
		return movie_Genre;
	}
	
	public void setGenre(String genre) {
		movie_Genre = genre;
	}
	
	public int getRating() {
		return movie_Rating;
	}
	
	public void setRating(int rating) {
		movie_Rating = rating;
	}

}
