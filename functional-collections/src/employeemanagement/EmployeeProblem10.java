package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.10 : How many male and female employees are there in the sales and marketing team?
public class EmployeeProblem10 {

	public static void main(String[] args) {
		Map<String, Long> genderCount = EmployeeDB.findAllEmployee()
				  .stream()
				  .filter(emp-> "Sales And Marketing".equals(emp.getDepartment()))
				  .collect(Collectors.groupingBy(Employee::getGender,
						  Collectors.counting()
						  ));
		
		genderCount.forEach((k,v) -> System.out.println(k+" : "+v));

	}

}
