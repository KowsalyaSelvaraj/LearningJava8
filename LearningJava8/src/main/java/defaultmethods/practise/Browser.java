package defaultmethods.practise;

public interface Browser {

	void browse();
	default void playMedia() {
		System.out.println("Common Browser Media Player");
	}
	
}
