package builderpattern.selflearning;

public class RamBuilderClient {
public static void main(String[] args) {
	RamBuilder ramBuilder = new RamBuilder();
	
	ramBuilder
		.addBehaviour((str) -> str.toUpperCase())
		.addBehaviour(str -> str+" jai uma maheshwar")
		.addBehaviour(String::toUpperCase)
		.manipulate("jai shree ram");
		;
		
}

}
