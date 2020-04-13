package predicateUsage;

public interface CustomPredicate<T> {

	boolean validate(T t);
	
	default CustomPredicate<T> and(CustomPredicate<T> anotherPRedicate){
		
		return (T t) -> {
			return validate(t) && anotherPRedicate.validate(t);
		};
	}
	
default CustomPredicate<T> or(CustomPredicate<T> anotherPRedicate){
		
		return (T t) -> {
			return validate(t) || anotherPRedicate.validate(t);
		};
	}

default CustomPredicate<T> not(){
	
	return (T t) -> {
		return !validate(t) ;
	};
}
}
