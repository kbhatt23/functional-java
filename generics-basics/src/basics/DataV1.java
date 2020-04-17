package basics;

public class DataV1 {

	private String data;
	
	//if we want this to be integer
	//we will have to either add new class
	//or new property
	 
	private int intData;
	
	public DataV1(int intData) {
		super();
		this.intData = intData;
	}

	public DataV1(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getIntData() {
		return intData;
	}

	public void setIntData(int intData) {
		this.intData = intData;
	}
}
