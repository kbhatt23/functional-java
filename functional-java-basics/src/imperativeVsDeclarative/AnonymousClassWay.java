package imperativeVsDeclarative;

import utils.MultiThreadingUtils;

public class AnonymousClassWay {
	public static void main(String[] args) {
		Runnable anonymous = new Runnable() {
			public void run() {
				//simulation
				MultiThreadingUtils.sleepThread(1000);
				System.out.println("jai shree ram from thread "+Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(anonymous);
		t1.start();
		System.out.println("Task completed by "+Thread.currentThread().getName());
	}

}
