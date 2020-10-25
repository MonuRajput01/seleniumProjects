package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnterURLChrome {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		/*step 1
		  driver.get("https://www.google.com");
		 */
		/*step 2 
		 driver.get("https://www.facebook.com"); */
		driver.navigate().to("https://www.amazon.com");
	
	}

}
