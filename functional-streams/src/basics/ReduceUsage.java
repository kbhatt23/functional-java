package basics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceUsage {
public static void main(String[] args) {
	//min of all
	int min = Stream.of(32,22,34,21,34,23,20,16,24)
			.reduce((result,current) -> (current< result) ? current: result)
			.orElseThrow(RuntimeException::new)
			;
	System.out.println("min of all " +min);
	
	//max
	int max = Stream.of(32,22,34,21,34,23,20,16,24)
			.reduce((result,current) -> (current> result) ? current: result)
			.orElseThrow(RuntimeException::new)
			;
	System.out.println("max of all " +max);
	
	//sum
	long sum = Stream.of(32,22,34,21,34,23,20,16,24)
					.reduce(0, (result,current) -> result+current)
			;
	System.out.println("sum of all "+sum);
	
	//multiply
	long multiply = Stream.of(1,3,4,1,3,3,2,16,2)
					.reduce(1, (result,current) -> result*current)
			;
	System.out.println("multiply of all "+multiply);
	
}
}
