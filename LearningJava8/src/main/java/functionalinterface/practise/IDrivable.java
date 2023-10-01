package functionalinterface.practise;

@FunctionalInterface
public interface IDrivable {

	//variables should be static final
	public static final String vehicleNo = "1235987";
	String chassisNumber = "5894LK65";
	
	void start();
	
	//Functional Interface can contain methods from Object Class
	int hashCode();
	boolean equals(Object obj);
	
}