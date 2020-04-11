package functionUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorClient {
	public static void main(String[] args) {
		BinaryOperator<String> binOperator1 = (s1, s2) -> s1 + " " + s2;

		System.out.println(binOperator1.apply("sita", "ram"));

		List<String> namesgoddess = Arrays.asList("radha",  "sita");

		List<String> namesgod =  Arrays.asList("shyam" , "ram");
		
		System.out.println(mapManupulate(namesgoddess, namesgod, binOperator1));
		
		List<Integer> ints1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> ints2 = Arrays.asList(8,9,10,11,12,13,14);
		System.out.println(mapManupulate(ints1, ints2, (num1,num2) -> num1*num2));
	}
	
	static <T> List<T> mapManupulate(List<T> part1, List<T> part2 , BinaryOperator<T> binaryOperator){
		List<T> itemsResult = new ArrayList<T>();
		for(int i=0; i< part1.size() ; i++) {
			T element1 = part1.get(i);
			T element2 = part2.get(i);
			itemsResult.add(binaryOperator.apply(element1, element2));
		}
		return itemsResult;
	}
}
