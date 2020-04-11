package optionalConcepts;

import java.util.Optional;

public class OptionalAdvancedOperators {
public static void main(String[] args) {
	
	Optional<String> optionalVal = Optional.of("jai radha madhav");
	
	optionalVal.ifPresent(System.out::println);
	
	Optional<String> emptyOptional = Optional.empty();
	emptyOptional
			.ifPresent(System.out::println);
	
	System.out.println(emptyOptional.equals(optionalVal));
	
	System.out.println(emptyOptional.equals(Optional.empty()));
	
	System.out.println(emptyOptional.equals(Optional.ofNullable(null)));
	
	//equals chek for instance of optional
	//if both are empty -> returns true
	//take value of each optional and use .equals method of individual class to check
	System.out.println(optionalVal.equals(Optional.of("jai radha madhav")));
	
}
}
