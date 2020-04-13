package functionUsage;

public class RAmFunctionClient {
public static void main(String[] args) {
	RamFunction<String, String> fun1 = (str) -> str+" jai hanuman";
	
	System.out.println(fun1.manipulate("jai shree ram"));
	RamFunction<String, Integer> fun2 = (str) -> str.length();
	
	RamFunction<String, Integer> finalFun = fun1.chainFunction(fun2);
	System.out.println(finalFun.manipulate("jai shree ram"));
	
	//compose
	RamFunction<String, Integer> fun9 = s -> s.length();
	
	RamFunction<String, String> fun10 = s -> s+ " jai hanuman";
	
	RamFunction<String, Integer> composeFinal =fun9.composeFunction(fun10);
	System.out.println(composeFinal.manipulate("jia shree ram"));
	
}
}
