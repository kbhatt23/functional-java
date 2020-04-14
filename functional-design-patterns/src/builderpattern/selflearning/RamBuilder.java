package builderpattern.selflearning;

import java.util.function.Function;

public class RamBuilder {
	//default is no modification operation
	private Function<String, String> operations = Function.identity();
	
	public RamBuilder addBehaviour(Function<String, String> inOperation) {
		operations = operations.andThen(inOperation);
		return this;
	}
	
	public void manipulate(String input) {
		System.out.println("output is "+operations.apply(input) + " for input "+input);
	}
	

}
