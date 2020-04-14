package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;

public class OrderV1 {
	private List<String> items = new ArrayList<String>();
	
	private String deliveryAddress;
	
	public void add(String item) {
		items.add(item);
		System.out.println("item "+item+ " added to cart");
	}
	
	public void deliverAt(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		System.out.println("delivery address set as "+deliveryAddress);
	}
	
	public void placeOrder() {
		System.out.println("placing order with "+items.size()+ " items to address "+deliveryAddress);
	}

}
