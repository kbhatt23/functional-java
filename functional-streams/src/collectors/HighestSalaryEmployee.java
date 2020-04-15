package collectors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryEmployee {
public static void main(String[] args) {
	Employee emp =  EmployeeUtils
		.findAllEmployeeUsingStream()
		.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.orElseThrow(RuntimeException::new);
	System.out.println(emp);
	
	//just the name
	String nameMax = EmployeeUtils
					.findAllEmployeeUsingStream()
					.stream()
					.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), 
							e -> e.get().getName()))
							;
	
	System.out.println(nameMax);
	System.out.println("badia wala starts");
	Map<String,String> empbHigeshtByDepartment =  EmployeeUtils.findAllEmployeeStream()
			.collect(Collectors.groupingBy(Employee::getDesignation, 
					Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), 
							entry -> entry.get().getName()
							)
					));
	empbHigeshtByDepartment.entrySet()
		.forEach(System.out::println);
}
}
