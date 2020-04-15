package collectors;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedEmployees {
public static void main(String[] args) {
	SortedSet<Employee> sortedEmployees = EmployeeUtils.findAllEmployeeStreamMultiple()
				.collect(Collectors.toCollection(() -> new TreeSet<Employee>(Comparator.comparing(Employee::getName))));
	
	sortedEmployees.forEach(e -> System.out.println(e.getName() + ":" + e.getId()));
	
	System.out.println("default sortring with id");
	
	SortedSet<Employee> sortedEmployees1 = EmployeeUtils.findAllEmployeeStreamMultiple()
			.collect(Collectors.toCollection(TreeSet::new));

			sortedEmployees1.forEach(e -> System.out.println(e.getName() + ":" + e.getId()));
			
			System.out.println("sorting using mapping starts");
			//sorting by id and printing just name
	SortedSet<String> nameSOrtedById=		
			EmployeeUtils.findAllEmployeeStreamMultiple()
			.collect(Collectors.mapping(Employee::getName, Collectors.toCollection(TreeSet :: new)));	
	
	nameSOrtedById.forEach(System.out::println);
}
}
