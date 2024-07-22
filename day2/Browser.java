package week1.day2;

public class Browser {

	public String launchBrowser (String browserName) {
		return browserName;
	}
	public String loadUrl (String loadUrl) {
		return loadUrl;
	
	}
	
	public static void main(String[] args) {
 Browser so= new Browser();
 System.out.println(so.loadUrl("Application url loaded successfully"));
 System.out.println(so.launchBrowser("Browser launched successfully"));
	}

}
