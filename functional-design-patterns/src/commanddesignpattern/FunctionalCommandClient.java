package commanddesignpattern;

public class FunctionalCommandClient {
public static void main(String[] args) {
	AcReciever reciever = new AcReciever();
	ACCommand turnon = () -> reciever.turnOnAC();
	
	ACInvoker invoker = new ACInvoker(turnon);
	invoker.execute();
	
ACCommand turnoff = () -> reciever.turnOffAC();
	
	ACInvoker invokeroff = new ACInvoker(turnoff);
	invokeroff.execute();
}
}
