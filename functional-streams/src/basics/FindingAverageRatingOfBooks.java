package basics;

import java.util.stream.Collectors;

public class FindingAverageRatingOfBooks {

	public static void main(String[] args) {
		
		double average = BookUtils.findAllBooks()
				 .stream()
				 .mapToDouble(Book::getRating)
				 .average()
				 .orElseThrow(RuntimeException::new)
				 ;
		System.out.println("average "+average);
		
		double averageEasy = BookUtils.findAllBooks()
		 .stream()
		 .collect(Collectors.averagingDouble(Book::getRating));
	
		System.out.println("average "+averageEasy);
	}
}
