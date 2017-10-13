import static org.junit.Assert.*;

import org.junit.Test;

public class TestManager {

	@Test
	public void testSingleAdd() {
		Manager aManager = new Manager();
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		MovieNode movie1 = aManager.getHead();

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
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add("title2", "cast4", "cast5", "cast6", "genre2", 2);
		MovieNode movie1 = aManager.getHead();
		MovieNode movie2 = aManager.getHead().getNext();

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
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.eraseList();

		assertEquals(null, aManager.getHead());
	}

	@Test
	public void testRemoveSingle() {
		Manager aManager = new Manager();
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.remove("title");

		assertEquals(null, aManager.getHead());
	}

	@Test
	public void testRemoveHeadForMultiple() {
		Manager aManager = new Manager();
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.remove("title");
		MovieNode movie2 = aManager.getHead();
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
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.remove("title2");
		MovieNode movie1 = aManager.getHead();

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
		aManager.add("title", "cast1", "cast2", "cast3", "genre", 5);
		aManager.add("title2", "cast4", "cast5", "cast6", "genre2", 2);
		aManager.add("title3", "cast7", "cast8", "cast9", "genre3", 3);
		aManager.remove("title2");
		MovieNode movie1 = aManager.getHead();
		MovieNode movie3 = aManager.getHead().getNext();

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
