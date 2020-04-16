package employeemanagement;

import java.util.DoubleSummaryStatistics;

//Query 3.13 : What is the average salary and total salary of the whole organization?
public class EmployeeProblem13 {
public static void main(String[] args) {
	DoubleSummaryStatistics summaryStatistics = EmployeeDB.findAllEmployee()
			 .stream()
			 .mapToDouble(Employee::getSalary)
			 .summaryStatistics()
			 ;
			 
	System.out.println(summaryStatistics);
}
}
