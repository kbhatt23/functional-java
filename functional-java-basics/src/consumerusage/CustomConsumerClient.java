package consumerusage;

public class CustomConsumerClient {
public static void main(String[] args) {
	CustomConsumer<String> consumer1  = System.out::println;
	
	consumer1.consume("jai shree ram");
	
	CustomConsumer<String> consumer2  = (str) -> System.out.println(str.toUpperCase());
	
	CustomConsumer<String> consumer3  = (str) -> System.out.println(str.length());
	
	CustomConsumer<String> chained = consumer1.chain(consumer2).chain(consumer3);
	
	chained.consume("jai shree ram");
}
}
