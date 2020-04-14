package iteratorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NotificationCollection implements Collection{
	List<Object> elements = new ArrayList<Object>();

	@Override
	public void addElement(Object element) {
		elements.add(element);
		
	}

	@Override
	public void forEach(Consumer<Object> consumer) {

		elements.forEach(consumer);
	}

	
	//fake methods to learn generics
	
	void function1() {
		List<Notification> notificastions = Arrays.asList(new Notification("prop1","jai shree ram"),
				new Notification("prop2","jai shree ram"));
		
		function2(notificastions);
		function3(notificastions);
	}
	
	void function2(List<? extends Object> items) {
		//wont be able to add
		//comppilation error
		//items.add(new Object());
	}
	
	void function3(List<? super Notification> items) {
		//will be able to add only notification
		items.add(new Notification("ram", "jai sita ram"));
	}
}
