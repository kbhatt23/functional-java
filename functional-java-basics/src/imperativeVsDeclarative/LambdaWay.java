package imperativeVsDeclarative;

import utils.MultiThreadingUtils;

public class LambdaWay {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() ->  {
			//simulation
			MultiThreadingUtils.sleepThread(1000);
			System.out.println("jai shree ram from thread "+Thread.currentThread().getName());
		});
		t1.start();
		System.out.println("Task completed by "+Thread.currentThread().getName());
	}

}
