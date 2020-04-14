package strategypattern.selfmade;

public class OutputItem implements IOutputItem{

	private String outputName;
	private String outputState;
	public OutputItem(String outputName, String outputState) {
		super();
		this.outputName = outputName;
		this.outputState = outputState;
	}
	@Override
	public String toString() {
		return "OutputItem [outputName=" + outputName + ", outputState=" + outputState + "]";
	}
	
}
