package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrderV3 {
	private List<String> items = new ArrayList<String>();
	//private constructor
	//eagerly object for order can not be created
	private OrderV3() {
		
	}
	
	private String deliveryAddress;
	
	public OrderV3 add(String item) {
		items.add(item);
		System.out.println("item "+item+ " added to cart");
		return this;
	}
	
	public OrderV3 deliverAt(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		System.out.println("delivery address set as "+deliveryAddress);
		return this;
	}
	//instead of clinet creating we can pass thorugh a function
	//loose coupling
	//lazy evaluation
	//we are creating order only if needed
	//we create order object only if placeorder is created
	public static void placeOrder(Function<OrderV3, OrderV3> func) {
		//creating new order and passing it to function body present in client
		OrderV3 orderV3 = func.apply(new OrderV3());
		System.out.println("placing order with "+orderV3.items.size()+ " items to address "+orderV3.deliveryAddress);
	}

}
