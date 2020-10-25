package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPopups {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//flipkart popups
		/*
		 * driver.get("https://flipkart.com");
		 * driver.findElement(By.xpath("//button[.='✕']")).click();
		 */
		//skillrary popups
		driver.get("https://skillrary.com");
		driver.findElement(By.xpath("//button[.='×']")).click();
	}

}
