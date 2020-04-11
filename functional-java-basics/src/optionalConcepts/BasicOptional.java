package optionalConcepts;

import java.util.Optional;

public class BasicOptional {

	public static void main(String[] args) {
		String me = "shree ram";
		int la = Optional.ofNullable(me)
				.filter(ka -> ka.length() > 8)
				.map(item -> item.length())
				.orElse(11);
		System.out.println(la);
		//we can not use null value in optiona.of -> throw null pointer exception
		//System.out.println(Optional.of(null));
		
		//nullable method retrun empty optional in case of null value
		System.out.println(Optional.ofNullable(null));
	
		findLogicalName("radha krishna")
			.map(String::toUpperCase)
			.ifPresent(System.out::println);
		
	}
	
	static Optional<String> findLogicalName(String name){
		Optional<String> emptyOptional = Optional.empty();
		if(name.contains("krishna")) {
			return Optional.of(name);
		}else {
			//empty optional
			return emptyOptional;
		}
	}

}
