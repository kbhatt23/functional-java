package wildcards;

import java.util.Arrays;
import java.util.List;

public class RestrictedGenericsType {
	public static void main(String[] args) {
		AdditionManipulator<Integer> addObj = new AdditionManipulator<>(Arrays.asList(14,3,5,12,1,4));
		addObj.printSum();
		addObj.printSortedData();
		
		AdditionManipulator<Double> addDouble =  new AdditionManipulator<>(Arrays.asList(23D,12D,13D,14D));
		addDouble.printSum();
		addDouble.printSortedData();
	}

}
//class meant for addition
//addition can be done for numbers only and its sublclass only like integer, double etc
class AdditionManipulator<T extends Number>{
	private List<T> nums;
	public AdditionManipulator(List<T> nums) {
		this.nums=nums;
	}
	
	public void printSum() {
		double sum = 0D;
		for(Number n : nums) {
			sum = sum+ n.doubleValue();
		}
		System.out.println("sum is "+sum);
	}
	public void printSortedData() {
		nums.sort(null);
		System.out.println(nums);
	}
	
	
}
