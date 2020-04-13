package lambdadesignpatternsbyvenkat;

import java.util.function.Supplier;

public class Lazy<T> {
	private T instance;
	public T get() {
		if(instance == null) {
			instance = supplier.get();
		}
		return instance;
	}
	private Supplier<T> supplier ;
	
	public Lazy(Supplier<T> supplier) {
		this.supplier = supplier;
	}
}
