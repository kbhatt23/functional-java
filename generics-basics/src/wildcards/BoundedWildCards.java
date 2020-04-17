package wildcards;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCards {
public static void main(String[] args) {
	//upper bounder wild card
	List<?  extends Number> numerList = new ArrayList<Integer>();
	//immutable
	//numerList.add(23);
	
	
	List<?  super Integer> numerListSuper = new ArrayList<Number>();
	//will be allowed ot add eemnt
	//but only integer
	numerListSuper.add(23);
} 

}
