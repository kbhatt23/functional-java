package basics;

public class DataV3<T> implements IData<T>{
	//can hold any value
	//but it has 2 issues
	//one devloper can cast it to any bad instance
	//without casting developer can not use actual class methods and states
	private T data;
	public DataV3(T data) {
		super();
		this.data = data;
	}
	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}
	
	//if we want this to be integer
	//we will have to either add new class
	//or new property
}
	//static part of class/interface can not use Generic data type
//only instance level things can access it
interface lapela<M>{
	//
	//static <M> void inst(M t);
	
	default void ins1(M t) {
		
	}
}
	
