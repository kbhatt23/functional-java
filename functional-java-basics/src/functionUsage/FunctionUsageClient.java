package functionUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionUsageClient {
public static void main(String[] args) {
	//funciton represent a function wothout a class
	//first class citizen
	
	Function<String, Integer> function = (str) -> str.length();
	System.out.println(function.apply("jia shree ram 1"));
	
	System.out.println("non generic way part");
	List<String> names = Arrays.asList("radha","shyam" , "sita", "ram");
	
	System.out.println(map(names, function));
	
	System.out.println("generic way starts");
	
	System.out.println(mapGeneric(names, function));
	
	Function<String, String> newFunction = (str) -> str.toUpperCase();
	
	System.out.println(mapGeneric(names, newFunction));
	
}

  static List<Integer> map(List<String> entries, Function<String, Integer> func) {
	  List<Integer> returnList = new ArrayList<Integer>();
	  
	  for(String entry:entries) {
		  returnList.add(func.apply(entry));
	  }
	  return returnList;
  }
  
  static <T,R> List<R> mapGeneric(List<T> entries, Function<T, R> func) {
	  List<R> returnList = new ArrayList<R>();
	  
	  for(T entry:entries) {
		  returnList.add(func.apply(entry));
	  }
	  return returnList;
  }
}
