package basics;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {
public static void main(String[] args) {
	//stream of objects -> Stream<Long>
	
	Stream.iterate(0, i -> i+1)
	.limit(11)
		.forEach(System.out::println);
	;
	
	Stream.iterate("jai shree ram", a -> a)
	.limit(15)
	.forEach(System.out::println);
	;
	
	//generate takes supplier
	Stream.generate(Math::random)
	.limit(15)
	.forEach(System.out::println);
	;
	
	//primtives have sam methods generate and iterate
	IntStream.iterate(1, i -> i*2)
	.limit(15)
	.forEach(System.out::println);
	
		IntStream.generate( new Random() :: nextInt)
		.limit(15)
		.forEach(System.out::println);
}
}
