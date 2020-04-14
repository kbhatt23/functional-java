package commanddesignpattern;

public class ImperativeClient {
public static void main(String[] args) {
	AcReciever reciever = new AcReciever();
	ACCommand turnon = new TurnOnAcCommand(reciever);
	
	ACInvoker invoker = new ACInvoker(turnon);
	invoker.execute();
	
ACCommand turnoff = new TurnOffAcCommand(reciever);
	
	ACInvoker invokeroff = new ACInvoker(turnoff);
	invokeroff.execute();
}
}
