package strategypattern.selfmade;

import java.util.function.Function;

public class LogicUtil {
	
	//consumer of strategy
	public IOutputItem manipulate(IInputItem item , Function<IInputItem,IOutputItem> strategy) {
		System.out.println("manipulation starts for "+item);
		return strategy.apply(item);
	}

}
