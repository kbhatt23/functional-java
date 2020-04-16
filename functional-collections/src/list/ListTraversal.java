package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import data.Movie;

public class ListTraversal {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("Spotlight", 2015, "Hollywood"),
				new Movie("Avengers: Infinity War", 2018, "Hollywood"), new Movie("Inception", 2010, "Hollywood"),
				new Movie("Forest Gump", 1994, "Hollywood"), new Movie("3 Idiots", 2009, "Bollywood"),
				new Movie("Beauty and the beast", 2017, "Hollywood"),
				new Movie("Slumdog Millionaire", 2008, "Bollywood"));

		// traversal
		movies.forEach(System.out::println);

		System.out.println("====================");

		Comparator<Movie> sortByRelease = (a, b) -> {
			int aYear = a.getReleaseYear();
			int bYear = b.getReleaseYear();
			if (aYear == bYear) {
				return 0;
			}
			return (aYear > bYear) ? 1 : -1;
		};

		Comparator<Movie> sortByReleaseOneLine = (a, b) -> {
			int aYear = a.getReleaseYear();
			int bYear = b.getReleaseYear();
			return aYear > bYear ? 1 : (aYear == bYear ? 0 : -1);
		};

		Collections.sort(movies, (a, b) -> a.getName().compareTo(b.getName()));

		movies.forEach(System.out::println);
		System.out.println("========================");

		Collections.sort(movies, sortByReleaseOneLine);
		movies.forEach(System.out::println);

		System.out.println("====filter=======");

		movies.stream().filter(e -> e.getIndustry().equals("Bollywood")).forEach(System.out::println);

		System.out.println("====mapping=======");

		movies.stream().filter(e -> e.getIndustry().equals("Bollywood")).map(Movie::getName)
				.forEach(System.out::println);

		System.out.println("====reduce=======");

		String allBollywoodNames = movies.stream().filter(e -> e.getIndustry().equals("Bollywood")).map(Movie::getName)
				.reduce((result, current) -> result + "," + current).orElseThrow(RuntimeException::new);
		System.out.println(allBollywoodNames);

	}

}
