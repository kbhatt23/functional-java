package lambdadesignpatternsbyvenkat;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicLambdaStrategy {

	public static void main(String[] args) {

		List<Integer> nums = IntStream.rangeClosed(1, 10)
									  .boxed()
									  .collect(Collectors.toList());
		
		System.out.println("total sum "+calculateSum(nums));
		System.out.println("total bad even sum "+calculateSumEven(nums));
		System.out.println("total sum good way even "+calculateSumByPredicate(nums, (num) -> num % 2 ==0));
		
		//predicate always returning true
		System.out.println("total sum good way "+calculateSumByPredicate(nums, (num) -> true));
		
		System.out.println("total sum good way odd "+calculateSumByPredicate(nums, (num) -> num % 2 !=0));
	}
	
	//good one
	private static  int  calculateSumByPredicate(List<Integer> nums , Predicate<Integer> predicate) {
		int sum =0;
		for(int num : nums) {
			if(predicate.test(num))
			sum += num;
		}
		return sum;
	}

	private static  int  calculateSum(List<Integer> nums) {
		int sum =0;
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	//sum of even number only
	private static  int  calculateSumEven(List<Integer> nums) {
		int sum =0;
		for(int num : nums) {
			if(num % 2 == 0)
			sum += num;
		}
		return sum;
	}

}
