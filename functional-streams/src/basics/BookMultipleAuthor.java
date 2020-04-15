package basics;

import java.util.List;

public class BookMultipleAuthor {
	
	
	private String name;
	private List<String> author;
	private String genre;
	private double rating;
	
	
	public BookMultipleAuthor(String name, List<String> author, String genre, double rating) {
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", Author=" + author + ", genre=" + genre + ", rating=" + rating + "]";
	}


	public List<String> getAuthor() {
		return author;
	}


	public void setAuthor(List<String> author) {
		this.author = author;
	}
	
}


