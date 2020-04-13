package predicateUsage;
@FunctionalInterface
public interface RamPredicate<T> {

	boolean validate(T t);
	
	//and chainign
	default RamPredicate<T> and(RamPredicate<T> anotherPredicate){
		return (T t) -> {
			return validate(t) &&  anotherPredicate.validate(t);
		};
	}
	
	default RamPredicate<T> or(RamPredicate<T> anotherPredicate){
		return (T t) -> {
			return validate(t) ||  anotherPredicate.validate(t);
		};
	}
	
	default RamPredicate<T> not(){
		return (T t) -> {
			return !validate(t);
		};
	}
}
