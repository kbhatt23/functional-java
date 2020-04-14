package fluentinterfaces;

public class OrderV2Client {
public static void main(String[] args) {
	//as per vankat we must clean this fluffy code
	
	//this is good
	//but it is eager in creating order
	//in case we want to lazily create order
	OrderV2 order = new OrderV2();
	order.add("shirt")
		 .add("books")
		 .add("tv")
		 .deliverAt("delhi")
		 //waht if palceorder is never called
		 //without terminal operation order shoudl not get created at all
		 //lets go with orderv3 implemenation
		 .placeOrder();
}
}
