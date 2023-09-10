package anonymous.innerclass.using.abstractclass;

import java.lang.reflect.Method;

public abstract class Parent {

	public void educate() {
		System.out.println("Provide education to Children");
	}

	public void asset() {
		System.out.println("Provide Asset to children");
	}	
	
	//As find partner will be found by my child iteself
	public abstract void findPartner();
}
