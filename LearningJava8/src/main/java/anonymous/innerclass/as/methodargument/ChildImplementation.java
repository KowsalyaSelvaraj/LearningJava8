package anonymous.innerclass.as.methodargument;

public class ChildImplementation implements IManagableChild{

	@Override
	public void manageMarriage() {
		System.out.println("Normal Implementation - Manage marriage by directly talking to partner's parents");
		
	}

	@Override
	public void manageFinance() {
		System.out.println("Normal Implementation - Manage Finance with savings");
		
	}

}
