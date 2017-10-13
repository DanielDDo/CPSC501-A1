public class MovieNode
{
	public Movie movie;
	private MovieNode next;

	public MovieNode()
	{
		movie = null;
		setNext(null);
	}

	public MovieNode(Movie movie, MovieNode nextNode)
	{
		this.movie = movie;
		setNext(nextNode);
	}

	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie m) {
		movie = m;
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
		if (movie.movie_Name!= null){
			s = s + "Movie Name: " + movie.movie_Name + "\nCast Members: " + movie.cast1 + "\n" + movie.cast2 + "\n" +
					movie.cast3 + "\nMovie Genre: " + movie.movie_Genre + "\nMovie Rating: " + movie.movie_Rating + "\n";
		}
		else
		{
			s = s + "Movie Name: No-Name" + "\nCast Members: None" + "\nNone" + "\nNone" +
			"\nMovie Genre: None" + "\nMovie Rating: No Rating" + "\n";
		}
		return s;
	}
}
