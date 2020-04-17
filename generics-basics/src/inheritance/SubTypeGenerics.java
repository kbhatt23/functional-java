package inheritance;

public class SubTypeGenerics {
	public static void main(String[] args) {
		
	
	RelationShipContent<SuperType,SuperType> mainObj1 = new RelationShipContent<>(new SuperType(), new SuperType());
	
	RelationShipContent<SuperType,SubType> mainObj2 = new RelationShipContent<>(new SuperType(), new SubType());
	System.out.println("mainObj1 "+mainObj1);
	System.out.println("mainObj2 "+mainObj2);
	
	RelationShipContent<Object,SuperType> mainObj3 = new RelationShipContent<>(new Object(),new SubType());
	System.out.println("mainObj3 "+mainObj3);
	}	
}

class SuperType{
	@Override
	public String toString() {
		return "jai shree ram from super type " + hashCode();
	}
}

class SubType extends SuperType{
	@Override
	public String toString() {
		return "jai shree ram from sub type "+hashCode();
	}
}

class RelationShipContent<S,C extends S>{
	private S superObj;
	private C childObj;
	public RelationShipContent(S superObj, C childObj) {
		super();
		this.superObj = superObj;
		this.childObj = childObj;
	}
	@Override
	public String toString() {
		return "RelationShipContent [superObj=" + superObj + ", childObj=" + childObj + "]";
	}
	
	
	
}
