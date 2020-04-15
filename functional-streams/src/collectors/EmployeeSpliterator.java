package collectors;

import java.sql.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<Employee>{
	private Spliterator<String> baseSpliterator;
	
	//emplyee data
	private int id;
	private String name;
	private char gender;
	private Date dob;
	private String city;
	private String designation;
	private Date joiningDate;
	private double salary;

	public EmployeeSpliterator(Spliterator<String> baseSpliterator) {
		this.baseSpliterator = baseSpliterator;
	}

	@Override
	public boolean tryAdvance(Consumer<? super Employee> action) {
		Consumer<String> lineConsumer = (line) -> {
			String[] partsOfEmployees = line.split(",");
			this.id =Integer.valueOf(partsOfEmployees[0]);
			this.name = partsOfEmployees[1];
			this.gender = partsOfEmployees[2].charAt(0);
			this.dob = Date.valueOf(partsOfEmployees[3]);
			this.city = partsOfEmployees[4];
			this.designation = partsOfEmployees[5];
			this.joiningDate = Date.valueOf(partsOfEmployees[6]);
			this.salary =  Double.valueOf(partsOfEmployees[7]);
		};
		//each iterattion of string newed to create one instenace of employee each
		//not like other iterator where 4 line of string iterator we are creating one entry in book iterator
		if(baseSpliterator.tryAdvance(lineConsumer)) {
			action.accept(new Employee(id, name, gender, dob, city, designation, joiningDate, salary));
			return true;
		}
		return false;
	}

	//used in paralle programming
	@Override
	public Spliterator<Employee> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return baseSpliterator.estimateSize();
	}

	@Override
	public int characteristics() {
		return baseSpliterator.characteristics(); 
	}

}
