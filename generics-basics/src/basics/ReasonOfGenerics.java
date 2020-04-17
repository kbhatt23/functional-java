package basics;

import java.util.ArrayList;

public class ReasonOfGenerics {

	public static void main(String[] args) {
		//java did not force old raw code not to work
		//as lot of code were already writeen on the old way 
		ArrayList rawList = new ArrayList();
		
		//collection can hhold any type of data
		rawList.add("jai shree ram");
		rawList.add(23);
		rawList.add(new Object());
		
		//problem is here
		String one = (String) rawList.get(0);
		int two = (Integer) rawList.get(1);
		Object three =  rawList.get(2);
		System.out.println(one + " " + two + " "+three);
		
	}
}
