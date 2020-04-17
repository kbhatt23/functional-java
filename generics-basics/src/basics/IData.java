package basics;

public interface IData<T> {

	public T getData();
	
	public void setData(T data) ;
	
	static <M> void fakeMethodStatic(M data) {
		
	}
	
	default <K> void fakeMethodDefault(K data , T t) {
		
	}
}
