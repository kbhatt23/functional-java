package functionUsage;

import java.util.Objects;

public interface RamFunction<T,R> {

	R manipulate(T t);
	
	//chainng
	default <S> RamFunction<T, S> chainFunction(RamFunction<R, S> chainFunction){
		Objects.requireNonNull(chainFunction);
		return (T t) -> {
			R result1 = manipulate(t);
			return chainFunction.manipulate(result1);
		};
	}
	
	default <S> RamFunction<S, R> composeFunction(RamFunction<S, T> beforeFunction){
		Objects.requireNonNull(beforeFunction);
		return (S s) -> {
			T result1 = beforeFunction.manipulate(s);
			return manipulate(result1);
		};
	}
}
