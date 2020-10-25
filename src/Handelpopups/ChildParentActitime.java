package Handelpopups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParentActitime {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		String winHandleBefore=driver.getWindowHandle();//store the current url
		driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).click();
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);//switch to new window
		}
		
		driver.findElement(By.xpath("//a[.='Try Free']")).click();//peform operations on new window
		System.out.println(driver.getTitle());//will get title of new  window
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("rajput");
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("akash1995@gmail.com");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("qspider");
		driver.close();//will close the new window
		driver.switchTo().window(winHandleBefore);//give control to old parent window
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();//will close parent window
	}
}
