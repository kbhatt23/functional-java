package commanddesignpattern;

public class TurnOffAcCommand implements ACCommand{
	private AcReciever reciever;

	public TurnOffAcCommand(AcReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.turnOffAC();
	}

}
