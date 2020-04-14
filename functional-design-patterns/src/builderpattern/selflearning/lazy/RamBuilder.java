package builderpattern.selflearning.lazy;

import java.util.function.Function;

public class RamBuilder {
	private RamBuilder() {
	}
	//default is no modification operation
	private Function<String, String> operations = Function.identity();
	
	public RamBuilder addBehaviour(Function<String, String> inOperation) {
		operations = operations.andThen(inOperation);
		return this;
	}
	
	public static void manipulate(Function<RamBuilder, RamBuilder> func,String input) {
		RamBuilder ramBuilder = func.apply(new RamBuilder());
		System.out.println("output is "+ramBuilder.operations.apply(input) + " for input "+input);
	}
	

}
