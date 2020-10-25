package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentFilehipoo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://filehippo.com/");
		//using traversing
		driver.findElement(By.xpath("//a[contains(text(),'Popular ')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'VLC ')][1]/../..//span[.='Download']")).click();
		Thread.sleep(3000);		
		driver.close();
	}

}
