package inheritance;
//linked list of any type
public class DataNode<E> {
	private E e;
	//next node data is of same type
	private DataNode<?> next;
	//public DataNode(E e, DataNode<E> next) {
	public DataNode(E e, DataNode<? extends Object> next) {
		this.e = e;
		this.next = next;
	}
	@Override
	public String toString() {
		return "DataNode [e=" + e + ", next=" + next + "]";
	}
	
}
