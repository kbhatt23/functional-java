package imperativeVsDeclarative;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class LambdaLexicalScope {
public static void main(String[] args) {
	
	String stringProp = "jai shree ram";
	int intPoperty =108;
	Integer wrapperObject = 23;
	Car car  =new Car("O123434", "radha krishna");
	List<Car> cars = Arrays.asList(car,car);
	
	//IntStream.range(1, 5)
		//	.forEach(i -> cars.add(new Car("car num "+i, "krishna "+i)));
	
	Function<String, String> fun = (str) -> {
		//effectively final
		//stringProp="jai uma maheshwar";
		//stringProp= new String("kala");
		//intPoperty=99;
		//wrapperObject=99;
		
		//can not recrete with same name
		//Integer wrapperObject= 99;
		//car=new Car("fake12323", "not possible");
		//manipulation of object is poosible
		//can not assig new object
		car.setOwnerName("lakshami narayan");
		
		//arraylist addition is also poosible
		//cars.add(new Car("MAHESH12323", "yamaraj"));
		return "keshav bhakt kannu";
	};
	//lazy loading
	fun.apply("jai shree ganesh");
	
	System.out.println(cars.size());
}
}
