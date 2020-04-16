package employeemanagement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Query 3.12 : List down the names of all employees in each department?
public class EmployeeProblem12 {

	public static void main(String[] args) {

		Map<String, List<String>> namesByGenderMap = EmployeeDB.findAllEmployee()
				  .stream()
				  .collect(Collectors.groupingBy(Employee::getDepartment,
						  Collectors.mapping(Employee::getName, Collectors.toList())
						  ));
		namesByGenderMap.forEach((k,v) -> System.out.println(k+" : "+v));
		
		System.out.println("=====using collecting and then===========");
		
	}

}
