package functionUsage;

import java.util.function.Function;

public class CurryingExample {

	public static void main(String[] args) {
		Function<String, Function<String, String>> curryingFunction =
				
				str1 -> str2 -> str1+" "+str2;
		
		System.out.println(curryingFunction.apply("jai shree ram").apply("jai hanuman"));
		
		//the functionaooyt is same as a[ppending of two string
		//but we can fix first String input
		//second one can be passed by user as part of lazy evaluation
		Function<String, String> firstLevel = curryingFunction.apply("jai shree ram");
		
		System.out.println(firstLevel.apply("jia hanuman"));
		
		System.out.println(firstLevel.apply("jai lakshman"));
		
		System.out.println(firstLevel.apply("jia sugreev"));
	}
}
