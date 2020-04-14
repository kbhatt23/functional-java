package commanddesignpattern;

public class TurnOnAcCommand implements ACCommand{
	private AcReciever reciever;

	public TurnOnAcCommand(AcReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.turnOnAC();
	}

}
