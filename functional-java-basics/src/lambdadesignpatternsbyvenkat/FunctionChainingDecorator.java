package lambdadesignpatternsbyvenkat;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionChainingDecorator {
	public static void main(String[] args) {
		
	
	//default case
	Manipulator manipulator = new Manipulator(Function.identity());
	System.out.println("default: "+manipulator.processOperations(23));
	
	//complex
	
	Manipulator manipulatorComplex = new Manipulator((e) -> e+1 , e -> e*2 , e-> e+9);
	System.out.println("complex: "+manipulatorComplex.processOperations(23));
	}
	
}

class Manipulator{
	private Function<Integer,Integer> operations;
	//input can be 0 to n operations or manipulations
	public Manipulator(Function<Integer, Integer>... operationsList ) {
		//default : in case no operation is propvide
		//it will return thesame value as provided in input
		Function<Integer, Integer> chainedOperations = Stream.of(operationsList)
		       .reduce(Function.identity(), (result, currentFunction) -> result.andThen(currentFunction));
				this.operations = chainedOperations;
	}
	
	public int processOperations(int n) {
		return operations.apply(n);
	}
}
