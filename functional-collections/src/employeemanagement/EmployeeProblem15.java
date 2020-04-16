package employeemanagement;

import java.util.Comparator;

//Query 3.15 : Who is the oldest employee in the organization?
//What is his age and which department he belongs to?
public class EmployeeProblem15 {
public static void main(String[] args) {
	Employee  oldesEmployee = EmployeeDB.findAllEmployee()
		.stream()
		.max(Comparator.comparing(Employee::getAge))
		.orElse(null)
		;
	System.out.println(oldesEmployee);
}
}
