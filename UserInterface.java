import java.util.Scanner;

public class UserInterface
{
	public final int FIRST = 0;

	private boolean done;
	private boolean repeat;
	private Scanner in;

	private Manager aManager;

	public UserInterface()
	{
		done = false;
		in = new Scanner(System.in);
		aManager = new Manager();
	}

	public void tutorial()
	{
		System.out.println("TUTORIAL");
		System.out.println("This program is used to keep track of your movie collection");
		System.out.println("The program will keep track of:\n\t - The title of the movie\n\t - 3 cast members who appeared in the movie\n\t - The genre of the movie\n\t - The rating you gave the movie");
		System.out.println("The genre can only be set to 1 of 6 different movie genres: action, drama, science fiction, comedy, horror, martial arts or other");
		System.out.println("The rating is based off of a 5 star system, 5 being the best, and 1 being the worst");
	}
	public void displayMenu()
	{
		System.out.println("MENU");
		System.out.println("(A)dd a movie to the collection");
		System.out.println("(D)isplay the collection");
		System.out.println("(S)earch the collection for a movie");
		System.out.println("(R)emove a movie from the collection");
		System.out.println("(Q)uit the program");
		System.out.println("Enter an option: ");
	}

	public void addMovie()
	{
		String aTitle = null;
		String c1 = null;
		String c2 = null;
		String c3 = null;
		String aGenre = null;
		int aRating = -1;
		System.out.print("Enter the name of the movie: ");
		aTitle = in.nextLine();
		System.out.print("\nEnter the name of a cast member: ");
		c1 = in.nextLine();
		System.out.print("\nEnter the name of another cast member: ");
		c2 = in.nextLine();
		System.out.print("\nEnter the name of another cast member: ");
		c3 = in.nextLine();
		System.out.print("\nEnter the genre of the movie: ");
		aGenre = in.nextLine();
		System.out.print("\nEnter your rating for the movie: ");
		aRating = in.nextInt();
		in.nextLine();

		Movie movie = new Movie(aTitle,c1,c2,c3,aGenre,aRating);
		aManager.add(movie);
	}

	public void displayCollection()
	{
		aManager.display();
	}

	public void searchCollection()
	{
		String searchTitle = null;
		System.out.print("Enter the name of the movie you would like to search for: ");
		searchTitle = in.nextLine();

		aManager.searchList(searchTitle);
	}

	public void removeMovie()
	{
		String removeTitle = null;
		System.out.print("Enter the name of the movie you would like to remove: ");
		removeTitle = in.nextLine();

		aManager.remove(removeTitle);
	}

	public void runMenu()
	{
		repeat = true;
		String line;
		char selection = ' ';
		while (repeat == true)
		{
			displayMenu();
			line = in.nextLine();
			System.out.println();
			selection = line.charAt(FIRST);
			processMenu(selection);
		}
	}

	private void processMenu(char selection)
	{
		switch(Character.toLowerCase(selection))
		{
			case 'a':
				addMovie();
				break;
			case 'd':
				displayCollection();
				break;
			case 's':
				searchCollection();
				break;
			case 'r':
				removeMovie();
				break;
			case 'q':
				done = true;
				repeat = false;
				break;
			default:
				System.out.println("Incorrect choice... Try again");
				break;
		}
	}

	public void start()
	{
		tutorial();
		while (done == false)
		{
			runMenu();
		}
	}
}
