package inheritance;

public class SuperGenericType {
public static void main(String[] args) {
	GenericInterface<Integer> obj1 = new GenericImplementerClass<>();
	obj1.setProperty(23);
	Integer i1 = obj1.returnProperty();
	System.out.println(i1);
	
	GenericInterface<String> obj2 = new GenericImplementerClass<>();
	obj2.setProperty("jai shree ram");
	String i2 = obj2.returnProperty();
	System.out.println(i2);
	
	NonGenericImplementerClass obj3 = new NonGenericImplementerClass();
	obj3.setProperty("jai shree ram from string only");
	System.out.println(obj3.returnProperty());
	
	GenericInterface<Father> fatherObj = new GenericImplementerClass<>();
	fatherObj.setProperty(new Child());
	Father returnobj = fatherObj.returnProperty();
	System.out.println(returnobj);
	
	fatherObj.setProperty(new Father());
	Father returnobj1 = fatherObj.returnProperty();
	System.out.println(returnobj1);
}
}

interface GenericInterface<T>{
	T returnProperty();
	void setProperty(T t);
}

interface NonGenericInterface{
	
}

class Father{
	
}
class Child extends Father
{
	
}

class GenericImplementerClass<T> implements GenericInterface<T>{
	
	private T t;
	@Override
	public T returnProperty(){
		return t;
	}
	@Override
	public void setProperty(T t) {
		this.t=t;
	}
}
//forced type class
//non gneeric implementer has to force type 
//so that clinet do not need to provide that
class NonGenericImplementerClass implements GenericInterface<String>{

	private String property;
	@Override
	public String returnProperty() {
		return property;
	}

	@Override
	public void setProperty(String t) {
		property = t;
	}
	
}

