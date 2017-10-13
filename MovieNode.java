public class MovieNode
{
	private String movie_Name;
	private String cast1;
	private String cast2;
	private String cast3;
	private String movie_Genre;
	private int movie_Rating;
	private MovieNode next;

	public MovieNode()
	{
		movie_Name = null;
		cast1 = null;
		cast2 = null;
		cast3 = null;
		movie_Genre = null;
		movie_Rating = -1;
		setNext(null);
	}

	public MovieNode(String aTitle, String cast1, String cast2, String cast3, String aGenre, int aRating, MovieNode nextNode)
	{
		movie_Name = aTitle;
		this.cast1 = cast1;
		this.cast2 = cast2;
		this.cast3 = cast3;
		movie_Genre = aGenre;
		movie_Rating = aRating;
		setNext(nextNode);
	}

	public String getName()
	{
		return movie_Name;
	}

	public void setName(String title) {
		movie_Name = title;
	}

	public String getCast1()
	{
		return cast1;
	}

	public void setCast1(String cast1) {
		this.cast1 = cast1;
	}

	public String getCast2()
	{
		return cast2;
	}

	public void setCast2(String cast2) {
		this.cast2 = cast2;
	}

	public String getCast3()
	{
		return cast3;
	}

	public void setCast3(String cast3) {
		this.cast3 = cast3;
	}

	public String getGenre()
	{
		return movie_Genre;
	}

	public void setGenre(String genre) {
		movie_Genre = genre;
	}

	public int getRating()
	{
		return movie_Rating;
	}

	public void setRating(int rating) {
		movie_Rating = rating;
	}

	public MovieNode getNext()
	{
		return(next);
	}

	public void setNext(MovieNode nextNode)
	{
		next = nextNode;
	}

	public String toString()
	{
		String s = "";
		if (movie_Name != null){
			s = s + "Movie Name: " + movie_Name + "\nCast Members: " + cast1 + "\n" + cast2 + "\n" +
			cast3 + "\nMovie Genre: " + movie_Genre + "\nMovie Rating: " + movie_Rating + "\n";
		}
		else
		{
			s = s + "Movie Name: No-Name" + "\nCast Members: None" + "\nNone" + "\nNone" +
			"\nMovie Genre: None" + "\nMovie Rating: No Rating" + "\n";
		}
		return s;
	}
}
