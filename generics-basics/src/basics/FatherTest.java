package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FatherTest {

	protected boolean isFather = true;
	
	public static void main(String[] args) {
		
		//in array it was possible
		//nbut that cause deveoper to set even the father in individual element
		//eg:
		//FatherTest[] array = new Child[2];
		FatherTest[] array = new FatherTest[2];
		array[0] = new Child();
		array[1] = new FatherTest();
		Arrays.stream(array)
			.forEach(System.out::println);
		
		//it can hold father entry and its child
				//below wont compil;e
		//List<FatherTest> fatList1 = new ArrayList<Child>();
		List<FatherTest> fatList = new ArrayList<FatherTest>();
		fatList.add(new FatherTest());
		fatList.add(new Child());
		fatList.forEach(System.out::println);
		
		List<Child> childItems = new ArrayList<Child>();
		part1(childItems);
	}
	
	public static void part1(List<? extends FatherTest> items) {
		//becomes immutable
		//items.add(new Child());
	}
	
	public static void part2(List<? super Child> items) {
		//becomes valid for child and its subclasses
		items.add(new Child());
	}
}

class Child extends FatherTest
{
	protected boolean isChild=true;
	protected boolean isFather = false;
}
