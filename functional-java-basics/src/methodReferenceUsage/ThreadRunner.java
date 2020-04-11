package methodReferenceUsage;

import java.util.function.Function;

public class ThreadRunner {
public static void main(String[] args) {
	Function<Runnable, Thread> threadGenerator = Thread::new;
	
	Thread t1 = threadGenerator.apply(() -> System.out.println("executing task 1"));
	t1.start();
	
	Runnable r2 = () -> System.out.println("executing task 2");
	Thread t2 = threadGenerator.apply(r2);
	t2.start();
}
}
