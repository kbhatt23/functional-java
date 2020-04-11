package optionalConcepts;

import java.util.Optional;

public class OptionalOperators {

	public static void main(String[] args) {

		//map
		Optional<String> raghav = Optional.of("jai shree ram");
		Optional<String> converted = raghav.map(String::toUpperCase);
		System.out.println(converted.get());
		
		//flatmap: used when it return Optional<Optional>
	String val=	raghav.flatMap(str -> Optional.of(str))
			.orElseGet(() -> "jai shree radhe")
		;//returns optional<optional>
	
	//in case not useing flatmap
	String val1=	raghav.map(str -> Optional.of(str))
						.get()
						//need to call .get method twice
						//as return type is optional<optional<string>>
						.get();
	System.out.println("val1 "+val1 );
	
	System.out.println(val);
	//.of can not take null -> acasese null pointer exception
	//Optional<String> emptyOptional = Optional.ofNullable(null);
	//String emptyCal =emptyOptional
	//	.map(String::toUpperCase)
		//.get()
		//;
	//System.out.println(emptyCal);
	
	String emptyCal =raghav
		.map(String::toUpperCase)
		.get()
		;
	System.out.println(emptyCal);
	}

}
