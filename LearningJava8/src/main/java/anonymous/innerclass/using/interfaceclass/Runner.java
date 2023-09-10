package anonymous.innerclass.using.interfaceclass;

public class Runner {

	public static void main(String[] args) {
		IParent childParent = new IParent() {
			public void findPartner() {
				System.out.println("Child finds his/her partner by himself in interface class");
			}
		};

		// this method will call the above implementation
		childParent.findPartner(); 
		
		
		IParent parent = new Child(); //Parent parent1 = new Parent(); Cannot instantiate the type Parent as it is a interface
		
		parent.findPartner(); //calls from Child Class 
	}

}
