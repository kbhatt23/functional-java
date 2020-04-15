package collectors;

import java.util.stream.Collectors;

public class JoinEmployeeName {
public static void main(String[] args) {
	System.out.println("using colelctors joining method");
	
	String employeeNameJoins= EmployeeUtils.findAllEmployeeStream()
				.collect(Collectors.mapping(Employee::getName, 
						Collectors.joining(",")
						)
						);
	
	System.out.println(employeeNameJoins);
	
	System.out.println("using reduce method");
	
	String employeeNameReduceJoins = EmployeeUtils.findAllEmployeeStream()
				 .map(Employee::getName)
				 .reduce((result, current) -> result+ "," + current)
				 .orElseThrow(RuntimeException::new)
				 ;
	
	System.out.println(employeeNameReduceJoins);
}
}
