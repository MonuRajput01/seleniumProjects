package extraConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//default time is 30 sec it inthis time element is not loaded then go for 40 ,50..
driver.get("https://demo.actitime.com");

	}

}
