package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByGender {
	public static void main(String[] args) {
		Map<Character, List<Employee>> employeeByGender = EmployeeUtils.findAllEmployeeStreamMultiple()
					 .collect(Collectors.groupingBy(Employee::getGender));
		
		employeeByGender.entrySet().forEach(System.out::println);
		System.out.println("======jai shree ram=====");
		//just names
		
		
		Map<Character, List<String>> employeeNamesByGender = EmployeeUtils.findAllEmployeeStreamMultiple()
				 .collect(Collectors.groupingBy(Employee::getGender ,
						 Collectors.mapping(Employee::getName, Collectors.toList())
						 ));
	
		employeeNamesByGender.entrySet().forEach(System.out::println);
	}

}
