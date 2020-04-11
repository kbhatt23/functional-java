package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		//sum of even number from 0-100
		//imperative style
		int sumOfEvenNumbers = 0;
		//external iterator: we need to handle logic
		//more focus on how to do
		for(int i=0 ;i <= 100 ; i++) {
			//even check
			if(i % 2 == 0) {
				sumOfEvenNumbers+=i;
			}
		}
		System.out.println("imperative sum "+sumOfEvenNumbers);
		
		//declarative -> functional programming is part/subset of declarative programming
		
		System.out.println("declarative sum "+IntStream.rangeClosed(0, 100)
				 .filter(item ->  item % 2 == 0)
				 .sum());
		
	}
}
