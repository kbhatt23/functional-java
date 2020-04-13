package predicateUsage;

public class CustomPredicateClient {
public static void main(String[] args) {
	CustomPredicate<String> predicate1 = (str) -> str.length()>5;
	
	CustomPredicate<String> predicate2 = (str) -> str.contains("hanuman");
	
	CustomPredicate<String> predicate3 = (str) -> str.contains("ram");
	
	CustomPredicate<String> predicate4 = predicate1.and(predicate2).and(predicate3);
	
	System.out.println(predicate4.validate("jai shree ram and hanuman"));
}
}
