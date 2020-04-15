package collectors;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectoToMap {
public static void main(String[] args) {
	Map<Integer, String> sortedNameIDMap =  EmployeeUtils.findAllEmployeeStream()
	//default sorting is based on id
				 .sorted()
				 .collect(Collectors.toMap(Employee::getId, Employee::getName));
	
	
	sortedNameIDMap.entrySet()
					.forEach(System.out::println);
}
}
