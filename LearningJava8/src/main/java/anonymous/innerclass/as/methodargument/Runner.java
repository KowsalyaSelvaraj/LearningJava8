package anonymous.innerclass.as.methodargument;

public class Runner {

	public static void main(String[] args) {
		
	
		Friend friend = new Friend();
		
		//Normal way of calling a method
		//create a instance for the interface and pass that to canmanage. 
		IManagableChild child1 = new ChildImplementation();
		friend.canManage(child1);
		
		
		//passing anonymous inner class as method argument
		friend.canManage(new IManagableChild() {
			
			public void manageMarriage() {
				System.out.println("Straight ah avanga parents kaala vilunthuda vendiyathutha - method arguments");
			}

			public void manageFinance() {
				System.out.println("Finance - Bank a svings erukku atha vechi manage pannikalam - method arguments");
				
			}
		});
		
		
	}

}
