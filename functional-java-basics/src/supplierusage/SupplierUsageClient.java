package supplierusage;

import java.util.function.Supplier;

public class SupplierUsageClient {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "jai shree ram";
		
		System.out.println(supplier.get());
		
		//Random Number Supplier
		Supplier<Double> supplierNum = () -> Math.random();
		
		System.out.println(supplierNum.get());
	}
}
