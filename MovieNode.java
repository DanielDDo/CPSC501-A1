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
		return movie.toString();
	}
}
