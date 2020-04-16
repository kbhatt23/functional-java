package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//How many male and female employees are there in the organization?
public class EmployeeProblem1 {
public static void main(String[] args) {
	long maleCount = EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(emp -> emp.getGender().equals("Male"))
			 .count();
	
	long femaleCount = EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(emp -> emp.getGender().equals("Female"))
			 .count();
	System.out.println("male count "+maleCount);
	System.out.println("female count "+femaleCount);
	
	//other way
	Map<String, Long> genderCount =  EmployeeDB.findAllEmployee()
	 .stream()
	 .collect(Collectors.groupingBy(Employee::getGender , 
			 Collectors.counting()
			 ));
	System.out.println(genderCount);
	
}
}
