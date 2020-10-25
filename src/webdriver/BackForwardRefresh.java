package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BackForwardRefresh {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		 driver.navigate().to("https://www.facebook.com"); 
		driver.navigate().to("https://www.amazon.com");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
	}
}
