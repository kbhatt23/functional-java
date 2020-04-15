package basics;

import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample2 {
public static void main(String[] args) {
	Stream<String> stream1 = Stream.of("jai shree ram", "jai radhe shyaam");
	
	Stream<String> stream2 = Stream.of("jai parvati shiva", "jai uma maheshwar");
	
	Stream<String> stream3 = Stream.of("jai saraswati branhma");
	
	//2 dimensional stream
	Stream<Stream<String>> twoDStream  =Stream.of(stream1,stream2,stream3);
	
	//we can use flatmap to conver this 2d into one d stream
	
	//each element itself is stream
	//hence identity will return stream itslef
	Stream<String> oneDStream =twoDStream.flatMap(Function.identity());
	
	oneDStream.forEach(System.out::println);

}
}
