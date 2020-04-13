package functionUsage;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int number= 10;
		System.out.println(calculaateFactorial(number));
	}

	private static int  calculaateFactorial(int number) {
		if(number == 1) {
			//0! is 1
			//1! is 1
			return 1;
		}
		return number*calculaateFactorial(number -1 );
	}
}
