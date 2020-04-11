package lambdaPractise;

//mimicking funcitonal interface just ofor learning purpose
@FunctionalInterface
public interface GenericFunctionInterface<T,R> {

	R manipulate(T t);
}
