package extraConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleInsecureWebsites {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("yaha pe url dalna insecure websites to wo open ho jayegi");

	}

}
