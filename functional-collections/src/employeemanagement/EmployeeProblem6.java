package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.6 : Count the number of employees in each department?
public class EmployeeProblem6 {
public static void main(String[] args) {
	Map<String, Long> depatmentCountMap = EmployeeDB.findAllEmployee()
			.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment
					,Collectors.counting()
					));
	depatmentCountMap.forEach((key,value) -> System.out.println(key+ " : "+ value));
}
}
