package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import basics.BookUtils;
import basics.Book;
public class BasicCollector {
public static void main(String[] args) {
	Map<String, List<Book>> booksByGenre =  BookUtils.findAllBooks()
			 .stream()
			 .collect(Collectors.groupingBy(Book::getGenre));
	

	booksByGenre.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": "+ entry.getValue()));
	System.out.println("=====================");
	
	Map<String, List<String>> bookNamesByGenre =  BookUtils.findAllBooks()
			 .stream()
			 .collect(Collectors.groupingBy(Book::getGenre, Collectors.mapping(Book::getName, Collectors.toList())));

	bookNamesByGenre.entrySet().forEach(System.out::println);
}
}
