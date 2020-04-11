package lambdaPractise;

public class GenericInterfaceClient {
public static void main(String[] args) {
	GenericFunctionInterface<String, Integer> l1 = (str) -> str.length();
	System.out.println(l1.manipulate("jai shree ram 1"));
	//method reference part1 
	GenericFunctionInterface<String, Integer> l2 = GenericInterfaceClient::toLengthOfString;
	System.out.println(l2.manipulate("jai shree ram 2"));
	
	//method reference part 2
	GenericInterfaceClient obj = new GenericInterfaceClient();
	GenericFunctionInterface<String, Integer> l3 = obj::LengthOfString;
	System.out.println(l3.manipulate("jai shree ram 3"));
	
	//method reference part 3
		GenericFunctionInterface<String, Integer> l4 = String::length;
		System.out.println(l4.manipulate("jai shree ram 4"));
		
	//genric parts
		
	GenericFunctionInterface<String, String> l11 = (str) -> str.toUpperCase();
	System.out.println(l11.manipulate("jai shree ram 11"));
}

public static int toLengthOfString(String s) {
	return s.length();
}

public  int LengthOfString(String s) {
	return s.length();
}
}
