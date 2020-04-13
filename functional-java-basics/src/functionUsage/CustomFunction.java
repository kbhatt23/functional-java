package functionUsage;

@FunctionalInterface
public interface CustomFunction<T,R> {

	R manipulate(T t);
	
	//chainign emthod
	//always used after creating object
	//hence default
	default <S> CustomFunction<T, S> chain(CustomFunction<R, S> chainFunction){
		return (T t) -> {
			return chainFunction.manipulate(manipulate(t));
		};
	
	}
	//compose
	//compose gets called in reverse order
	default <S> CustomFunction<S, R> compose(CustomFunction<S, T> chainFunction){
		return (S s) -> {
			return manipulate(chainFunction.manipulate(s));
		};
	
	}
}
