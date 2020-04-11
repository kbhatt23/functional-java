package imperativeVsDeclarative;

import utils.MultiThreadingUtils;

public class ImperativeClient {
public static void main(String[] args) {
	MyRunnable old = new MyRunnable();
	Thread t1 = new Thread(old);
	t1.start();
	System.out.println("current thread done "+Thread.currentThread().getName());
}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		//simulation
		MultiThreadingUtils.sleepThread(1000);
		System.out.println("jai shree ram from thread "+Thread.currentThread().getName());
	}
	
}
