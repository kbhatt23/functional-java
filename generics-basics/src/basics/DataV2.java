package basics;

public class DataV2 {
	//can hold any value
	//but it has 2 issues
	//one devloper can cast it to any bad instance
	//without casting developer can not use actual class methods and states
	private Object data;

	public DataV2(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	//if we want this to be integer
	//we will have to either add new class
	//or new property
}
