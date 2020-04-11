package consumerusage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUsageClient1 {
public static void main(String[] args) {
	Consumer<String> printStringConsumer = (element) -> System.out.println("comsuning element "+element);
	
	printStringConsumer.accept("jai shree ram");
	
	List<String> listItems = Arrays.asList("ram" , "sita" , "krishna" , "radha");
	consumeList(listItems, printStringConsumer);
	System.out.println("generic way starts");
	consumeListGeneric(listItems, printStringConsumer);
	
	System.out.println("Integer consuming starts \n");
	List<Integer> listItemsInt = Arrays.asList(1 , 2 , 3 , 4);
	
	Consumer<Integer> printStringConsumerInt = (element) -> System.out.println("comsuning integers "+element);
	consumeListGeneric(listItemsInt, printStringConsumerInt);
}

static void consumeList(List<String> listItems , Consumer<String> consumer) {
	for(String item : listItems) {
		consumer.accept(item);
	}
}

static <T> void consumeListGeneric(List<T> listItems , Consumer<T> consumer) {
	for(T item : listItems) {
		consumer.accept(item);
	}
}

}
