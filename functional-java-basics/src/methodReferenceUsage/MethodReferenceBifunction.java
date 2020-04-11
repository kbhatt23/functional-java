package methodReferenceUsage;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class MethodReferenceBifunction {
	public static void main(String[] args) {
		
		BiFunction<String, String, String> bifun = MethodReferenceBifunction::appendStrings;
		
		System.out.println(bifun.apply("sita", "ram"));
		
		BinaryOperator<String> binOper=MethodReferenceBifunction::appendStrings;
		
		System.out.println(binOper.apply("sita", "ram"));
	}

	
	public static String appendStrings(String la , String pa) {
		return la+ " "+ pa;
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

