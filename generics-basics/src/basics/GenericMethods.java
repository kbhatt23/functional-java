package basics;

public class GenericMethods {
	public static void main(String[] args) {
		Integer a = 108;
		concat(a);
		String str = "hanuman";
		concat(str);
		
		GenericMethods obj = new GenericMethods();
		obj.concatInstance(a);
		obj.concatInstance(str);
	}

	//static methods do not have acces to class level geneic type reference
	//instance method have access to class level generic type reference
	private static <T> void concat(T t) {
		System.out.println("jai shree ram from "+t);
	}
	
	private  <T> void concatInstance(T t) {
		System.out.println("jai shree ram from "+t);
	}
	
}
