package imperativeVsDeclarative;

public class AbstractClassWay {

	public static void main(String[] args) {
		SingleMethodAbstractClass singleMethodAbstractClass = 
				() -> System.out.println("jai shree ram");
				
				singleMethodAbstractClass.execute();
	}
}
	//do not work for abstract classes with one absstract method
	/* abstract class */ interface SingleMethodAbstractClass{
	abstract void execute();
}
