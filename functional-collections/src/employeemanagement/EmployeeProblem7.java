package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.7 : What is the average salary of each department?
public class EmployeeProblem7 {
public static void main(String[] args) {
	
	Map<String, Double> averageSlaryMap = EmployeeDB.findAllEmployee()
			  .stream()
			  .collect(Collectors.groupingBy(Employee::getDepartment
					  ,Collectors.averagingDouble(Employee::getSalary)
					  ));

	averageSlaryMap.forEach((k,v) -> System.out.println(k+" : "+v));
}
}
