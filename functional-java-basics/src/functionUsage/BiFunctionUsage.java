package functionUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionUsage {
public static void main(String[] args) {
	BiFunction<String, String, String> biFun1 = (s1,s2) -> s1+" "+s2;
	
	System.out.println(biFun1.apply("sia", "ram"));
	List<String> names = Arrays.asList("radha","shyam" , "sita", "ram");
	
	BiFunction<String, Integer, String> biFunComplex = (s1,s2) -> s1+" "+s2;
	List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7);
	System.out.println(mapGeneric(names, ints, biFunComplex));
}

//generic method
//flatmpaping example
//merging

static <T,U,R> List<R> mapGeneric(List<T> entries1, List<U> entries2, BiFunction<T, U, R> func) {
	  List<R> returnList = new ArrayList<R>();
	  
	  for(int i=0 ; i< entries1.size() ; i++) {
		  T entry1Element = entries1.get(i);
		  U entry2Element = entries2.get(i);
		  returnList.add(func.apply(entry1Element, entry2Element));
		  
	  }
	  return returnList;
}

}
