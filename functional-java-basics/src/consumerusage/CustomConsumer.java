package consumerusage;
@FunctionalInterface
public interface CustomConsumer<T> {
	//consumer takes an input but returns no putput
	//mean only for side effects
	void consume(T t);
	
	//chaining methods
	//default method can be takenm only after object creation
	//hence not static
	//static method can only be taken before creating object
	//can not be used on object reference
	default CustomConsumer<T> chain(CustomConsumer<T> addConsumer){
		//lazy
		return (T t) -> {
			consume(t);
			addConsumer.consume(t);
		};
	}
}
