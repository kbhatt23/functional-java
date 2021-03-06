package data;

import java.util.Arrays;
import java.util.List;

public class MovieUtils {

	public static List<Movie> findAllMovies(){
		List<Movie> movies = Arrays.asList(new Movie("Spotlight", 2015, "Hollywood"),
				new Movie("Avengers: Infinity War", 2018, "Hollywood"), new Movie("Inception", 2010, "Hollywood"),
				new Movie("Forest Gump", 1994, "Hollywood"), new Movie("3 Idiots", 2009, "Bollywood"),
				new Movie("Beauty and the beast", 2017, "Hollywood"),
				new Movie("Slumdog Millionaire", 2008, "Bollywood"));
		return movies;
	}
}
