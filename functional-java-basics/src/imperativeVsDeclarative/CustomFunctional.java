package imperativeVsDeclarative;

public class CustomFunctional {

	public static void main(String[] args) {
		CustomFunctionalInterface lambda1 = () -> System.out.println("jai sita ram");
		//loose coupling
		//like we do in strategy pattern
		//dependency inversion
		//client [roviding implementaiton
		//alllows open closed principle
		
		CustomFunctional obj = new CustomFunctional();
		//passing the methoid as input to another method
		//function as first class citizen
		obj.executeLambda(lambda1);
		
		//extendion without modification
		CustomFunctionalInterface lambda2 = () -> System.out.println("jai ramaduta hanuman");
		obj.executeLambda(lambda2);
	}
	//open closed principle
	//loose coupling
	public void executeLambda(CustomFunctionalInterface customFunctionalInterface) {
		customFunctionalInterface.execute();
	}
}

//annotation enforces interface to only have one abstract method
//if we add mpre than one abstract method it wont compile annotationw will break
@FunctionalInterface
interface CustomFunctionalInterface{
	//only one abstract method
	void execute();
	
	//void execute1();
}
