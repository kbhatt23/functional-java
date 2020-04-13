package imperativeVsDeclarative;

import java.util.function.Function;

public class Functionclosure {
public static void main(String[] args) {
	//free variables
	//variables defined outside lambda bidy but are used in lambda body are called free variables
	String message = "jai shree ram";
	
	//free variable should be effectively final
	//with below line it will loose auto final potential
	//message = "jai shree krishna";
	
	//variable message is present here , hence it worked
	Function<String, String> fun = (str) -> str+message;
	
	System.out.println(fun.apply("pavan putra says "));
	
	
}

static void printFunction(Function<String, String> fun) {
	//variable is out of scope
	//however it is kept in closure of lambda function
	//stored in JVM and passed thpugh
	System.out.println(fun.apply("pavan putra says "));
}
}
