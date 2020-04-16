package employeemanagement;

import java.util.Comparator;
import java.util.stream.Collectors;

//Query 3.4 : Get the details of highest paid employee in the organization?
public class EmployeeProblem4 {
public static void main(String[] args) {
Employee emp =	EmployeeDB.findAllEmployee()
			  .stream()
			  .max(Comparator.comparing(Employee::getSalary))
			  .orElseThrow(RuntimeException::new)
			  ;
System.out.println(emp);

//reduce
Employee emp1 = EmployeeDB.findAllEmployee()
.stream()
.reduce((result,current) -> current.getSalary() > result.getSalary() ? current: result)
.orElseThrow(RuntimeException::new)
;

System.out.println(emp1);

System.out.println(EmployeeDB.findAllEmployee()
.stream()
.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).orElseGet(null));
}
}
