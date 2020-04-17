package inheritance;

import java.util.ArrayList;
import java.util.List;

public class BadInheritance {
public static void main(String[] args) {
	//below works
	//formula:
	//superclass<T> ka = new ChidlClass<T> works
	//but SuperClass<T> ka = new ChildClass<subChild of T> wont work
	IGenericInterface<Number> kala = new GenericImpl<Number>();
	//below wont work
	//IGenericInterface<Number> kala1 = new GenericImpl<Integer>();
	//but below works
	IGenericInterface<? extends Number> kala1 = new GenericImpl<Integer>();
	kala1.test();
	
}
}

interface INonGenericInterface{
	
}
interface IGenericInterface<T>{
	void test();
	
}
interface IbadInterface<T> extends IGenericInterface<T>{
	
}

//below wont work
//class GenericImpl<T> implements IGenericInterface<T>, IbadInterface{
class GenericImpl<T> implements IGenericInterface<T>, IbadInterface<T>{
	public void test() {
		System.out.println("jai shree ram");
	}
}

class NonGenericImpl implements IGenericInterface<Integer>{

	@Override
	public void test() {
		System.out.println("jai radh madhav");
	}
	
}