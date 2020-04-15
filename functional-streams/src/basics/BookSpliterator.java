package basics;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book>{
	//copy propeties for conusmer
	private String name;
	private String author;
	private String genre;
	private double rating;
	
	
	//base spliterator
	private Spliterator<String> baseSpliterator;

	public BookSpliterator(Spliterator<String> baseSpliterator) {
		this.baseSpliterator = baseSpliterator;
	}

	//most importatnt
	//gets called by stream api on each element
	@Override
	public boolean tryAdvance(Consumer<? super Book> action) {
		//since the method is called by stream they privide lambda body
		//we are using spliterator of base
		//try advance method is called on each iterration
		
		//first index returns name
		boolean nameTry = baseSpliterator.tryAdvance((name) -> this.name = name);
		//second index returns author
		boolean authorTry = baseSpliterator.tryAdvance((author) -> this.author = author);
		//second index returns genere
		boolean genreTry = baseSpliterator.tryAdvance((genre) -> this.genre = genre);
		//second index returns rating
		boolean ratingTry = baseSpliterator.tryAdvance((rating) -> this.rating = Double.valueOf(rating));
		if(nameTry && authorTry && genreTry &&  ratingTry) {
			//correct set of iterations
			action.accept(new Book(name, author, genre, rating));
			return true;
		}
		
		return false;
	}
//no need to run in parallel
	@Override
	public Spliterator<Book> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		//size of book is size of items/4 -> 4 is number of proeprties in book
		return baseSpliterator.estimateSize()/4;
	}

	@Override
	public int characteristics() {
		return baseSpliterator.characteristics();
	}

}
