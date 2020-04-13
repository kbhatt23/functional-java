package consumerusage;

import java.util.Objects;

public interface RamConsumer<T> {

	void consume(T t);
	
	//chained item
	default RamConsumer<T> chainConsumer(RamConsumer<T> chainedConsumer){
		Objects.requireNonNull(chainedConsumer);
		return (T t) -> {
			//same object to be passed to both consumers
			consume(t);
			chainedConsumer.consume(t);
		};
	}
}
