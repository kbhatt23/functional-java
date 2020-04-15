package basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookUploadData {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/admin/git/functional-java/functional-streams/books-data.txt");
		
		List<String> fileLines =Files.readAllLines(path);
		
		//old way
		//4 is number of columns
		int iterationIndex = fileLines.size()/4;
		List<Book> bookList = new ArrayList<Book>();
		int j =0;
		for(int i = 0 ; i< iterationIndex ; i ++ ) {
			String name = fileLines.get(j++);
			String author = fileLines.get(j++);
			String genre = fileLines.get(j++);
			double rating = Double.valueOf(fileLines.get(j++));
			Book book = new Book(name, author, genre, rating);
			bookList.add(book);
		}
		
		bookList.forEach(System.out::println);
	}

}
