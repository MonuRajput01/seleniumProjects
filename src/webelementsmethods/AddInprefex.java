package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddInprefex {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='First name']"));
username.sendKeys("priyanka");
      for(int i=0;i<8;i++) {
                      username.sendKeys(Keys.ARROW_LEFT);
                           }
      username.sendKeys("miss");
	}

}
