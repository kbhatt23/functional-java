package iteratorpattern;

import java.util.function.Consumer;

public interface Collection {

	//hiding the actualy pbject type
	void addElement(Object element);
	
	//hides internal class as object is extremely generic
	void forEach(Consumer<Object> consumer);
}
