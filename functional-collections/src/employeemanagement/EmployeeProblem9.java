package employeemanagement;

import java.util.Comparator;

//Query 3.9 : Who has the most working experience in the organization?
public class EmployeeProblem9 {
public static void main(String[] args) {
	
	System.out.println(EmployeeDB.findAllEmployee()
				.stream()
				.min(Comparator.comparing(Employee::getYearOfJoining))
				.orElse(null));
	
	System.out.println("============using findfirst");
	System.out.println(EmployeeDB.findAllEmployee()
			.stream()
			.sorted(Comparator.comparing(Employee::getYearOfJoining))
			.findFirst()
			.orElse(null)
			
			);
	
}
}
