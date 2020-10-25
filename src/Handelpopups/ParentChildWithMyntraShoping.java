package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParentChildWithMyntraShoping {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://myntra.com");
		driver.manage().window().maximize();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//a[.='Offers']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Watches at Min 60%')]")).click();
	   driver.findElement(By.xpath("(//span[contains(text(),'wishlist')])[2]")).click();
	   driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9634791873");
	
	}

}
