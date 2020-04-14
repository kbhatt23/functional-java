package strategypattern.selfmade;

public class InputItem implements IInputItem{
	private String inputName;
	private String inputState;
	public InputItem(String inputName, String inputState) {
		super();
		this.inputName = inputName;
		this.inputState = inputState;
	}
	@Override
	public String toString() {
		return "InputItem [inputName=" + inputName + ", inputState=" + inputState + "]";
	}
	@Override
	public String getInputName() {
		return inputName;
	}
	@Override
	public String getInputState() {
		return inputState;
	}
	
}
