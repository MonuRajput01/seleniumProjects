package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPushNotifications {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
//we are pushing color notications don't show in browser assignment 1
		//ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--disable-notifications");
	//	WebDriver driver=new ChromeDriver(options);
		
	//	driver.get("https://skillrary.com");
		//driver.manage().window().maximize();
		//assignment 2 same working on redbus
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://redbus.com");
		driver.manage().window().maximize();
	}

}
