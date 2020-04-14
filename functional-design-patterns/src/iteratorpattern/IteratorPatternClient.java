package iteratorpattern;

public class IteratorPatternClient {

	public static void main(String[] args) {
		Notification n1 = new Notification("hanuman", "jai shree ram");
		Notification n2 = new Notification("lakshman", "jai shree ram");
		Notification n3 = new Notification("sugreev", "jai shree ram");
		Notification n4 = new Notification("angad", "jai shree ram");
		
		Collection col = new NotificationCollection();
		col.addElement(n1);
		col.addElement(n2);
		col.addElement(n3);
		col.addElement(n4);
		
		col.forEach(System.out::println);
	}
}
