package functionalinterface.practise;


@FunctionalInterface
public interface HundaiVehicle extends IDrivable{

	//Condition 1 : Child interface can contain the abstract method available in parent Drivable interface.
	void start();
	
	//Condition 2 : It can't have more methods as it is FI
	//Invalid '@FunctionalInterface' annotation; HundaiVehicle is not a functional interface
	//void stop();
	
}
