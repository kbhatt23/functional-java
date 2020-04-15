package customcollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListCollectorClient {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("sitaram" , "ramaduta hanuman"
				,"ganda ravan" , "ganda kansa" , "ram bhakt angad"
				,"rama bhakt kanishk"
				 ,"ramaduta hanuman"
				);
		
		//finisher is not mandaotry
		//character we can define identity finisher
		//meaning function.identity , meaning result of accumulaor will be output
		
		Supplier<List<String>> supplier = ArrayList::new;
		BiConsumer<List<String>, String> accumulator = List::add;
		BinaryOperator<List<String>> combiner = (left,right) -> {
			left.addAll(right);
			return left;
		};
		Collector<String, List<String>, List<String>>
		toListCollector = Collector.of(supplier,
				accumulator , combiner, Collector.Characteristics.IDENTITY_FINISH);
		
		List<String> filterItems = items.stream()
			 .filter(item -> item.contains("ram"))
			 .collect(toListCollector);
		System.out.println("simple list item");
		filterItems.forEach(System.out::println);
		
		System.out.println("unique type ka set item");
		
		BiConsumer<Set<String>, String> accumulatorSet = Set::add;
		BinaryOperator<Set<String>> combinerSet = (left,right) -> {
			left.addAll(right);
			return left;
		};
		
		Collector<String, Set<String>, Set<String>>
		toSetCollector = Collector.of(HashSet::new,
				accumulatorSet , combinerSet, Collector.Characteristics.IDENTITY_FINISH);
				
		Set<String> filteredSet = items.stream()
				 .filter(item -> item.contains("ram"))
			 .collect(toSetCollector);
		filteredSet.forEach(System.out::println);
		
		
		System.out.println("finisher type ka set item");
		
		Function<List<String>, Set<String>> finisher = (list) -> list.stream().collect(Collectors.toSet());
		
		
		Collector<String, List<String>, Set<String>>
		toSetFinisherCollector = Collector.of(ArrayList::new, accumulator, combiner, 
				finisher
				, Collector.Characteristics.UNORDERED);
				
		Set<String> filteredSetUsingfinisher = items.stream()
				 .filter(item -> item.contains("ram"))
			 .collect(toSetFinisherCollector);
		filteredSetUsingfinisher.forEach(System.out::println);
	}
}
