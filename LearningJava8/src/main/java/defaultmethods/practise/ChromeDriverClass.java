package defaultmethods.practise;

public class ChromeDriverClass implements Browser{

	//implements defaultmethods.practise.Browser.browse
	public void browse() {
		System.out.println("Browse from Chrome Driver");
	}

	//overrides defaultmethods.practise.Browser.playMedia
	public void playMedia() {
		System.out.println("Chrome Browser Media Player");
	}

	public static void main(String[] args) {
		Browser chromeBrowser = new ChromeDriverClass();
		chromeBrowser.browse();
		chromeBrowser.playMedia();
	}
}
