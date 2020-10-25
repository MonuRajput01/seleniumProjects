package extraConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingchatbot {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//span[@id='corover-disha-caption']")).click();
		driver.switchTo().frame("corover-chat-frame");//control switch from parent page to frame 
		//to serach freame we use (//iframe) in html search bar
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("trains from noida");
		Robot r=new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
