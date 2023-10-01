package functionalinterface.practise;

public interface SuzukiVehicle extends IDrivable{

	void start(); //implements functionalinterface.practise.IDrivable.start
	
	//As this Interface is not FI, on adding abstract methods it doesn't throws error. it works good 
	void stop();
	void applyBreak();
}
