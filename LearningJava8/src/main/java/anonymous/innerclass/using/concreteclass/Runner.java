package anonymous.innerclass.using.concreteclass;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//anonymous inner class
		Parent child = new Parent() 
		{
			public void findPartner() {
				System.out.println("Ma Life Ma Rules in Child Class from anonymous inner class");
			}
		};
		
		child.educate();
		child.leaveAsset();
		child.findPartner(); // this method will call the above implementation
		
		//to call findPartner in Parent class 
		 Parent parent = new Parent();
			parent.findPartner();
	}

}
