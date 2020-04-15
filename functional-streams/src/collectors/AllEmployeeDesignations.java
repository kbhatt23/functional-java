package collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AllEmployeeDesignations {
public static void main(String[] args) {
	Set<String> allDEsignation = EmployeeUtils.findAllEmployeeStreamMultiple()
				.map(Employee::getDesignation)
				.collect(Collectors.toSet());
	
	allDEsignation.forEach(System.out::println);
	
	System.out.println("way two starts");
	
	List<String> uniqueDesignationsList = EmployeeUtils.findAllEmployeeStreamMultiple()
	.map(Employee::getDesignation)
	.distinct()
	.collect(Collectors.toList());
	
	uniqueDesignationsList.forEach(System.out::println);
}
}
