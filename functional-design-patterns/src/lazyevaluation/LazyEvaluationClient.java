package lazyevaluation;

public class LazyEvaluationClient {

	public static void main(String[] args) {
		int num = 5;
		
		if(num > 4 && compute(num) > 8) {
			System.out.println("step 1 "+compute(num));
		}else {
			System.out.println("step 2");
		}
		
		System.out.println("==================good way starts======================");
		
		Lazy<Integer> lazyInt = new Lazy<Integer>(() -> compute(num));
		
		if(num > 4 && lazyInt.getInstance() > 8) {
			System.out.println("step 1 "+lazyInt.getInstance());
		}else {
			System.out.println("step 2");
		}
	}
	
	static int compute(int num) {
		System.out.println("computation called for "+num);
		return num*2;
	}
}
