package customcollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class IntegerListCollectors {
	public static void main(String[] args) {

		List<Integer> items = Arrays.asList(5, 7, 2, 12, 1, 8, 10, 14, 6, 23, 22, 24);

		Collector<Integer, List<Integer>, List<Integer>> listCollector = Collector.of(ArrayList::new, List::add,
				(left, right) -> {
					left.addAll(right);
					return left;
				}, Collector.Characteristics.IDENTITY_FINISH);

		List<Integer> filterItems = items.stream().filter(a -> a % 2 == 0).collect(listCollector);
		System.out.println("unsorted list colector");
		filterItems.forEach(System.out::println);

		// sorted list collector

		System.out.println("sorted list colector");
		Collector<Integer, List<Integer>, List<Integer>> sortedToListCollector = Collector.of(ArrayList::new, List::add,
				(left, right) -> {
					left.addAll(right);
					return left;
				}, input -> {
					Collections.sort(input);
					return input;
				}, Collector.Characteristics.CONCURRENT);
		List<Integer> filterSortedItems = items.stream().filter(a -> a % 2 == 0).collect(sortedToListCollector);
		filterSortedItems.forEach(System.out::println);
	}
}
