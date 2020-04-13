package consumerusage;

public class RamConsumerUsageClient {
public static void main(String[] args) {
	RamConsumer<String> consumer1 = System.out::println;
	consumer1.consume("jai shree ram");
	
	RamConsumer<String> consumer2 = (str) -> System.out.println(str.toUpperCase());
	
	RamConsumer<String> consumer3 = (str) -> System.out.println(str+ " jai hanuman");
	
	RamConsumer<String> finalConsumer= consumer1.chainConsumer(consumer2).chainConsumer(consumer3);
	finalConsumer.consume("jai shree ram");
}
}
