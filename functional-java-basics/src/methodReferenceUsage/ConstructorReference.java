package methodReferenceUsage;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

	public static void main(String[] args) {
		Supplier<ConstructorReference> supplierObj1 = ConstructorReference::new;
		System.out.println(supplierObj1.get());
		
		Function<String, ConstructorReference> funcConstructor = ConstructorReference::new;
		System.out.println(funcConstructor.apply("jia shree ram"));
		
		BiFunction<String, String, ConstructorReference> biFuncConstructor = ConstructorReference::new;
		System.out.println(biFuncConstructor.apply("jai shree ram", "jai radhe shyam"));
	}
	
	private String s1;
	private String s2;
	ConstructorReference(){
		
	}
	ConstructorReference(String s){
		this.s1=s;
	}
	ConstructorReference(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public String toString() {
		return "ConstructorReference [s1=" + s1 + ", s2=" + s2 + "]";
	}
}
