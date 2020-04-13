package lambdadesignpatternsbyvenkat;

import java.util.function.Function;

public class DecoratorUsingLambda {

	public static void main(String[] args) {
		//one behaviour
		Function<Integer, Integer> increment = (e) -> e+1;
		Function<Integer, Integer> doubled = (e) -> e*2;
		
		print(23, increment);
		
		print(23, doubled);
		//decorating multiple behaviour
		print(23, increment.andThen(doubled));
	}
	
	static void print(int val , Function<Integer, Integer> func) {
		System.out.println("calculated value "+func.apply(val));
	}
}
