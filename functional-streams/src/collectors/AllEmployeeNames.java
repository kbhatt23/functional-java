package collectors;

import java.util.List;
import java.util.stream.Collectors;

public class AllEmployeeNames {
public static void main(String[] args) {
	List<String> allName = EmployeeUtils.findAllEmployeeUsingStream()
				 .stream()
				 //
				 .map(Employee::getName)
				 .collect(Collectors.toList());
	
	allName.forEach(System.out::println);
	System.out.println("other way starts");
	
	List<String> allName1 = EmployeeUtils.findAllEmployeeUsingStream()
			 							.stream()
			 							.collect(Collectors.mapping(Employee::getName, Collectors.mapping(e -> ((String)e).toUpperCase(), Collectors.toList())))
;
	allName1.forEach(System.out::println);
}
}
