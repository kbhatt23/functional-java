package consumerusage;

import java.util.function.Consumer;

public class ConsumerChainingClient {

	public static void main(String[] args) {
		Consumer<String> consumerPrintDirect = (str) -> System.out.println(str);
		
		Consumer<String> consumerPrintUpperCase = (str) -> System.out.println(str.toUpperCase());
		
		Consumer<String> consumerPrintLowerCase = (str) -> System.out.println(str.toLowerCase());
		
		Consumer<String> chained = consumerPrintDirect.andThen(consumerPrintUpperCase).andThen(consumerPrintLowerCase);
		
		chained.accept("JAi ShrEE RaM");
	}
}
