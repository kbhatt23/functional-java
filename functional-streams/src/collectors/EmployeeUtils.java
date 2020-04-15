package collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EmployeeUtils {

	public static List<Employee> findAllEmployeeUsingStream() {
		Path path = Paths.get("C:/Users/admin/git/functional-java/functional-streams/employee-data.txt");
		
		try {
			return Files.readAllLines(path)
				 .stream()
				 .map(line -> {
					String[] partsOfEmployees = line.split(",");
					return new Employee(Integer.valueOf(partsOfEmployees[0]), partsOfEmployees[1], partsOfEmployees[2].charAt(0), 
							Date.valueOf(partsOfEmployees[3]), partsOfEmployees[4], partsOfEmployees[5], Date.valueOf(partsOfEmployees[6]), Double.valueOf(partsOfEmployees[7]));
				 }
				 )
				 .collect(Collectors.toList())
				 ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Stream<Employee> findAllEmployeeStream() {
		Path path = Paths.get("C:/Users/admin/git/functional-java/functional-streams/employee-data.txt");
		try {
			 List<String> allLines = Files.readAllLines(path);
			 Spliterator<String> lineSpliterator = allLines.spliterator();
			 
			 Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(lineSpliterator);
			 
			 return StreamSupport.stream(employeeSpliterator, false);
				 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Stream<Employee> findAllEmployeeStreamMultiple() {
		Path path = Paths.get("C:/Users/admin/git/functional-java/functional-streams/employee-data.txt");
		try {
			 List<String> allLines = Files.readAllLines(path);
			 
			 //converting this case into scenario when one iteration of emplyee will have 8 iterations of line
			 //returns Stream foa all lines contained together
			 Spliterator<String> lineSpliterator = allLines.
					 									stream()
					 									.flatMap(line -> Arrays.stream(line.split(",")))
					 									.spliterator();
			 
			 Spliterator<Employee> employeeSpliterator = new EmployeeFlattenedSpliterator(lineSpliterator);
			 
			 return StreamSupport.stream(employeeSpliterator, false);
				 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
