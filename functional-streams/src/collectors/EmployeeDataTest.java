package collectors;

public class EmployeeDataTest {

	public static void main(String[] args) {
		System.out.println("================direct file reading starts===============");
		EmployeeUtils.findAllEmployeeUsingStream()
					 .stream()
					 .forEach(System.out::println);
		System.out.println("================spliterator type 1 reading starts===============");
		EmployeeUtils.findAllEmployeeStream()
					.forEach(System.out::println);
		
		
		System.out.println("================spliterator type 2 reading starts===============");
		EmployeeUtils.findAllEmployeeStreamMultiple()
					.forEach(System.out::println);
	}
}
