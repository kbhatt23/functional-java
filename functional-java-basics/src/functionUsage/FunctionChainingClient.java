package functionUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionChainingClient {
public static void main(String[] args) {
	List<String> names = Arrays.asList("radha","shyam" , "sita", "ram");
	
	Function<String, Integer> functio2 = (str) -> str.length();
	
	Function<String, String> function1 = (str) -> str.toUpperCase();
	
	Function<String, Integer> chained = function1.andThen(functio2);
	
	System.out.println(chained.apply("jai shree ram"));
	
	System.out.println("list in generic way");
	System.out.println(mapGeneric(names, chained));
} 

static <T,R> List<R> mapGeneric(List<T> entries, Function<T, R> func) {
	  List<R> returnList = new ArrayList<R>();
	  
	  for(T entry:entries) {
		  returnList.add(func.apply(entry));
	  }
	  return returnList;
}

}
