package anonymous.innerclass.using.abstractclass;

public class Runner {

	public static void main(String[] args) {
		Parent childParent = new Parent() {
			public void findPartner() {
				System.out.println("Child finds his/her partner by himself in abstract class");
			}
		};

		//calls the method from parent abstract class
		childParent.educate();
		childParent.asset();
		childParent.findPartner(); // this method will call the above implementation
		
		Parent parent = new Child(); //Parent parent1 = new Parent(); Cannot instantiate the type Parent as it is a abstract class
		
		parent.findPartner();
	}

}
