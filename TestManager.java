import static org.junit.Assert.*;

import org.junit.Test;

public class TestManager {

	@Test
	public void testSingleAdd() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add(aMovie);
		Movie movie1 = aManager.getHead().getMovie();

		assertEquals("title", movie1.getName());
		assertEquals("cast1", movie1.getCast1());
		assertEquals("cast2", movie1.getCast2());
		assertEquals("cast3", movie1.getCast3());
		assertEquals("genre", movie1.getGenre());
		assertEquals(5, movie1.getRating());
	}

	@Test
	public void testMultipleAdd() {
		Manager aManager = new Manager();
		
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		Movie aMovie2 = new Movie("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.add(aMovie);
		aManager.add(aMovie2);
		Movie movie1 = aManager.getHead().getMovie();
		Movie movie2 = aManager.getHead().getNext().getMovie();

		assertEquals("title", movie1.getName());
		assertEquals("cast1", movie1.getCast1());
		assertEquals("cast2", movie1.getCast2());
		assertEquals("cast3", movie1.getCast3());
		assertEquals("genre", movie1.getGenre());
		assertEquals(5, movie1.getRating());

		assertEquals("title2", movie2.getName());
		assertEquals("cast4", movie2.getCast1());
		assertEquals("cast5", movie2.getCast2());
		assertEquals("cast6", movie2.getCast3());
		assertEquals("genre2", movie2.getGenre());
		assertEquals(2, movie2.getRating());
	}

	@Test
	public void testErase() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		Movie aMovie2 = new Movie("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.add(aMovie);
		aManager.add(aMovie2);
		aManager.eraseList();

		assertEquals(null, aManager.getHead());
	}

	@Test
	public void testRemoveSingle() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add(aMovie);
		aManager.remove("title");

		assertEquals(null, aManager.getHead());
	}

	@Test
	public void testRemoveHeadForMultiple() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		Movie aMovie2 = new Movie("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.add(aMovie);
		aManager.add(aMovie2);
		aManager.remove("title");
		Movie movie2 = aManager.getHead().getMovie();
		
		assertEquals("title2", movie2.getName());
		assertEquals("cast4", movie2.getCast1());
		assertEquals("cast5", movie2.getCast2());
		assertEquals("cast6", movie2.getCast3());
		assertEquals("genre2", movie2.getGenre());
		assertEquals(2, movie2.getRating());
	}

	@Test
	public void testRemoveTailForMultiple() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		Movie aMovie2 = new Movie("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.add(aMovie);
		aManager.add(aMovie2);
		aManager.remove("title2");
		Movie movie1 = aManager.getHead().getMovie();

		assertEquals("title", movie1.getName());
		assertEquals("cast1", movie1.getCast1());
		assertEquals("cast2", movie1.getCast2());
		assertEquals("cast3", movie1.getCast3());
		assertEquals("genre", movie1.getGenre());
		assertEquals(5, movie1.getRating());

	}

	@Test
	public void testRemoveBodyForMultiple() {
		Manager aManager = new Manager();
		Movie aMovie = new Movie("title", "cast1", "cast2", "cast3", "genre", 5);
		Movie aMovie2 = new Movie("title2", "cast4", "cast5", "cast6", "genre2", 2);
		Movie aMovie3 = new Movie("title3", "cast7", "cast8", "cast9", "genre3", 3);
		aManager.add(aMovie);
		aManager.add(aMovie2);
		aManager.add(aMovie3);
		aManager.remove("title2");
		Movie movie1 = aManager.getHead().getMovie();
		Movie movie3 = aManager.getHead().getNext().getMovie();

		assertEquals("title", movie1.getName());
		assertEquals("cast1", movie1.getCast1());
		assertEquals("cast2", movie1.getCast2());
		assertEquals("cast3", movie1.getCast3());
		assertEquals("genre", movie1.getGenre());
		assertEquals(5, movie1.getRating());


		assertEquals("title3", movie3.getName());
		assertEquals("cast7", movie3.getCast1());
		assertEquals("cast8", movie3.getCast2());
		assertEquals("cast9", movie3.getCast3());
		assertEquals("genre3", movie3.getGenre());
		assertEquals(3, movie3.getRating());
	}


}
