package wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericsVsNongenericCollections {
public static void main(String[] args) {
	List rawList = new ArrayList();
	
	rawList.add("jia shree ram");
	rawList.add(23);
	rawList.add(new Object());
	manipulate(rawList);
}
public static void manipulate(List<String> items) {
	items.add("jai pavan putra");
	//items.add(32);
	//class case exception
	for(String str : items) {
		
		System.out.println(str);
	}
}
}
