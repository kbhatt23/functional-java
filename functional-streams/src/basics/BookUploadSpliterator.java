package basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class BookUploadSpliterator {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/admin/git/functional-java/functional-streams/books-data.txt");
		
		List<String> fileLines =Files.readAllLines(path);
		
		Spliterator<String> baseSpliterator = fileLines.stream().spliterator();
		
		Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);
		
		Stream<Book> bookCustomStream = StreamSupport.stream(bookSpliterator, false);
		
		bookCustomStream.forEach(System.out::println);
	}
}
