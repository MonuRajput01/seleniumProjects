package mouseOperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement forgotpassword=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		
            Actions act=new Actions(driver);
            act.contextClick(forgotpassword).perform();
            Robot r=new Robot();
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_ENTER);
	}

}
