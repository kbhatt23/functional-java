package fluentinterfaces;

public class OrderV3Client {
public static void main(String[] args) {
	OrderV3.placeOrder((order) -> order.add("shirt")
									   .add("books")
									   .add("tv")
									   .deliverAt("delhi"));
}
}
