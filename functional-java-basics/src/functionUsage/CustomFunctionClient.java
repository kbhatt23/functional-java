package functionUsage;

public class CustomFunctionClient {
public static void main(String[] args) {
	CustomFunction< String, String> fun1 = (str) -> str.toUpperCase();
	
	CustomFunction<String, String> fun2 = (str) -> str+" jai hanuman";
	
	CustomFunction<String, Integer> fun3 = (str) -> str.length();
	
	CustomFunction<String, Integer> complete= fun1.chain(fun2).chain(fun3);
	
	System.out.println(complete.manipulate("jai shree ram"));
	
	System.out.println("compose starts");
	CustomFunction<String, String> la1 = (str) -> str+" jai hanuman";
	CustomFunction<Integer, String> la2 = (num) -> " say "+num+" times";
	
	CustomFunction<Integer, String> finalCompose = la1.compose(la2);
	
	System.out.println(finalCompose.manipulate(10));
	
}
}
