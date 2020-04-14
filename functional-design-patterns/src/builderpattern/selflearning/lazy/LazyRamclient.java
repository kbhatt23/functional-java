package builderpattern.selflearning.lazy;

public class LazyRamclient {
public static void main(String[] args) {
	RamBuilder.manipulate((ram) -> 
		ram.addBehaviour((str) -> str.toUpperCase())
		.addBehaviour(str -> str+" jai uma maheshwar")
		.addBehaviour(String::toUpperCase)
	, "jai shree ram");
	
}
}
