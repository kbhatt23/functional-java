package inheritance;

import java.util.ArrayList;
import java.util.List;

public class GenericRuntimeExceptions {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("jai shree ram");
		stringList.add("jai radha madhav");
		manipulate(stringList);
		
		
		for(String str: stringList) {
			System.out.println(str);
		}
	}
	
	public static void manipulate(List genericList) {
		genericList.add(23);
	}
}
