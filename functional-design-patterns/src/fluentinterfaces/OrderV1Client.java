package fluentinterfaces;

public class OrderV1Client {
public static void main(String[] args) {
	//as per vankat we must clean this fluffy code
	
	OrderV1 order = new OrderV1();
	order.add("shirt");
	order.add("books");
	order.add("tv");
	order.deliverAt("delhi");
	order.placeOrder();
}
}
