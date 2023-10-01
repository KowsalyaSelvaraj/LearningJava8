package anonymous.innerclass.as.methodargument.withthread;

public class ThreadWithRunableArgument {

	public static void main(String[] args) {

		//Instead of creating a separate class we are using method argument inside the constructor itself
		Thread thread = new Thread(new Runnable() {

			public void run() {
				for(int i=0;i<5;i++)
					System.out.println("Thread "+i+" is running");
			}
		});

		thread.start();


		//Normal way of implementing the class
		Child child = new Child();
		Thread thread1 = new Thread(child);

		thread1.start();
	}




}
