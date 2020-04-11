package functionUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorClient {
public static void main(String[] args) {
	UnaryOperator<String> basicOperattor = (str) -> str.toUpperCase();
	UnaryOperator<String> basicOperattor1 = String::toLowerCase;
	
	System.out.println(basicOperattor.apply("jai shree ram"));
	
	System.out.println(basicOperattor1.apply("jai shree ram"));
	
	List<String> names = Arrays.asList("radha","shyam" , "sita", "ram");
	
	List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7);
	
	System.out.println(mapGeneric(names, basicOperattor));
	//saving creation of unary operator
	System.out.println(mapGeneric(ints, (num) -> num*2));
}

//generic method

static <T> List<T> mapGeneric(List<T> entries, UnaryOperator<T> func) {
	  List<T> returnList = new ArrayList<T>();
	  
	  for(T entry:entries) {
		  returnList.add(func.apply(entry));
	  }
	  return returnList;
}
}
