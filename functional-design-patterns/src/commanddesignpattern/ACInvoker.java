package commanddesignpattern;

public class ACInvoker {

	private ACCommand command;

	public ACInvoker(ACCommand command) {
		this.command = command;
	}

	public void execute() {
		command.execute();
	}
}
