package lambdaPractise;

import utils.MultiThreadingUtils;

public class LambdaPractiseClient {
public static void main(String[] args) {
	LambaWithNoReturntype l1 = () -> System.out.println("jai shree ram 1");
	l1.printName();
	
	//single line statement returns on its own in lambda
	LambaWithReturntype l2 = () -> "jai shree ram 2";
		System.out.println(l2.printName());
	
	//multiple line statement need returns in lambda
		LambaWithReturntype l3 = () ->{
			//simulating the logic to calculate the return object
			MultiThreadingUtils.sleepThread(100);
			return "jai shree ram 3";
		};
		System.out.println(l3.printName());
	
		LambaWithParamters l4 = (str) -> str.toUpperCase();
		System.out.println(l4.printName("jai shree ram 4"));
		
		LambaWithParamters l5 = (str) -> {
			MultiThreadingUtils.sleepThread(100);
			return str.toUpperCase();
		};
		System.out.println(l5.printName("jai shree ram 5"));
		
		LambaWithNoReturntype2 l6 = (a,b) -> System.out.println(a+ " " + b);
		l6.printName("jai shree ram", "jai ramaduta hanuman");
		
		LambaWithParamters l7 = String::toUpperCase;
		System.out.println(l7.printName("jia shree ram"));
	
}
}
