package employeemanagement;

import java.util.List;
import java.util.stream.Collectors;

//Query 3.5 : Get the names of all employees who have joined after 2015?
public class EmployeeProblem5 {
public static void main(String[] args) {
	
	List<String> names = EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(e -> e.getYearOfJoining() > 2015)
			 .map(Employee::getName)
			 .collect(Collectors.toList())
			 ;
	
	names.forEach(System.out::println);
	
	//joingin
	System.out.println("=============using join============================");
	
	String nameJoin = EmployeeDB.findAllEmployee()
	 .stream()
	 .filter(e -> e.getYearOfJoining() > 2015)
	 .map(Employee::getName)
	 .collect(Collectors.joining(","));
	System.out.println(nameJoin);
	
	//reduce
	System.out.println("=============using reduce============================");
	String nameReduce = EmployeeDB.findAllEmployee()
			 .stream()
			 .filter(e -> e.getYearOfJoining() > 2015)
			 .map(Employee::getName)
			 .reduce((result,current) -> result+","+current)
			 .orElseThrow(RuntimeException::new);
	System.out.println(nameReduce);
	
	//mapping in collector
	System.out.println("=============using collector maping============================");
	List<String> collectorList = EmployeeDB.findAllEmployee()
	 .stream()
	 .filter(e -> e.getYearOfJoining() > 2015)
	 .collect(Collectors.mapping(Employee::getName, Collectors.toList()))
	;
	collectorList.forEach(System.out::println);
}
}
