package map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import data.Movie;
import data.MovieUtils;

public class MapTraversal {
public static void main(String[] args) {
	Map<String, Movie> movieMap = 
	MovieUtils.findAllMovies()
			  .stream()
			  .collect(Collectors.toMap(Movie::getName, Function.identity()));
	
	//defaultmap is hashmap in toMap method
	//traversal
	
	movieMap.forEach((k,v) -> System.out.println(k + " - "+ v));
	
	//filter
	Map<String, Movie> filteredMap = movieMap.entrySet()
			.stream()
			.filter(e -> e.getValue().getIndustry().equals("Bollywood"))
			.collect(Collectors.toMap(a -> a.getKey(), b -> b.getValue()))
			;
			System.out.println("=========filtering=============");
			filteredMap.forEach((k,v) -> System.out.println(k + " - "+ v));
			
   //sorting
	//hashmapt do not store the sequence of insertion
			//so sorting will also need to collect to linkedhashmap
			System.out.println("=========sorting type 1=============");	
			
		LinkedHashMap<String, Movie> sortedMap1=	movieMap.entrySet()
			.stream()
			.sorted(Comparator.comparing(e -> e.getValue().getName()))
			.collect(Collectors.toMap(a -> a.getKey(), b -> b.getValue(), (l,r) -> l, LinkedHashMap::new));
		
		sortedMap1.forEach((k,v) -> System.out.println(k + " - "+ v));
		
		//we can also use sorted map like treemap which do sorting on its own
		
		//either class should implement comaprable or pass a comparator
		System.out.println("=========sorting type 2=============");	
		
	SortedMap<String, Movie> sortedMap2=	 movieMap.entrySet()
		.stream()
		.collect(Collectors.toMap(Entry::getKey,Entry::getValue, (l,r) -> l, TreeMap::new));
		;
		sortedMap2.forEach((k,v) -> System.out.println(k + " - "+ v));
		
}
}
