package employeemanagement;

import java.util.Comparator;
import java.util.stream.Collectors;

//Query 3.8 : Get the details of youngest male employee in the product development department?
public class EmployeeProblem8 {
public static void main(String[] args) {
	
	System.out.println(EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(emp -> "Product Development".equals(emp.getDepartment()))
			 .filter(emp -> "Male".equals(emp.getGender()))
			 .min(Comparator.comparing(Employee::getAge))
			 .orElse(null));
	
	System.out.println("using collector");
	
	System.out.println(EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(emp -> "Product Development".equals(emp.getDepartment()))
			 .filter(emp -> "Male".equals(emp.getGender()))
			 .collect(
					 Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getAge)), 
							 optionEmp -> optionEmp.get()
							 )
					 )
			);
}
}
