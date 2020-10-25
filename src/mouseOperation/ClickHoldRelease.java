package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement forgotpassword=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
            Actions act=new Actions(driver);
            act.clickAndHold(forgotpassword).perform();
            Thread.sleep(5000);
            act.release(forgotpassword).perform();

	}

}
