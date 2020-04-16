package employeemanagement;

import java.util.Map;
import java.util.stream.Collectors;

//Query 3.3 : What is the average age of male and female employees?
public class EmployeeProblem3 {
public static void main(String[] args) {
	System.out.println("avearge age male: "+EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(e -> e.gender.equals("Male"))
			 .mapToInt(Employee::getAge)
			 .average());
	
	System.out.println("avearge age female: "+EmployeeDB.findAllEmployee()
	 .stream()
	 .filter(e -> e.gender.equals("Female"))
	 .mapToInt(Employee::getAge)
	 .average());
	
	//better 
	Map<String, Double> averageMap =EmployeeDB.findAllEmployee()
			  .stream()
			  .collect(Collectors.groupingBy(Employee::getGender,
					  Collectors.averagingDouble(Employee::getAge)
					  ));
	System.out.println(averageMap);
}
}
