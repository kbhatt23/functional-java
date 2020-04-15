package collectors;

import java.sql.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeFlattenedSpliterator implements Spliterator<Employee> {
	private Spliterator<String> baseSpliterator;

	// emplyee data
	private int id;
	private String name;
	private char gender;
	private Date dob;
	private String city;
	private String designation;
	private Date joiningDate;
	private double salary;

	public EmployeeFlattenedSpliterator(Spliterator<String> baseSpliterator) {
		this.baseSpliterator = baseSpliterator;
	}

	@Override
	public boolean tryAdvance(Consumer<? super Employee> action) {
		Consumer<String> idConsumer = (id) -> {
			this.id = Integer.valueOf(id);
		};
		Consumer<String> nameConsumer = (name) -> {
			this.name = name;
		};
		Consumer<String> genderConsumer = (gender) -> {
			this.gender = gender.charAt(0);
		};
		Consumer<String> dobConsumer = (dob) -> {
			this.dob = Date.valueOf(dob);
		};
		Consumer<String> cityConsumer = (city) -> {
			this.city = city;
		};
		Consumer<String> designationConsumer = (designation) -> {
			this.designation = designation;
		};
		Consumer<String> joiningDateConsumer = (joiningDate) -> {
			this.joiningDate = Date.valueOf(joiningDate);
		};
		Consumer<String> salaryConsumer = (salary) -> {
			this.salary = Double.valueOf(salary);
		};

		if(baseSpliterator.tryAdvance(idConsumer) && baseSpliterator.tryAdvance(nameConsumer)  && baseSpliterator.tryAdvance(genderConsumer)  && baseSpliterator.tryAdvance(dobConsumer) 
				&& baseSpliterator.tryAdvance(cityConsumer)  && baseSpliterator.tryAdvance(designationConsumer)  && baseSpliterator.tryAdvance(joiningDateConsumer) 
				&& baseSpliterator.tryAdvance(salaryConsumer) 
				) {
			action.accept(new Employee(id, name, gender, dob, city, designation, joiningDate, salary));
			return true;
		}
		return false;
	}

	// used in paralle programming
	@Override
	public Spliterator<Employee> trySplit() {
		return null;
	}

	//each ieration of emploiyee have 8 iterations of base spliterator
	@Override
	public long estimateSize() {
		return baseSpliterator.estimateSize()/8;
	}

	@Override
	public int characteristics() {
		return baseSpliterator.characteristics();
	}

}
