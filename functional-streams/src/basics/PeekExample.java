package basics;

public class PeekExample {
public static void main(String[] args) {
	
	BookUtils.findAllBooks()
			 .stream()
			 .filter(book -> book.getGenre().equals("Romance"))
			 .peek(book -> System.out.println("book after filter 1 "+book.getName()))
			 .filter(book -> book.getRating()>4)
			 .peek(book -> System.out.println("book after filter 2 "+book.getName()))
			 .forEach(item -> System.out.println("final resullt part "+item.getName()));
}

}
