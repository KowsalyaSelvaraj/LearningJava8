package defaultmethods.practise;

public class EdgeDriverClass implements Browser{

	public void browse() {
		System.out.println("Browse from Edge Driver");
		
	}
		
	public static void main(String[] args) {
		Browser edgeBrowser = new EdgeDriverClass();
		edgeBrowser.browse();
		edgeBrowser.playMedia();

	}

	

}
