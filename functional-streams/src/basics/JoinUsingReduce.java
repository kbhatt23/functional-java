package basics;

import java.util.stream.Stream;

public class JoinUsingReduce {
public static void main(String[] args) {
	Stream.of("sitaram", "hanuman", "urmilalakshman", "radhakrishna")
		.reduce((result, current) -> result = result+ ","+current)
		.ifPresent(System.out::println);
}
}
