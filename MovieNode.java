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
		if (movie.getName() != null){
			s = s + "Movie Name: " + movie.getName() + "\nCast Members: " + movie.getCast1() + "\n" + movie.getCast2() + "\n" +
					movie.getCast3() + "\nMovie Genre: " + movie.getGenre() + "\nMovie Rating: " + movie.getRating() + "\n";
		}
		else
		{
			s = s + "Movie Name: No-Name" + "\nCast Members: None" + "\nNone" + "\nNone" +
			"\nMovie Genre: None" + "\nMovie Rating: No Rating" + "\n";
		}
		return s;
	}
}
