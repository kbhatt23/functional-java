package employeemanagement;

import java.util.List;
import java.util.stream.Collectors;

//Query 3.2 : Print the name of all departments in the organization?
public class EmployeeProblem2 {
public static void main(String[] args) {
	EmployeeDB.findAllEmployee()
			  .stream()
			  .map(Employee::getDepartment)
			  .distinct()
			  .forEach(System.out::println);
	System.out.println("=============");
	List<String> departments = EmployeeDB.findAllEmployee()
	  .stream()
	  .map(Employee::getDepartment)
	  .distinct()
	  .collect(Collectors.toList());
	
	departments.forEach(System.out::println);
}
}
