package employeemanagement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Query 3.14 : Separate the employees who are younger or equal 
//to 25 years from those employees who are older than 25 years.
public class EmployeeProblem14 {

	public static void main(String[] args) {

		Map<Boolean, List<Employee>> youngEmplyees = EmployeeDB.findAllEmployee()
													.stream()
													.collect(Collectors.partitioningBy(e -> e.getAge()<=25));
		
		youngEmplyees.forEach((k,v) -> System.out.println(k+" : "+v));
		
		//for perfoirmace just names
		Map<Boolean, List<String>> youngEmplyeesNames =
		EmployeeDB.findAllEmployee()
		.stream()
		.collect(Collectors.partitioningBy(e -> e.getAge()<=25, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println("==============just names================");
		youngEmplyeesNames.forEach((k,v) -> System.out.println(k+" : "+v));
	}

}
