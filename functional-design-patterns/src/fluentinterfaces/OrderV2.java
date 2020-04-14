package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;

public class OrderV2 {
	private List<String> items = new ArrayList<String>();
	
	private String deliveryAddress;
	
	public OrderV2 add(String item) {
		items.add(item);
		System.out.println("item "+item+ " added to cart");
		return this;
	}
	
	public OrderV2 deliverAt(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		System.out.println("delivery address set as "+deliveryAddress);
		return this;
	}
	//terminal operation
	public void placeOrder() {
		System.out.println("placing order with "+items.size()+ " items to address "+deliveryAddress);
		
	}

}
