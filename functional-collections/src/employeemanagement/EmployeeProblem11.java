package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.11 : What is the average salary of male and female employees?
public class EmployeeProblem11 {

	public static void main(String[] args) {
		Map<String, Double> averageSlaaryMap =EmployeeDB.findAllEmployee()
		.stream()
		.collect(Collectors.groupingBy(Employee::getGender, 
					Collectors.averagingDouble(Employee::getSalary)
				));
		
		averageSlaaryMap.forEach((k,v) -> System.out.println(k+" : "+v));
		
	}

}
