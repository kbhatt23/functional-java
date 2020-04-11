package optionalConcepts;

import java.util.Optional;

public class OptionalFetchValue {
public static void main(String[] args) {
	Optional<Integer> optional = Optional.of(10);
	
	//bad way
	System.out.println(optional.get());
	
	Optional<Integer> optionalNullable = Optional.ofNullable(null);
	//returns optional of emtpy
	//wont give null pointer now
	
	//bad way
	//no such element exception
	//optionalNullable.get();
	
	//better
	System.out.println(optionalNullable.isPresent() ? optionalNullable.get() : 0);
	System.out.println(optional.isPresent() ? optional.get() : 0);
	
	//better appriach
	int valInt = optional.orElse(0);
	
	//evne better
	int valIntSupplier = optional.orElseGet(() -> 0);
	System.out.println("average : "+valInt + " better performace: "+valIntSupplier);
	
	//better appriach
		int valIntnull = optionalNullable.orElse(0);
		
		//evne better
		//in orElse get it is lazily evaluate
		//in or lese it is eager
		int valIntSuppliernull = optionalNullable.orElseGet(() -> 0);
		System.out.println("average : "+valIntnull + " better performace: "+valIntSuppliernull);
		
		//exception case : no default
		//System.out.println(optionalNullable.orElseThrow(RuntimeException::new));
		System.out.println(optional.orElseThrow(RuntimeException::new));
}
}
