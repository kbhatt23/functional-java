package predicateUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClient1 {

	public static void main(String[] args) {
		//filter list with empty items
		List<String> items = Arrays.asList("raghav" , "sita ram" , "" , "hanuman", "" , " ", "lakshman");
		
		
		Predicate<String> predicate = str -> !str.isEmpty();
		Predicate<String> predicateReverse = String::isEmpty;
		
		Predicate<String> predicateBlank = str -> {
			boolean result = false;
			String trimmed  = str.trim();
			if(!trimmed.isEmpty()) {
				result = true;
			}
			return result;
		};
		
		System.out.println(usefilterPredicate(predicate, items));
		System.out.println(usefilterPredicate(predicate.and(predicateBlank), items));
		
		//predicates allows open claosed principle
		System.out.println(usefilterPredicate(predicateReverse, items).size());
	}
	
	
	static List<String> usefilterPredicate(Predicate<String> predicate , List<String> items){
		List<String> returnItems = new ArrayList<String>();
		for(String item:  items) {
			if(predicate.test(item)) {
				returnItems.add(item);
			}
		}
		
		return returnItems;
	}
	//generic method
	//can use without classs by defining <T> in method signature before use
	static <T> List<T> usefilterPredicateGeneric(Predicate<T> predicate , List<T> items){
		List<T> returnItems = new ArrayList<>();
		for(T item:  items) {
			if(predicate.test(item)) {
				returnItems.add(item);
			}
		}
		
		return returnItems;
	}

}
