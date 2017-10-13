public class Movie
{
	public String movie_Name;
	public String cast1;
	public String cast2;
	public String cast3;
	public String movie_Genre;
	public int movie_Rating;
	
	public Movie(String aTitle, String cast1, String cast2, String cast3, String aGenre, int aRating)
	{
		movie_Name = aTitle;
		this.cast1 = cast1;
		this.cast2 = cast2;
		this.cast3 = cast3;
		movie_Genre = aGenre;
		movie_Rating = aRating;
	}

}
