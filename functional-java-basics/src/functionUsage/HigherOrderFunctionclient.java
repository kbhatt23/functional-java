package functionUsage;

import java.util.function.Function;
import java.util.function.Supplier;

public class HigherOrderFunctionclient {
	public static void main(String[] args) {
		System.out.println(createAndManipulate(() -> 23, (i) -> i*2).get());
		
		System.out.println(createAndManipulate(() -> "jai shree ram", (str) -> str.toUpperCase()).get());
		
		System.out.println(createAndManipulate(() -> "jai shree ram", (str) -> str.length()).get());
	}

	//max higher order function
	//inputs are functions
	//return type is also funciton
	 static <T,R> Supplier<R> createAndManipulate(Supplier<T> supplier , Function<T, R> manipulator) {
		return () -> {
			T obj = supplier.get();
			return manipulator.apply(obj);
		};
	}
}
