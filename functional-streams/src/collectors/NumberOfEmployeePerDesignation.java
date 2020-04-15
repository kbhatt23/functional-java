package collectors;

import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfEmployeePerDesignation {
public static void main(String[] args) {
	Map<String, Long> departMentCount = EmployeeUtils.findAllEmployeeUsingStream()
			.stream()
			.collect(Collectors.groupingBy(Employee::getDesignation ,
					Collectors.counting()
					));
	
	departMentCount.entrySet()
					.forEach(System.out::println);
}
}
