package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class CollectionSpliteratorBehaviour {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("radha","shyam" , "sita", "ram");
		
		Spliterator<String> spliterator =items.stream().spliterator();
		
		System.out.println(spliterator.characteristics());
		
		//array list have 3 characterstics
		//ordered
		//sized
		//subsized : size is present even in splitting in fork join to run in parallel
		System.out.println(Integer.bitCount(spliterator.characteristics()));
		
		System.out.println(spliterator.hasCharacteristics(Spliterator.ORDERED ));
		
		System.out.println(spliterator.hasCharacteristics(Spliterator.SIZED ));
		
		System.out.println(spliterator.hasCharacteristics(Spliterator.SUBSIZED ));
		
		System.out.println(spliterator.hasCharacteristics(Spliterator.SORTED ));
		System.out.println(spliterator.hasCharacteristics(Spliterator.IMMUTABLE ));
		System.out.println(spliterator.hasCharacteristics(Spliterator.DISTINCT ));
	}
}
