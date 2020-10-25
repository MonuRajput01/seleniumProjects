package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leavepopup2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Leave Types')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Create Leave Type')]")).click();
driver.findElement(By.xpath("//input[@id='leaveTypeLightBox_nameField']")).sendKeys("monuwork");
driver.findElement(By.xpath("(//span[.='Create Leave Type'])[2]")).click();
driver.findElement(By.xpath("(//td[@class='leaveTypeDeleteCell last'])[6]")).click();
Alert alt=driver.switchTo().alert();
alt.accept();
	}

}
