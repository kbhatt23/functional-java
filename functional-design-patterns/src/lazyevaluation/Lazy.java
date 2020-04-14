package lazyevaluation;

import java.util.function.Supplier;

public class Lazy<T> {

	private T instance;
	private Supplier<T> supplier;
	public Lazy(Supplier<T> supplier) {
		this.supplier = supplier;
	}
	
	public T getInstance() {
		if(instance == null) {
			instance = supplier.get();
		}
		return instance;
	}
}
