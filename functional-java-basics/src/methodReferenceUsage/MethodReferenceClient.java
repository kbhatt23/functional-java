package methodReferenceUsage;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceClient {
	public static void main(String[] args) {
		Function<String, String> upperCaeFunction = MethodReferenceClient::upperCase;
		
		Supplier<String> supplierFunction = MethodReferenceClient::suplierPro;
		System.out.println(upperCaeFunction.apply("jai shree ram"));
		System.out.println(supplierFunction.get());
		
		Consumer<String> consumeString = MethodReferenceClient::consumerPro;
		consumeString.accept(supplierFunction.get());
	
		//object way
		MethodReferenceClient obj = new MethodReferenceClient();
		Function<String, String> funUsingObj = obj::upperCaseInstance;
		System.out.println(funUsingObj.apply(supplierFunction.get()));
		
		//methoid of APplicable class same method
		//3 rules
		//class assocaited in generoic type of functional interface shud be same
		//method should be taking empty input argument
		//return type of method shud be same
		Function<String, String> funUsingReference = String::toUpperCase;
		System.out.println(funUsingReference.apply("jai radha madhav"));
		
	}

	
	public static String upperCase(String la) {
		return la.toUpperCase();
	}
	
	public  String upperCaseInstance(String la) {
		return la.toUpperCase();
	}

	public static String suplierPro() {
		return "jai shree ram";
	}
	
	public static void consumerPro(String item) {
		System.out.println(item);
	}
}

