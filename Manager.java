import java.util.Scanner;

public class Manager
{
	private static final int MATCH = 0;
	private String LIST_HEADER = "DISPLAYING LIST";
	private String SEPARATE = "*********************";

	private MovieNode head;
	private Scanner in;

	public Manager() {
		head = null;
	}

	public void add(String title, String cast1, String cast2, String cast3, String genre, int rating, boolean isShow) {
		MovieNode newNode = new MovieNode(title, cast1, cast2, cast3, genre, rating, isShow, null);

		if (head == null) {
			head = newNode;
		}
		else {
			MovieNode current = head;
			MovieNode previous = null;

			while (current != null) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(newNode);
		}
	}

	public void display()
	{
		in = new Scanner(System.in);
		int count = 1;
		MovieNode temp = head;
		System.out.println(LIST_HEADER);
		for (int i = 0; i < LIST_HEADER.length(); i++);
		{
			System.out.println("---------------------");
		}
		System.out.println();
		if (temp == null)
		{
			System.out.println("The List is empty: nothing to display");
		}
		while (temp != null)
		{
			System.out.println("#" + count + ": " + temp);
			temp = temp.getNext();
			count++;
			System.out.println(SEPARATE);
			in.nextLine();
		}
		System.out.println();
	}

	public void eraseList()
	{
		head = null;
	}

	public void remove(String searchName)
	{
		if (head == null)
		{
			System.out.println("List is empty: nothing to remove");
		}
		else
		{
			removeNonEmpty(searchName);
		}
	}

	private void removeNonEmpty(String aSearchName)
	{
		MovieNode previous = null;
		MovieNode current = head;
		boolean isFound = false;
		String currentName;

		while ((current != null) && (isFound == false))
		{
			currentName = current.getName();
			if (aSearchName.compareToIgnoreCase(currentName) == MATCH)
			{
				isFound = true;
			}
			else
			{
				previous = current;
				current = current.getNext();
			}
		}

		if (isFound == true)
		{
			System.out.println("Removing the movie called: " + aSearchName);
			if (previous == null)
			{
				head = head.getNext();
			}
			else
			{
				previous.setNext(current.getNext());
			}
		}
		else
		{
			System.out.println("No movie called " + aSearchName + " was found");
		}
	}

	public void searchList(String searchName)
	{
		MovieNode current = head;
		boolean isFound = false;
		String currentName;
		int count = 0;

		while ((current != null)&&(isFound == false))
		{
			currentName = current.getName();
			if (searchName.compareToIgnoreCase(currentName) == MATCH)
			{
				isFound = true;
			}
			else
			{
				current = current.getNext();
				count++;
			}
		}

		if (isFound == true)
		{
			System.out.println("#" + count + " " + current);
		}
		else
		{
			System.out.println("No movie called " + searchName + " was found");
		}
	}

	public MovieNode getHead() {
		return head;
	}
}
