package collectors;

import java.util.Map;
import java.util.stream.Collectors;

public class CostPerDepartment {
public static void main(String[] args) {
	Map<String, Double> salaryByDepartment =  EmployeeUtils.findAllEmployeeUsingStream()
		.stream()
		.collect(Collectors.groupingBy(Employee::getDesignation
				,Collectors.summingDouble(Employee::getSalary)
				
				));
	
	salaryByDepartment.entrySet()
					  .forEach(System.out::println);
}
}
