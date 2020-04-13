package lambdadesignpatternsbyvenkat;

public class LazySupplier {

	public static void main(String[] args) {
		
		badWay();
		
		goodWay();
	}

	private static void badWay() {
		System.out.println("bad way starts");
		int x = 4;
		if(x < 5 && compute(x) < 10) {
			//compute called twice
			System.out.println("step 1 "+compute(x));
		}else {
			System.out.println("step 2");
		}
	}
	
	private static void goodWay() {
		System.out.println("good way starts");
		int x = 5;
		//int temp = compute(x);
		//lazy is aadded so that actual compuatation method is called only once always
		Lazy<Integer> lazyCompute = new Lazy<Integer>(()-> compute(x));
		if(x < 5 && lazyCompute.get() < 10) {
			//compute called twice
			System.out.println("step 1 "+lazyCompute.get());
		}else {
			System.out.println("step 2");
		}
	}
	
	static int compute(int x) {
		System.out.println("compute called");
		return x*2;
	}
}
