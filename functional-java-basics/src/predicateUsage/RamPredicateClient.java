package predicateUsage;

public class RamPredicateClient {
public static void main(String[] args) {
	RamPredicate<String> predicate1 = (str) -> str.length() < 5;
	RamPredicate<String> predicate2 = predicate1.not();
	
	System.out.println(predicate1.validate("jai shree ram"));
	
	System.out.println(predicate2.validate("jai shree ram"));

	RamPredicate<String> predicate3 = (str) -> str.contains("ram");
	
	RamPredicate<String> predicate4 = predicate1.and(predicate3);
	
	RamPredicate<String> predicate5 = predicate1.or(predicate3);
	
	System.out.println(predicate4.validate("jai shree ram"));
	
	System.out.println(predicate5.validate("jai shree ram"));
}
}
