package basics;

import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamBuilder {
public static void main(String[] args) {
	Builder<String> stringStreamBuilder = Stream.builder();
	
	stringStreamBuilder.add("jia shree ram");
	//if conditions
	//calculation conditions
	stringStreamBuilder.add("jai shree ram")
	;
	
	stringStreamBuilder.build()
			.forEach(System.out::println);
}
}
