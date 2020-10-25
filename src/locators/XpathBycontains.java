package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBycontains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		//xpath usingconatins(dynamic text)
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
		//xpath using contains (dynamic attriute values)
//driver.findElement(By.xpath("//input[contains(@placeholder,'Email address ')]")).sendKeys("akash@1995");
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();//partial text is used
		driver.quit();
		
	}

}
