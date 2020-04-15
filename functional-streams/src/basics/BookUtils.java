package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookUtils {

	public static List<Book> findAllBooks(){
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
		books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
		books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));
		books.add(new Book("The Notebook 2", "Nicholas Sparks", "Romance", 3.10));
		return books;
	}
	
	public static List<BookMultipleAuthor> findAllBooksMultipleAuthors(){
		List<BookMultipleAuthor> books = new ArrayList<>();
		
		books.add(new BookMultipleAuthor("The Alchemist", Arrays.asList("Paulo Coelho", "King Jordan"), "Adventure", 4.408789797));
		books.add(new BookMultipleAuthor("The Notebook",Arrays.asList("Nicholas Sparks", "King Jordan") , "Romance", 4.10));
		books.add(new BookMultipleAuthor("Horror Cocktail", Arrays.asList("Robert Bloch"), "Horror", 2.67));
		books.add(new BookMultipleAuthor("House of Leaves", Arrays.asList("Mark Z. Danielewski", "King Kong"), "Horror", 4.10908908));
		books.add(new BookMultipleAuthor("The Notebook 2", Arrays.asList("Nicholas Sparks", "Lapela Lalla"), "Romance", 3.10));
		return books;
	}
}
