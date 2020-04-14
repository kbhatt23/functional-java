package strategypattern.selfmade;

import java.util.function.Function;

public class KanishkStrategyClient {

	public static void main(String[] args) {
		LogicUtil util = new LogicUtil();
		
		Function<IInputItem, IOutputItem> strategy1 = (input) -> new OutputItem(input.getInputName(), input.getInputName()+ " modified");
		IOutputItem output = util.manipulate(new InputItem("kbhatt23", "input state"), strategy1);
		System.out.println(output);
		
		Function<IInputItem, IOutputItem> strategy2 = (input) -> new OutputItem(input.getInputName(), input.getInputName()+ " says jai shree ram");
		IOutputItem output2 = util.manipulate(new InputItem("kbhatt23", "input state"), strategy2);
		System.out.println(output2);
	}
}
