package set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.Movie;
import data.MovieUtils;

public class SetTraversal {
public static void main(String[] args) {
	Set<Movie> movieSet = MovieUtils.findAllMovies()
									.stream()
									.collect(Collectors.toSet());
	
	//set traversla is random
	
	movieSet.forEach(System.out::println);
	
	System.out.println("=======sorted====");
	
	movieSet.stream()
	.filter(e -> e.getIndustry().contains("Bollywood"))
			.sorted(Comparator.comparing(Movie::getName))
			.forEach(System.out::println);
			System.out.println("-=======tree set=====");
	//if we want ot ollect sorted set only way is treeset
	SortedSet<Movie> setSorted = movieSet.stream()
			.collect(Collectors.toCollection(() -> new TreeSet<Movie>(Comparator.comparing(Movie::getName))));
	setSorted.forEach(System.out::println);
	
	
}
}
