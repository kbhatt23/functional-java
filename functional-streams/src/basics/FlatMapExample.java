package basics;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
public static void main(String[] args) {
	
	List<String> allAuthors= BookUtils.findAllBooksMultipleAuthors()
			 .stream()
			 .map(BookMultipleAuthor::getAuthor)
			 .flatMap(List::stream)
			 .collect(Collectors.toList());
	
	allAuthors.
		stream()
		.distinct().
	forEach(System.out::println);
}
}
